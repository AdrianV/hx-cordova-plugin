package cordova.backend;

/**
 * ...
 * @author 
 */

class CustomServer
{

	var _callbackContext: CallbackContext;
	public var plugin(default, set): cordova.backend.PluginServer;
	
	public function new() {}
	
	function set_plugin(val: cordova.backend.PluginServer): cordova.backend.PluginServer {
		plugin = val;
		if (val != null) ready();
		return val;
	}
	
	public inline function call(func: haxe.Constraints.Function, args: Array<Dynamic>, ctx: CallbackContext): Void {
		_callbackContext = ctx;
		var data = Reflect.callMethod(this, func, args);
		if (_callbackContext == ctx && !ctx.isFinished() ) 
			success(data, ctx);
	}

	function success(data: Dynamic, ctx: CallbackContext) {
		var s = new haxe.Serializer();
		s.serialize(data);
		ctx.success(s.toString());		
	}
	
	function error(data: Dynamic, ctx: CallbackContext) {
		var s = new haxe.Serializer();
		s.serialize(data);
		ctx.error(s.toString());		
	}
	
	function popContext(): CallbackContext {
		var ctx = _callbackContext;
		_callbackContext = null;
		return ctx;
	}
	
	function ready() {}
	
}