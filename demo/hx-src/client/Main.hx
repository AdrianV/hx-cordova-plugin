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
			whatsup = 'add(1,2) return $result';
			trace(result);
		});

	}

	static var app: Main;
	static var whatsup(get, set): String;
		inline static function get_whatsup() {
			var el = js.Browser.document.getElementById("whatsup");
			return el != null ? el.innerText : "";
		}

		inline static function set_whatsup(val) {
			var el = js.Browser.document.getElementById("whatsup");
			if (el != null) el.innerText = val;
			return el != null ? el.innerText : "";
		}

	static function onDeviceReady() {
		whatsup = "I am ready now";
		trace("I am ready now");
		app = new Main();	
	}
	static function main(){
		js.Browser.document.addEventListener("deviceready", onDeviceReady, false);
	}
}