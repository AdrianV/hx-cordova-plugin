package cordova.backend;


#if java
typedef CallbackContext = org.apache.cordova.CallbackContext;

#elseif cs

@:nativeGen
class CallbackContext {
	var _cmd: wpcordovaclasslib.cordova.commands.BaseCommand;
	var _id:String;
	var _finished: Bool;
	
	public function new(cmd, id) {
		this._cmd = cmd;
		this._id = id;
		this._finished = false;
	}
	
	public function success(data: String) {
		_finished = true;
		_cmd.DispatchCommandResult(new wpcordovaclasslib.cordova.PluginResult(wpcordovaclasslib.cordova.PluginResult.PluginResult_Status.OK, data), _id );
	}
	
	public inline function isFinished() return _finished;
}
#end
