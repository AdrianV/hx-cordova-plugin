package backend;


@:keep class Handler extends cordova.backend.PluginServer
{

	override function init() {
		addServer("PluginServer", new backend.HaxeBackend());
	}
	
}