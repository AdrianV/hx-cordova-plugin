package client;

class HaxeBackendApi extends haxe.remoting.AsyncProxy<backend.HaxeBackend> { }

class Main {

	var _cnx: haxe.remoting.AsyncConnection;
	public var api(default, null): HaxeBackendApi;
	function new() {
		_cnx = cordova.CordovaRemoting.connect("PluginServer");
		_cnx.setErrorHandler(function(err) { 
			trace(err);
		} );
		api = new HaxeBackendApi(_cnx);
		api.add(1, 2, function(result) {
			trace(result);
		});

	}

	static function onDeviceReady() {
		trace("I am ready now");
		
	}
	static function main(){
		js.Browser.document.addEventListener("ondeviceready", onDeviceReady, false);
	}
}