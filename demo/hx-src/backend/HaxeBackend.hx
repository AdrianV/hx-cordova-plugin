package backend;

class HaxeBackend extends cordova.backend.CustomServer
{
	
	public function add(a: Int, b: Int): Null<Int> {
		var ctx = popContext();
		plugin.executeThreaded(function() {
			success(a + b, ctx);
		}); 
		return null;
	}
		
	

}