// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package cordova.backend;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CustomServer extends haxe.lang.HxObject
{
	public CustomServer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CustomServer()
	{
		//line 9 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		cordova.backend.CustomServer.__hx_ctor_cordova_backend_CustomServer(this);
	}
	
	
	protected static void __hx_ctor_cordova_backend_CustomServer(cordova.backend.CustomServer __hx_this)
	{
	}
	
	
	public org.apache.cordova.CallbackContext _callbackContext;
	
	public cordova.backend.PluginServer plugin;
	
	public cordova.backend.PluginServer set_plugin(cordova.backend.PluginServer val)
	{
		//line 12 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		this.plugin = val;
		//line 14 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		return val;
	}
	
	
	public final void call(java.lang.Object func, haxe.root.Array args, org.apache.cordova.CallbackContext ctx)
	{
		//line 18 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		this._callbackContext = ctx;
		//line 19 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		java.lang.Object data = haxe.root.Reflect.callMethod(this, func, args);
		//line 20 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		if (( ( this._callbackContext == ctx ) &&  ! (ctx.isFinished())  )) 
		{
			//line 21 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			this.success(data, ctx);
		}
		
	}
	
	
	public void success(java.lang.Object data, org.apache.cordova.CallbackContext ctx)
	{
		//line 25 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		haxe.Serializer s = new haxe.Serializer();
		//line 26 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		s.serialize(data);
		//line 27 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		ctx.success(haxe.lang.Runtime.toString(s.toString()));
	}
	
	
	public void error(java.lang.Object data, org.apache.cordova.CallbackContext ctx)
	{
		//line 31 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		haxe.Serializer s = new haxe.Serializer();
		//line 32 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		s.serialize(data);
		//line 33 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		ctx.error(haxe.lang.Runtime.toString(s.toString()));
	}
	
	
	public org.apache.cordova.CallbackContext popContext()
	{
		//line 37 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		org.apache.cordova.CallbackContext ctx = this._callbackContext;
		//line 38 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		this._callbackContext = null;
		//line 39 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		return ctx;
	}
	
	
	public void ready()
	{
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		{
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			switch (field.hashCode())
			{
				case -985174221:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("plugin")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						if (handleProperties) 
						{
							//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
							this.set_plugin(((cordova.backend.PluginServer) (value) ));
							//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
							return value;
						}
						else
						{
							//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
							this.plugin = ((cordova.backend.PluginServer) (value) );
							//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
							return value;
						}
						
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -719185045:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("_callbackContext")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						this._callbackContext = ((org.apache.cordova.CallbackContext) (value) );
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return value;
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
			}
			
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		{
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			switch (field.hashCode())
			{
				case 108386723:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("ready")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "ready")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -719185045:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("_callbackContext")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return this._callbackContext;
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 943787550:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("popContext")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "popContext")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -985174221:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("plugin")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return this.plugin;
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 96784904:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("error")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "error")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -1262658128:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("set_plugin")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "set_plugin")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -1867169789:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("success")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "success")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 3045982:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("call")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "call")) );
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
			}
			
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		{
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			switch (field.hashCode())
			{
				case 108386723:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("ready")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						this.ready();
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -1262658128:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("set_plugin")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return this.set_plugin(((cordova.backend.PluginServer) (dynargs[0]) ));
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 943787550:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("popContext")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						return this.popContext();
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 3045982:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("call")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						this.call(dynargs[0], ((haxe.root.Array) (dynargs[1]) ), ((org.apache.cordova.CallbackContext) (dynargs[2]) ));
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case 96784904:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("error")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						this.error(dynargs[0], ((org.apache.cordova.CallbackContext) (dynargs[1]) ));
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
				case -1867169789:
				{
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					if (field.equals("success")) 
					{
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						__temp_executeDef1 = false;
						//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
						this.success(dynargs[0], ((org.apache.cordova.CallbackContext) (dynargs[1]) ));
					}
					
					//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
					break;
				}
				
				
			}
			
			//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		baseArr.push("plugin");
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		baseArr.push("_callbackContext");
		//line 3 "E:\\work\\libhaxe\\hx-cordova-plugin\\src\\cordova\\backend\\CustomServer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


