// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package cordova.backend;

import haxe.root.*;
import cordova.backend.PluginServer_handleRequestThreaded_65__Fun;
import cordova.backend.PluginServer_handleRequestOnUiThread_61__Fun;
import cordova.util.Runner;
import cordova.backend.PluginServer;
import cordova.backend.CustomServer;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PluginServer extends org.apache.cordova.CordovaPlugin
{
	public PluginServer()
	{
		//line 32 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		super();
		//line 33 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.objects = new haxe.ds.StringMap<CustomServer>();
		//line 34 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.init();
	}
	
	
	public haxe.ds.StringMap<CustomServer> objects;
	
	public void init()
	{
	}
	
	
	public void addServer(java.lang.String name, CustomServer server)
	{
		//line 40 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.objects.set(name, server);
		//line 41 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		server.set_plugin(this);
	}
	
	
	@Override public boolean execute(java.lang.String action, org.apache.cordova.CordovaArgs args, org.apache.cordova.CallbackContext callbackContext)
	{
		//line 45 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		try 
		{
			//line 46 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			{
				//line 46 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				java.lang.String __temp_svar1 = (action);
				//line 46 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				switch (__temp_svar1.hashCode())
				{
					case 3107365:
					{
						//line 47 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
						if (__temp_svar1.equals("echo")) 
						{
							//line 47 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
							if ( ! (args.isNull(((int) (0) ))) ) 
							{
								//line 48 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
								callbackContext.success(haxe.lang.Runtime.toString(args.getString(((int) (0) ))));
								//line 49 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
								return true;
							}
							
						}
						
						//line 47 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
						break;
					}
					
					
					case 103778:
					{
						//line 51 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
						if (__temp_svar1.equals("hxr")) 
						{
							//line 51 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
							if ( ! (args.isNull(((int) (0) ))) ) 
							{
								//line 52 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
								this.handleRequest(args.getString(((int) (0) )), callbackContext);
								//line 53 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
								return true;
							}
							
						}
						
						//line 51 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 56 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			return false;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 45 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public final void handleRequestOnUiThread(java.lang.String request, org.apache.cordova.CallbackContext callbackContext)
	{
		//line 60 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		PluginServer _gthis = this;
		//line 61 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.cordova.getActivity().runOnUiThread(((java.lang.Runnable) (new Runner(new PluginServer_handleRequestOnUiThread_61__Fun(request, callbackContext, _gthis))) ));
	}
	
	
	public final void handleRequestThreaded(java.lang.String request, org.apache.cordova.CallbackContext callbackContext)
	{
		//line 64 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		PluginServer _gthis = this;
		//line 65 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.cordova.getThreadPool().execute(((java.lang.Runnable) (new Runner(new PluginServer_handleRequestThreaded_65__Fun(request, callbackContext, _gthis))) ));
	}
	
	
	public void executeThreaded(haxe.lang.Function func)
	{
		//line 92 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		this.cordova.getThreadPool().execute(((java.lang.Runnable) (new Runner(func)) ));
	}
	
	
	public void handleRequest(java.lang.String request, org.apache.cordova.CallbackContext callbackContext)
	{
		//line 108 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		try 
		{
			//line 109 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			haxe.Unserializer u = new haxe.Unserializer(haxe.lang.Runtime.toString(request));
			//line 110 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			haxe.root.Array<java.lang.String> path = ((haxe.root.Array<java.lang.String>) (u.unserialize()) );
			//line 111 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			if (( path.length != 2 )) 
			{
				//line 111 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				throw haxe.lang.HaxeException.wrap(( ( "Invalid path \'" + path.join(".") ) + "\'" ));
			}
			
			//line 112 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			CustomServer o = ((CustomServer) (this.objects.get(path.__get(0))) );
			//line 113 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			if (( o == null )) 
			{
				//line 114 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				throw haxe.lang.HaxeException.wrap(( "No such object " + path.__get(0) ));
			}
			
			//line 115 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			java.lang.Object m = haxe.root.Reflect.field(o, path.__get(1));
			//line 116 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			if ( ! (haxe.root.Reflect.isFunction(m)) ) 
			{
				//line 117 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				throw haxe.lang.HaxeException.wrap(( "No such method " + path.join(".") ));
			}
			
			//line 118 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			haxe.root.Array args = ((haxe.root.Array) (u.unserialize()) );
			//line 119 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			{
				//line 119 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				o._callbackContext = callbackContext;
				//line 119 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				java.lang.Object data = haxe.root.Reflect.callMethod(o, m, args);
				//line 119 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				if (( ( o._callbackContext == callbackContext ) &&  ! (callbackContext.isFinished())  )) 
				{
					//line 119 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
					o.success(data, callbackContext);
				}
				
			}
			
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 108 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 120 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			java.lang.Object realException = ( (( catchallException instanceof haxe.lang.HaxeException )) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 120 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
			{
				//line 120 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				java.lang.Object e = realException;
				//line 121 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, haxe.root.Std.string(e), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"cordova.backend.PluginServer", "PluginServer.hx", "handleRequest"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (121) )) )}));
				//line 122 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				haxe.Log.trace.__hx_invoke2_o(0.0, haxe.CallStack.toString(haxe.CallStack.exceptionStack()), 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"cordova.backend.PluginServer", "PluginServer.hx", "handleRequest"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (122) )) )}));
				//line 123 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				haxe.Serializer s = new haxe.Serializer();
				//line 124 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				s.serializeException(e);
				//line 125 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
				callbackContext.success(haxe.lang.Runtime.toString(s.toString()));
			}
			
		}
		
		
	}
	
	
}


