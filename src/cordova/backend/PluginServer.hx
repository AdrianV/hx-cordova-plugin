package cordova.backend;

#if java

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;

#elseif cs

import microsoft.phone.controls.WebBrowser;
import wpcordovaclasslib.cordova.commands.*;
import wpcordovaclasslib.cordova.json.JsonHelper;
import wpcordovaclasslib.cordova.*;
import wpcordovaclasslib.cordova.PluginResult.PluginResult_Status;

#end


@:nativeGen
class PluginServer 
#if java
	extends CordovaPlugin
#elseif cs
	extends BaseCommand
#end
{
	
	var objects : haxe.ds.StringMap<cordova.backend.CustomServer>;

	public function new() {
		super();
		objects = new haxe.ds.StringMap();
		init();
	}
	
	function init() { }
	
	public function addServer( name : String, server : cordova.backend.CustomServer) {
		objects.set(name, server);
		server.plugin = this;
	}

#if java	
	@:overload override public function execute(action: String, args: CordovaArgs, callbackContext: CallbackContext): Bool {
		switch (action) {
			case "echo": if ( ! args.isNull(0) ) {
				callbackContext.success(args.getString(0));
				return true;
			}
			case "hxr": if ( ! args.isNull(0) ) {
				handleRequest(args.getString(0), callbackContext);
				return true;
			}
		}
		return false;
	}
	
	
	inline function handleRequestOnUiThread(request: String, callbackContext: CallbackContext) {
		cordova.getActivity().runOnUiThread(new cordova.util.Runner(function() handleRequest(request, callbackContext)));
	}
	
	inline function handleRequestThreaded(request: String, callbackContext: CallbackContext) {
		cordova.getThreadPool().execute(new cordova.util.Runner(function() handleRequest(request, callbackContext)));
	}
	
	
#elseif cs
	private function getOptionStrings(options: String): Array<String>
	{
		try {
			return haxe.Json.parse(options);
		} catch (Exception: Dynamic)  {
			DispatchCommandResult(new PluginResult(PluginResult_Status.JSON_EXCEPTION), CurrentCommandCallbackId);
			return null;
		}
	}

	public function hxr(options: String): Void {
		var optStrings = getOptionStrings(options);
		handleRequest(optStrings[0], new CallbackContext(this, optStrings[1]));
		//var callbackId = optStrings[1];
		//new cordova.backend.CallbackContext(this, callbackId).success(optStrings[0]);
		//DispatchCommandResult(new PluginResult(PluginResult_Status.OK, optStrings[0]), callbackId );
	}

#end

	public function executeThreaded(func: Void->Void) {
		#if java
			cordova.getThreadPool().execute(new cordova.util.Runner(func));
		#elseif cs
			func();
		#end
	}

	/**
	this is a blocking request !
	
	for a request on UI Thread override this with:
	  override function handleRequest(request: String, callbackContext: CallbackContext) handleRequestOnUiThread(request, callbackContext);
	  
	for a threaded request using the thread pool override this with:
	  override function handleRequest(request: String, callbackContext: CallbackContext) handleRequestThreaded(request, callbackContext);
	 **/ 
	function handleRequest(request: String, callbackContext: CallbackContext) {
		try {
			var u = new haxe.Unserializer(request);
			var path: Array<String> = u.unserialize();
			if( path.length != 2 ) throw "Invalid path '"+path.join(".")+"'";
			var o = objects.get(path[0]);
			if( o == null )
				throw "No such object " + path[0];
			var m = Reflect.field(o,path[1]);
			if( !Reflect.isFunction(m) )
				throw "No such method "+path.join(".");			
			var args = u.unserialize();
			o.call(m, args, callbackContext);
		} catch ( e : Dynamic ) {
			trace(Std.string(e));
			trace(haxe.CallStack.toString(haxe.CallStack.exceptionStack()));
			var s = new haxe.Serializer();
			s.serializeException(e);
			callbackContext.success(s.toString());
			//return s.toString();
		}
	}
	
}