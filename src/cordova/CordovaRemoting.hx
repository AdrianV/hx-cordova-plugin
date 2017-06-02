package cordova;

/**
 * ...
 * @author 
 */

import haxe.remoting.AsyncConnection;
import haxe.remoting.Context;
 
class CordovaRemoting 
#if js
	implements AsyncConnection implements Dynamic<AsyncConnection>
#end
{
	var _data : { plug : String, error : Dynamic -> Void };
	var _path : Array<String>;

	
	#if js
	
	inline function new(data, path) 
	{
		_data = data;
		_path = path;
	}
	
	public function resolve( name ) : AsyncConnection {
		var c = new CordovaRemoting(_data,_path.copy());
		c._path.push(name);
		return c;
	}	
	
	function error(e) {
		if (_data.error != null) _data.error(e)
		else trace(e);
	}
	
	public function call( params : Array<Dynamic>, ?onResult : Dynamic -> Void ) {
		var s = new haxe.Serializer();
		s.serialize(_path);
		s.serialize(params);
		
		phonegap.Cordova.exec(
			function( response : Dynamic ) {
				function invalidResponse() throw "Invalid response : '" + response+"'";
				if (!Std.is(response, String)) invalidResponse();
				var ok = true;
				var ret;
				try {
					var s = new haxe.Unserializer(response);
					ret = s.unserialize();
				} catch( err : Dynamic ) {
					ret = null;
					ok = false;
					error(err);
				}
				if( ok && onResult != null ) onResult(ret);
			},
			error,
			_data.plug,
			"hxr",
			[s.toString()]
		);
	}

	public function setErrorHandler( error : Dynamic -> Void ) : Void {
		_data.error = error;
	}
	
	public static function connect( plugName : String, ? onError: Dynamic->Void) 
	{
		var cnx = new CordovaRemoting({ plug : plugName, error : onError },[plugName]);
		return cnx;
	}
	
	#end
	
}