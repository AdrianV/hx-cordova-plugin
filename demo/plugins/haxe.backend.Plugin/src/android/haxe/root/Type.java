// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Type extends haxe.lang.HxObject
{
	public Type(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Type()
	{
		//line 39 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Type.__hx_ctor__Type(this);
	}
	
	
	protected static void __hx_ctor__Type(haxe.root.Type __hx_this)
	{
	}
	
	
	public static java.lang.Class getEnum(java.lang.Object o)
	{
		//line 51 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (( ( o instanceof java.lang.Enum ) || ( o instanceof haxe.lang.Enum ) )) 
		{
			//line 52 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return o.getClass();
		}
		
		//line 54 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		return null;
	}
	
	
	public static java.lang.String getClassName(java.lang.Class c)
	{
		//line 68 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class c1 = ((java.lang.Class) (c) );
		//line 69 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		java.lang.String name = c1.getName();
		//line 70 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (name.startsWith("haxe.root.")) 
		{
			//line 71 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return haxe.lang.StringExt.substr(name, 10, null);
		}
		
		//line 72 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (name.startsWith("java.lang")) 
		{
			//line 73 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			name = haxe.lang.StringExt.substr(name, 10, null);
		}
		
		//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		{
			//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			java.lang.String __temp_svar1 = (name);
			//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			boolean __temp_executeDef2 = true;
			//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			switch (__temp_hash3)
			{
				case -1325958191:
				case 2052876273:
				{
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					if (( (( ( __temp_hash3 == -1325958191 ) && __temp_svar1.equals("double") )) || __temp_svar1.equals("Double") )) 
					{
						//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 78 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						return "Float";
					}
					
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
				case -1939501217:
				{
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					if (__temp_svar1.equals("Object")) 
					{
						//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 79 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						return "Dynamic";
					}
					
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
				case 104431:
				case -672261858:
				{
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					if (( (( ( __temp_hash3 == 104431 ) && __temp_svar1.equals("int") )) || __temp_svar1.equals("Integer") )) 
					{
						//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						__temp_executeDef2 = false;
						//line 77 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						return "Int";
					}
					
					//line 75 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					break;
				}
				
				
			}
			
			//line 80 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			if (__temp_executeDef2) 
			{
				//line 80 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				return name;
			}
			else
			{
				//line 80 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public static java.lang.String getEnumName(java.lang.Class e)
	{
		//line 85 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		java.lang.Class c = ((java.lang.Class) (e) );
		//line 86 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		java.lang.String ret = c.getName();
		//line 87 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (ret.startsWith("haxe.root.")) 
		{
			//line 88 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return haxe.lang.StringExt.substr(ret, 10, null);
		}
		
		//line 90 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		return ret;
	}
	
	
	public static java.lang.Class resolveClass(java.lang.String name)
	{
		//line 95 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		try 
		{
			//line 96 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			if (( haxe.lang.StringExt.indexOf(name, ".", null) == -1 )) 
			{
				//line 97 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				name = ( "haxe.root." + name );
			}
			
			//line 99 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return ((java.lang.Class) (java.lang.Class.forName(haxe.lang.Runtime.toString(name))) );
		}
		catch (java.lang.ClassNotFoundException e)
		{
			//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			haxe.lang.Exceptions.setException(e);
			//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			{
				//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				java.lang.String __temp_svar1 = (name);
				//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				boolean __temp_executeDef2 = true;
				//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				switch (__temp_svar1.hashCode())
				{
					case 360541844:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Class")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 106 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Class.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case -1242153355:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.String")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 104 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return java.lang.String.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case -140489125:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Dynamic")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 107 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Object.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case 704654956:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Math")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 105 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return java.lang.Math.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case 363325304:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Float")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 103 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return double.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
					case -1778387957:
					{
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						if (__temp_svar1.equals("haxe.root.Int")) 
						{
							//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							__temp_executeDef2 = false;
							//line 102 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
							return int.class;
						}
						
						//line 101 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
						break;
					}
					
					
				}
				
				//line 108 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				if (__temp_executeDef2) 
				{
					//line 108 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					return null;
				}
				else
				{
					//line 108 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					throw null;
				}
				
			}
			
		}
		
		
	}
	
	
	public static java.lang.Class resolveEnum(java.lang.String name)
	{
		
		if ("Bool".equals(name)) return boolean.class;
		Class r = resolveClass(name);
		if (r != null && (r.getSuperclass() == java.lang.Enum.class || haxe.lang.Enum.class.isAssignableFrom(r)))
			return r;
		return null;
	
	}
	
	
	protected static final java.lang.Class[] __createEmptyInstance_EMPTY_TYPES = ((java.lang.Class[]) (new java.lang.Class[]{((java.lang.Class) (((java.lang.Class) (haxe.lang.EmptyObject.class) )) )}) );
	
	protected static final haxe.lang.EmptyObject[] __createEmptyInstance_EMPTY_ARGS = ((haxe.lang.EmptyObject[]) (new haxe.lang.EmptyObject[]{((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) )}) );
	
	public static <T> T createEmptyInstance(java.lang.Class cl)
	{
		//line 187 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		try 
		{
			//line 188 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			java.lang.Class t = ((java.lang.Class) (((java.lang.Class) (cl) )) );
			//line 189 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			try 
			{
				//line 190 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				java.lang.reflect.Constructor<T> ctor = ((java.lang.reflect.Constructor<T>) (((java.lang.reflect.Constructor) (t.getConstructor(((java.lang.Class[]) (haxe.root.Type.__createEmptyInstance_EMPTY_TYPES) ))) )) );
				//line 191 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				return ctor.newInstance(((java.lang.Object[]) (haxe.root.Type.__createEmptyInstance_EMPTY_ARGS) ));
			}
			catch (java.lang.NoSuchMethodException _1)
			{
				//line 193 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				haxe.lang.Exceptions.setException(_1);
				//line 193 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				return ((T) (t.newInstance()) );
			}
			
			
		}
		catch (java.lang.Throwable typedException)
		{
			//line 187 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static <T> T createEnum(java.lang.Class e, java.lang.String constr, haxe.root.Array params)
	{
		//line 198 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (( ( params == null ) || ( params.length == 0 ) )) 
		{
			//line 199 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			java.lang.Object ret = haxe.lang.Runtime.slowGetField(e, constr, true);
			//line 200 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			if (( ret instanceof haxe.lang.Function )) 
			{
				//line 201 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				throw haxe.lang.HaxeException.wrap(( ( "Constructor " + constr ) + " needs parameters" ));
			}
			
			//line 203 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return ((T) (ret) );
		}
		else
		{
			//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			java.lang.Object[] ret1 = new java.lang.Object[params.length];
			//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			{
				//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				int _g1 = 0;
				//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				int _g = params.length;
				//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				while (( _g1 < _g ))
				{
					//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					int i = _g1++;
					//line 205 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
					ret1[i] = params.__get(i);
				}
				
			}
			
			//line 206 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return ((T) (haxe.lang.Runtime.slowCallField(e, constr, ret1)) );
		}
		
	}
	
	
	public static haxe.root.Array<java.lang.String> getClassFields(java.lang.Class c)
	{
		
		Array<String> ret = new Array<String>();
		if (c == java.lang.String.class)
		{
			ret.push("fromCharCode");
			return ret;
		}

		for (java.lang.reflect.Field f : c.getDeclaredFields())
		{
			java.lang.String fname = f.getName();
			if (java.lang.reflect.Modifier.isStatic(f.getModifiers()) && !fname.startsWith("__hx_"))
			ret.push(fname);
		}

		for (java.lang.reflect.Method m : c.getDeclaredMethods())
		{
			if (m.getDeclaringClass() == java.lang.Object.class)
				continue;
			java.lang.String mname = m.getName();
			if (java.lang.reflect.Modifier.isStatic(m.getModifiers()) && !mname.startsWith("__hx_"))
				ret.push(mname);
		}

		return ret;
	
	}
	
	
	public static haxe.root.Array<java.lang.String> getEnumConstructs(java.lang.Class e)
	{
		//line 275 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		if (haxe.root.Reflect.hasField(e, "__hx_constructs")) 
		{
			//line 277 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			haxe.root.Array<java.lang.String> ret = haxe.java.Lib.array_String(((java.lang.String[]) (haxe.lang.Runtime.getField(e, "__hx_constructs", true)) ));
			//line 278 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			return ret.copy();
		}
		
		//line 280 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		java.lang.Enum[] vals = ((java.lang.Enum[]) (haxe.lang.Runtime.callField(e, "values", null)) );
		//line 280 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		haxe.root.Array<java.lang.String> ret1 = new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		//line 281 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		{
			//line 281 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			int _g1 = 0;
			//line 281 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			int _g = vals.length;
			//line 281 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
			while (( _g1 < _g ))
			{
				//line 281 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				int i = _g1++;
				//line 282 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
				ret1.__set(i, vals[i].name());
			}
			
		}
		
		//line 283 "C:\\Motion-Twin\\Haxe\\std\\java\\_std\\Type.hx"
		return ret1;
	}
	
	
	public static haxe.root.ValueType typeof(java.lang.Object v)
	{
		
		if (v == null) return ValueType.TNull;

		if (v instanceof haxe.lang.IHxObject) {
			haxe.lang.IHxObject vobj = (haxe.lang.IHxObject) v;
			java.lang.Class cl = vobj.getClass();
			if (v instanceof haxe.lang.DynamicObject)
				return ValueType.TObject;
			else
				return ValueType.TClass(cl);
		} else if (v instanceof java.lang.Number) {
			java.lang.Number n = (java.lang.Number) v;
			if (n.intValue() == n.doubleValue())
				return ValueType.TInt;
			else
				return ValueType.TFloat;
		} else if (v instanceof haxe.lang.Function) {
			return ValueType.TFunction;
		} else if (v instanceof java.lang.Enum || v instanceof haxe.lang.Enum) {
			return ValueType.TEnum(v.getClass());
		} else if (v instanceof java.lang.Boolean) {
			return ValueType.TBool;
		} else if (v instanceof java.lang.Class) {
			return ValueType.TObject;
		} else {
			return ValueType.TClass(v.getClass());
		}
	
	}
	
	
	public static <T> boolean enumEq(T a, T b)
	{
		
			if (a instanceof haxe.lang.Enum)
				return a.equals(b);
			else
				return haxe.lang.Runtime.eq(a, b);
	
	}
	
	
	public static java.lang.String enumConstructor(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).name();
		else
			return ((haxe.lang.Enum) e).getTag();
	
	}
	
	
	public static haxe.root.Array enumParameters(java.lang.Object e)
	{
		
		return ( e instanceof java.lang.Enum ) ? new haxe.root.Array() : ((haxe.lang.Enum) e).getParams();
	
	}
	
	
	public static int enumIndex(java.lang.Object e)
	{
		
		if (e instanceof java.lang.Enum)
			return ((java.lang.Enum) e).ordinal();
		else
			return ((haxe.lang.Enum) e).index;
	
	}
	
	
}


