// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package cordova.backend;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PluginServer_handleRequestOnUiThread_61__Fun extends haxe.lang.Function
{
	public PluginServer_handleRequestOnUiThread_61__Fun(java.lang.String request, org.apache.cordova.CallbackContext callbackContext, cordova.backend.PluginServer _gthis)
	{
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		super(0, 0);
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.request = request;
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.callbackContext = callbackContext;
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this._gthis = _gthis;
	}
	
	
	@Override public java.lang.Object __hx_invoke0_o()
	{
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this._gthis.handleRequest(this.request, this.callbackContext);
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		return null;
	}
	
	
	public java.lang.String request;
	
	public org.apache.cordova.CallbackContext callbackContext;
	
	public cordova.backend.PluginServer _gthis;
	
}


