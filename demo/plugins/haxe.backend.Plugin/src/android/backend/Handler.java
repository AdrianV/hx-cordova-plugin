// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package backend;

import haxe.root.*;
import cordova.backend.CustomServer;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Handler extends cordova.backend.PluginServer implements haxe.lang.IHxObject
{
	public Handler(haxe.lang.EmptyObject empty)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		super();
	}
	
	
	public Handler()
	{
		//line 31 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\PluginServer.hx"
		super();
	}
	
	
	@Override public void init()
	{
		//line 8 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		this.addServer("PluginServer", new backend.HaxeBackend());
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		if (isCheck) 
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			if (throwErrors) 
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found."));
			}
			else
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		if (throwErrors) 
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Field not found or incompatible field type."));
		}
		else
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing."));
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		throw new java.lang.RuntimeException(haxe.lang.Runtime.toString("Cannot access field for writing or incompatible type."));
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			switch (field.hashCode())
			{
				case 1989861112:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("preferences")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						this.preferences = ((org.apache.cordova.CordovaPreferences) (value) );
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return value;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1659648748:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("objects")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						this.objects = ((haxe.ds.StringMap<CustomServer>) (value) );
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return value;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 954757884:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("cordova")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						this.cordova = ((org.apache.cordova.CordovaInterface) (value) );
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return value;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1223471129:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("webView")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						this.webView = ((org.apache.cordova.CordovaWebView) (value) );
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return value;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
			}
			
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			switch (field.hashCode())
			{
				case 1989861112:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("preferences")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return this.preferences;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 3237136:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("init")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "init")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 954757884:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("cordova")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return this.cordova;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1659648748:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("objects")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return this.objects;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1223471129:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("webView")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return this.webView;
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -12986556:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("addServer")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "addServer")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -107215501:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("privateInitialize")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "privateInitialize")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1319569547:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("execute")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "execute")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 871091088:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("initialize")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "initialize")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -267846812:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("handleRequestOnUiThread")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "handleRequestOnUiThread")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1772752093:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("pluginInitialize")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "pluginInitialize")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -946320240:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("handleRequestThreaded")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "handleRequestThreaded")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1726126506:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("getServiceName")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getServiceName")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -9906498:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("executeThreaded")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "executeThreaded")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1340212393:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onPause")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onPause")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1673289543:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("handleRequest")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "handleRequest")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1463983852:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onResume")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onResume")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -568952164:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onRequestPermissionResult")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onRequestPermissionResult")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1336895037:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onStart")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onStart")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1032698580:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("hasPermisssion")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasPermisssion")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1012956543:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onStop")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onStop")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1669188213:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("requestPermissions")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "requestPermissions")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -918269635:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onNewIntent")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onNewIntent")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1356972381:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onConfigurationChanged")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onConfigurationChanged")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1401315045:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onDestroy")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onDestroy")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1447073280:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onReceivedClientCertRequest")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onReceivedClientCertRequest")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1491459488:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onSaveInstanceState")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onSaveInstanceState")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 576014623:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onReceivedHttpAuthRequest")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onReceivedHttpAuthRequest")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -416303309:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onRestoreStateForActivityResult")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onRestoreStateForActivityResult")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1338248528:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onReset")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onReset")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -2003762904:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onMessage")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onMessage")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 320320687:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("fromPluginUri")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "fromPluginUri")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1656256565:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onActivityResult")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onActivityResult")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1859246334:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("toPluginUri")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toPluginUri")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1916979289:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("shouldAllowRequest")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shouldAllowRequest")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -338704115:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("handleOpenForRead")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "handleOpenForRead")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 375515146:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("shouldAllowNavigation")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shouldAllowNavigation")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -525945245:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("remapUri")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "remapUri")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -1148521789:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("shouldAllowBridgeAccess")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shouldAllowBridgeAccess")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case 1027203576:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("onOverrideUrlLoading")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "onOverrideUrlLoading")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
				case -48625977:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (field.equals("shouldOpenExternalUrl")) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "shouldOpenExternalUrl")) );
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
			}
			
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		{
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			int __temp_hash2 = field.hashCode();
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			boolean __temp_executeDef1 = true;
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			switch (__temp_hash2)
			{
				case -107215501:
				case 871091088:
				case -1772752093:
				case 1726126506:
				case -1340212393:
				case 1463983852:
				case -1336895037:
				case -1012956543:
				case -918269635:
				case -1401315045:
				case -1491459488:
				case -416303309:
				case -2003762904:
				case -1656256565:
				case 1916979289:
				case 375515146:
				case -1148521789:
				case -48625977:
				case 1027203576:
				case -525945245:
				case -338704115:
				case 1859246334:
				case 320320687:
				case -1338248528:
				case 576014623:
				case 1447073280:
				case 1356972381:
				case 1669188213:
				case 1032698580:
				case -568952164:
				case 1673289543:
				case -9906498:
				case -946320240:
				case -267846812:
				case -1319569547:
				case -12986556:
				case 3237136:
				{
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					if (( (( ( __temp_hash2 == -107215501 ) && field.equals("privateInitialize") )) || ( (( ( __temp_hash2 == 871091088 ) && field.equals("initialize") )) || ( (( ( __temp_hash2 == -1772752093 ) && field.equals("pluginInitialize") )) || ( (( ( __temp_hash2 == 1726126506 ) && field.equals("getServiceName") )) || ( (( ( __temp_hash2 == -1340212393 ) && field.equals("onPause") )) || ( (( ( __temp_hash2 == 1463983852 ) && field.equals("onResume") )) || ( (( ( __temp_hash2 == -1336895037 ) && field.equals("onStart") )) || ( (( ( __temp_hash2 == -1012956543 ) && field.equals("onStop") )) || ( (( ( __temp_hash2 == -918269635 ) && field.equals("onNewIntent") )) || ( (( ( __temp_hash2 == -1401315045 ) && field.equals("onDestroy") )) || ( (( ( __temp_hash2 == -1491459488 ) && field.equals("onSaveInstanceState") )) || ( (( ( __temp_hash2 == -416303309 ) && field.equals("onRestoreStateForActivityResult") )) || ( (( ( __temp_hash2 == -2003762904 ) && field.equals("onMessage") )) || ( (( ( __temp_hash2 == -1656256565 ) && field.equals("onActivityResult") )) || ( (( ( __temp_hash2 == 1916979289 ) && field.equals("shouldAllowRequest") )) || ( (( ( __temp_hash2 == 375515146 ) && field.equals("shouldAllowNavigation") )) || ( (( ( __temp_hash2 == -1148521789 ) && field.equals("shouldAllowBridgeAccess") )) || ( (( ( __temp_hash2 == -48625977 ) && field.equals("shouldOpenExternalUrl") )) || ( (( ( __temp_hash2 == 1027203576 ) && field.equals("onOverrideUrlLoading") )) || ( (( ( __temp_hash2 == -525945245 ) && field.equals("remapUri") )) || ( (( ( __temp_hash2 == -338704115 ) && field.equals("handleOpenForRead") )) || ( (( ( __temp_hash2 == 1859246334 ) && field.equals("toPluginUri") )) || ( (( ( __temp_hash2 == 320320687 ) && field.equals("fromPluginUri") )) || ( (( ( __temp_hash2 == -1338248528 ) && field.equals("onReset") )) || ( (( ( __temp_hash2 == 576014623 ) && field.equals("onReceivedHttpAuthRequest") )) || ( (( ( __temp_hash2 == 1447073280 ) && field.equals("onReceivedClientCertRequest") )) || ( (( ( __temp_hash2 == 1356972381 ) && field.equals("onConfigurationChanged") )) || ( (( ( __temp_hash2 == 1669188213 ) && field.equals("requestPermissions") )) || ( (( ( __temp_hash2 == 1032698580 ) && field.equals("hasPermisssion") )) || ( (( ( __temp_hash2 == -568952164 ) && field.equals("onRequestPermissionResult") )) || ( (( ( __temp_hash2 == 1673289543 ) && field.equals("handleRequest") )) || ( (( ( __temp_hash2 == -9906498 ) && field.equals("executeThreaded") )) || ( (( ( __temp_hash2 == -946320240 ) && field.equals("handleRequestThreaded") )) || ( (( ( __temp_hash2 == -267846812 ) && field.equals("handleRequestOnUiThread") )) || ( (( ( __temp_hash2 == -1319569547 ) && field.equals("execute") )) || ( (( ( __temp_hash2 == -12986556 ) && field.equals("addServer") )) || field.equals("init") ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						__temp_executeDef1 = false;
						//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
					break;
				}
				
				
			}
			
			//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
			if (__temp_executeDef1) 
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			else
			{
				//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		baseArr.push("preferences");
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		baseArr.push("cordova");
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		baseArr.push("webView");
		//line 4 "E:\\work\\libhaxe\\hx-cordova-plugin\\demo\\hx-src\\backend\\Handler.hx"
		baseArr.push("objects");
	}
	
	
}

