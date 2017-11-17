package;

/**
 * ...
 * @author 
 */

import sys.FileSystem;
import haxe.io.Path;

typedef FileInfo = {
	name: String,	
	? md5: haxe.io.Bytes,
	? proccessed: Bool,
}

typedef DirDiffResult = {
	source: String,
	dest: String,
	same: Array<FileInfo>,
	diff: Array<FileInfo>,
	missing: Array<FileInfo>,
	extra: Array<FileInfo>,
}

typedef SimpleXmlMatch = {
	name: String,
	? value: String,
	? context: String,
	match: SimpleXmlMatch->Xml->Bool,
}

typedef IEnvironment = {
	public function get(key: String): String;
}

class SysEnvironment {
	static var __env: Map<String,String>;
	
	public function new() {
		if (__env == null) __env = Sys.environment();
	}
	
	public function get(key: String): String return __env.get(key);
	
}

class DefaultEnvironment {
	
	public function new() {}
	
	public function get(key: String): String {
		switch(key) {
			case "<": return "<";
			case ">": return "<";
			case "AppPath": return Sys.programPath();
			case "cwd": return Sys.getCwd();
			default: return null;
		}
	}
	
}

typedef QueryString = { pre: String, query: String, post: String}

private class EnvironmentStringImpl{
	
	public var _env: IEnvironment;
	public var _val: QueryString;
	
	public function new(env: IEnvironment, val: QueryString) {
		_env = env;
		_val = val;
	}
	
	public inline function get(key: String): String  {
		return _env != null ? _env.get(key) : key;
	}
	
}

abstract EnvironmentString(EnvironmentStringImpl) from EnvironmentStringImpl to EnvironmentStringImpl {
	
	public inline function new(v: String) this = fromString(v);
	
	static function getEnv(name: String): IEnvironment {
		switch(name) {
			case "", "env": return new SysEnvironment();
			default: return null;
		}
	}
	
	@:from static function fromString(data: String): EnvironmentString {
		var qy = split(data);
		if (qy.query != "") {
			var ienv = idx(qy.query, ":");
			if (ienv > 0) {
				var env = qy.query.substring(0, ienv);
				qy.query = qy.query.substring(ienv + 1);
				return new EnvironmentStringImpl(getEnv(env), qy);
			}
			return new EnvironmentStringImpl(new DefaultEnvironment(), qy);
		}
		return new EnvironmentStringImpl(null, qy);
	}
	
	@:to function toString(): String {
		var sb = new StringBuf();
		sb.add(this._val.pre);
		if (this._val.query != "") {
			var idef = idx(this._val.query, "|");
			var qys: EnvironmentString = idef >= 0 ? this._val.query.substring(0, idef) : this._val.query;
			var val = this._env.get(qys.toString());
			if (val != null) {
				sb.add(val);
			} else if (idef >= 0) {
				qys = this._val.query.substring(idef + 1);
				sb.add(qys.toString());
			}
		}
		if (this._val.post != "")
			sb.add(new EnvironmentString(this._val.post).toString());
		return sb.toString();
	}

	static function brackets(data: String, start: Int = 0): {start: Int, end: Int} {
		var istart = data.indexOf("{", start);
		if (istart < 0) return { start: -1, end: -1 };
		var iclose = data.indexOf("}", istart + 1);
		if (iclose < 0) return { start: -1, end: -1 }; // malformed
		var inext = data.indexOf("{", istart + 1);
		while (inext >= 0 && inext < iclose) {
			iclose = data.indexOf("}", iclose + 1);
			if (iclose < 0) return { start: -1, end: -1 }; // malformed
			inext = data.indexOf("{", inext + 1);
		}
		return { start: istart, end: iclose }; 
	}
	
	static function split(data: String): QueryString {
		var br = brackets(data);
		if (br.start < br.end) 
			return { pre: data.substring(0, br.start), 
							query: data.substring(br.start + 1, br.end), 
							post: data.substring(br.end + 1)};
		return { pre: data, query: "", post: "" };
	}
	
	static function idx(data: String, pat: String): Int {
		var br = brackets(data);
		var res = data.indexOf(pat);
		while (br.start < br.end && br.start < res) {
			res = data.indexOf(pat, br.end + 1);
			br = brackets(data, br.end + 1);
		}
		return res;
	}
	
}

class SimpleXmlMatcher {
	static function matchNodeName(data: SimpleXmlMatch, xml: Xml): Bool return xml.nodeType == Xml.Element && xml.nodeName == data.name;
	static function matchAttrName(data: SimpleXmlMatch, xml: Xml): Bool return xml.nodeType == Xml.Element && xml.get(data.name) != null;
	static function matchAttrEqual(data: SimpleXmlMatch, xml: Xml): Bool return xml.nodeType == Xml.Element && xml.get(data.name) == data.value;
	
	var _test: Array<SimpleXmlMatch>;
	public function new(query: String) {
		var i = query.indexOf("[");
		if (i >= 0) {
			_test = new Array();
			if (i > 0) _test.push( { name: query.substring(0, i), match: matchNodeName } );
			while (i >= 0) {
				i++;
				var ii = query.indexOf("]", i);
				inline function next() {
					i = query.indexOf("[", ii + 1);
				}
				if (ii < i) throw 'missing ] in $query';
				if (ii == i) {
					next();
					continue;
				}
				var q1 = query.substring(i, ii);
				var x = q1.indexOf("=");
				if (x >= 0) {
					_test.push({ name: q1.substring(0, x), value: q1.substring(x+1) ,match: matchAttrEqual } );
					next();
					continue;
				}
				_test.push({ name: q1 ,match: matchAttrName } );
				next();				
			}
		} else {
			_test = [{name: query, match: matchNodeName}];
		}
	}
	
	public function run(xml: Xml): Bool {
		for (t in _test) {
			if (! t.match(t, xml)) return false;
		}
		return true;
	}
}

class BuildTool 
{
	
	static function getAllDirs(path: String): Array<String> {
		path = FileSystem.absolutePath(path);
		var result = new Array();
		function process(current: String) {
			result.push(current);
			var dir = FileSystem.readDirectory(current);
			dir.sort(function(a,b) return Reflect.compare(a.toLowerCase(), b.toLowerCase()));
			for (f in dir) {
				var ffull = Path.addTrailingSlash(current) + f;
				if (FileSystem.isDirectory(ffull)) 
					process(ffull);
			}
		}
		process(path);
		return result;
	}
	
	static function getAllFiles(dirs:Array<String>, ? withMD5: Bool = false): Array<FileInfo> {
		var result = new Array();
		for (d in dirs) {
			var dir = FileSystem.readDirectory(d);
			dir.sort(function(a,b) return Reflect.compare(a.toLowerCase(), b.toLowerCase()));
			for (f in dir) {
				var ffull = Path.addTrailingSlash(d) + f;
				if ( ! FileSystem.isDirectory(ffull)) {
					var fi: FileInfo = { name: ffull };
					if (withMD5) 
						fi.md5 = haxe.crypto.Md5.make(sys.io.File.getBytes(ffull));
					result.push( fi );
				}
			}
		}
		return result;
	}
	
	static function compareDirectories(source: String, destination: String): DirDiffResult {
		source = FileSystem.absolutePath(source);
		destination = FileSystem.absolutePath(destination);
		var result = {
			source: source,
			dest: destination,
			same: new Array<FileInfo>(),
			diff: new Array<FileInfo>(),
			missing: new Array<FileInfo>(),
			extra: new Array<FileInfo>(),
		}
		trace('check source files in $source');
		var sfiles = getAllFiles(getAllDirs(source), true);
		trace('check destination in $destination');
		var dfiles = getAllFiles(getAllDirs(destination), true);
		var dmap = new Map<String,FileInfo>();
		for (el in dfiles) {
			var name = StringTools.replace(el.name.substr(destination.length).toLowerCase(), "/", "\\");
			trace('add $name');
			dmap.set(name, el);
		}
		for (el in sfiles) {
			var name = StringTools.replace(el.name.substr(source.length).toLowerCase(), "/", "\\");
			trace('search $name');
			var dest = dmap.get(name);
			if (dest == null) result.missing.push(el);
			else {
				dest.proccessed = true;
				if (dest.md5.compare(el.md5) != 0) result.diff.push(el)
				else result.same.push(el);
			}
		}
		for (el in dfiles) {
			if (!el.proccessed) result.extra.push(el);
		}
		return result;
	}
	
	static function oldTest() {
		var arg = Sys.args();
		var dir = arg.length > 0 ? arg[0] : "blah";
		trace(dir);
		var test = getAllDirs(dir);
		trace(test);
		var files = getAllFiles(test, true);
		trace(files);
		if (arg.length >= 2) {
			var diff = compareDirectories(dir, arg[1]);
			Sys.println("Same Files:");
			for (el in diff.same) {
				Sys.println(' == ${el.name}');
			}
			Sys.println("Different Files:");
			for (el in diff.diff) {
				Sys.println(' != ${el.name}');
			}
			Sys.println("Missing Files:");
			for (el in diff.missing) {
				Sys.println(' ++ ${el.name}');
			}
			Sys.println("Extra Files:");
			for (el in diff.extra) {
				Sys.println(' -- ${el.name}');
			}
		}		
	}

	static function xmlLastChild(xml: Xml): Xml {
		var result: Xml = null;
		for (x in xml) result = x;
		return result;
	}
	
	static function deleteFiles(act: haxe.xml.Fast, diff: DirDiffResult) {
		var ext = act.att.extension;
		if (ext == null || ext == "") throw "no extension specified for delete";
		ext = ext.toLowerCase();
		var skipDirs = [];
		if (act.has.skip) {
			var skip = act.att.skip;
			if (skip != null && skip != "") {
				skipDirs = skip.split(",");
			}
		}
		function del(name: String): Bool {
			for (dir in skipDirs) {
				var path = Path.addTrailingSlash(Path.addTrailingSlash(diff.dest) + StringTools.trim(dir));
				if (StringTools.startsWith(name, path)) return false;
			}
			return Path.extension(name).toLowerCase() == ext;
		}
		for (el in diff.extra) {
			if (del(el.name)) {
				trace('delete file ${el.name}');
				FileSystem.deleteFile(el.name);
			}
		}		
	}
	
	static function loadSyncFile(name: String) {
		var xml = new haxe.xml.Fast(Xml.parse(sys.io.File.getContent(name)).firstElement());
		inline function get(n, err) {
			if (n != null) return n;
			throw err;
		}
		var source: String = new EnvironmentString(get(xml.node.source, "source is missing").att.name);
		var destination: String = new EnvironmentString(get(xml.node.destination, "destination is missing").att.name);
		var dest = destination;
		var drootNode = xml.node.dest_root;
		var droot: String = new EnvironmentString(drootNode != null ? drootNode.att.name : "");
		if (drootNode != null && ! FileSystem.exists(droot)) {
			trace('directory $droot does not exist');
			return;
		}
		if ( ! Path.isAbsolute(dest) && droot != "") dest = Path.addTrailingSlash(droot) + dest;
		source = FileSystem.absolutePath(source);
		dest = FileSystem.absolutePath(dest);
		if ( ! FileSystem.exists(source) || ! FileSystem.isDirectory(source) ) throw '$source is not a directory';
		if ( ! FileSystem.exists(dest)) {
			trace('create directory $dest');
			FileSystem.createDirectory(dest);
		};
		if ( ! FileSystem.isDirectory(dest)) throw '$dest is not a directory';
		var diff = compareDirectories(source, dest);
		source = Path.addTrailingSlash(source);
		dest = Path.addTrailingSlash(dest);
		destination = Path.addTrailingSlash(destination);
		function processXml(pro: Xml, path: Array<String>, attr: String, insert: Xml->FileInfo->Void ): Bool {
			var changed = false;
			trace(path);
			var all = diff.same.copy();
			for (a in diff.diff) all.push(a);
			for (a in diff.missing) all.push(a);
			var smap = new Map<String, FileInfo>();
			var dlow = destination.toLowerCase();
			for (a in all) {
				var name = StringTools.replace(destination + a.name.substr(source.length), "/", "\\");
				smap.set(name.toLowerCase(), { name:name } );
				trace(name);
			}
			var p = -1;
			var insertPath = new Array<Xml>();
			insertPath[path.length - 1] = null;
			var matcher = new Array<SimpleXmlMatcher>();
			for (q in path) matcher.push(new SimpleXmlMatcher(q));
			var insertNode: Xml = null;
			var insertPrefered = false;
			function processElement(xel: Xml) {
				p++;
				if (p < path.length) {
					var remove = new Array<Xml>();
					for (x in xel.elements()) {
						if ( matcher[p].run(x) ) {
							insertPath[p] = x;
							trace(x.nodeName);
							if (p < path.length -1) {
								processElement(x);
							} else {
								if (insertNode == null) insertNode = xel;
								var val = x.get(attr);
								if (StringTools.startsWith(val.toLowerCase(), dlow)) {
									if ( ! insertPrefered) {
										insertNode = xel;
										insertPrefered = true;
									}
									trace(val);
									var info = smap.get(val.toLowerCase());
									if (info == null) {
										trace('remove $val');
										remove.push(x);
									} else {
										info.proccessed = true;
									}
								}
							}
						}
					}
					for (x in remove) {
						changed = true;
						xel.removeChild(x);
					}
				}
				p--;
			}
			processElement(pro);	
			if (insertNode == null && path.length > 1) {
				insertNode = insertPath[path.length -2];
			}
			if (insertNode != null) {
				for (a in smap) {
					if (a.proccessed) continue;
					changed = true;
					insert(insertNode, a);
				}
			} else {
				trace("no node for insert found");
			}
			return changed;
		}
		
		for (act in xml.nodes.actions.first().elements) {
			trace(act.name);
			switch(act.name) {
				case "copy": {
					function copy(files: Array<FileInfo>) {
						for (el in files) {
							var dpath = dest + el.name.substr(source.length);
							var p = Path.directory(dpath);
							if ( ! FileSystem.exists(p)) {
								trace('create dir $p');
								FileSystem.createDirectory(p);
							}
							trace('copy ${el.name} => $dpath');
							sys.io.File.copy(el.name, dpath);
						}
					}
					copy(diff.diff);
					copy(diff.missing);
				}
				case "delete": {
					deleteFiles(act, diff);
				}
				case "csproj": {
					var pfile = Path.addTrailingSlash(droot) + act.att.name;
					if ( ! FileSystem.exists(pfile)) throw '$pfile does not exist';
					var proxml = Xml.parse(sys.io.File.getContent(pfile));
					var changed = processXml(proxml, ['Project', 'ItemGroup', 'Compile'], 'Include', function(x, inf) {
						trace("add " + inf.name);
						var last = xmlLastChild(x);
						if (last == null || last.nodeType != Xml.PCData) x.addChild(Xml.createPCData("\n  "));
						else last.nodeValue = "\n  ";
						var el = Xml.createElement("Compile");
						el.set("Include", inf.name);
						x.addChild(el);
						x.addChild(Xml.createPCData("\n"));
					});
					if (changed) {
						sys.io.File.saveContent(pfile, proxml.toString());
						//sys.io.File.saveContent(pfile, xmlTools.XmlPrinter.print(proxml, false));
					}
				}
				case "plugin": {
					var pfile = Path.addTrailingSlash(droot) + act.att.name;
					if ( ! FileSystem.exists(pfile)) throw '$pfile does not exist';
					var proxml = Xml.parse(sys.io.File.getContent(pfile));
					var platform = act.att.platform;
					var changed = processXml(proxml, ['plugin', 'platform[name=$platform]', 'source-file'], 'src', function(x, inf) {
						trace("add " + inf.name);
						x.addChild(Xml.createPCData("\n"));
						var el = Xml.createElement("source-file");
						el.set("src", inf.name);
						switch (platform) {
							case "android" :
								var dir = Path.directory(inf.name);
								el.set("target-dir", "src\\" + dir.substr(destination.length));
								
						}
						x.addChild(el);
					});
					//trace(proxml.toString());
					if (changed) {
						//sys.io.File.saveContent(pfile, proxml.toString());						
						sys.io.File.saveContent(pfile, xmlTools.XmlPrinter.print(proxml, false));
					}
				}
				
			}
		}
	}
	
	static function main() 
	{
		var arg = Sys.args();
		for (a in arg) {
			if (StringTools.startsWith(a, "--")) {
				switch(a) {
					case "--quiet":
						haxe.Log.trace = function(v: Dynamic, ? p) {}
				}
			}
		}
		for (a in arg) {
			if (StringTools.startsWith(a, "--")) continue;
			if (FileSystem.exists(a))
				loadSyncFile(a);
		}
	}
	
}