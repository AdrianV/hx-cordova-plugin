// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package cordova.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Runner implements java.lang.Runnable
{
	public Runner(haxe.lang.Function dg)
	{
		//line 11 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\util\\Runner.hx"
		this._dg = dg;
	}
	
	
	public haxe.lang.Function _dg;
	
	public void run()
	{
		//line 16 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\util\\Runner.hx"
		if (( this._dg != null )) 
		{
			//line 16 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\util\\Runner.hx"
			this._dg.__hx_invoke0_o();
		}
		
	}
	
	
}


