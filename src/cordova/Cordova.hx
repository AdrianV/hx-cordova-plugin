package cordova;


@:native("cordova") 
extern class Cordova 
{
	@:overload(function (success: String->Void, error: Dynamic->Void, service: String, action: String, param: Array<Dynamic>): Void { } )
	@:overload(function (success: Int->Void, error: Dynamic->Void, service: String, action: String, param: Array<Dynamic>): Void { } )
	@:overload(function (success: Void->Void, error: Dynamic->Void, service: String, action: String, param: Array<Dynamic>): Void { } )
	public static function exec(success: Dynamic->Void, error: Dynamic->Void, service: String, action: String, param: Array<Dynamic>): Void;
}