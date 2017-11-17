// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class CallStack extends haxe.lang.HxObject
{
	public CallStack(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public CallStack()
	{
		//line 38 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		haxe.CallStack.__hx_ctor_haxe_CallStack(this);
	}
	
	
	protected static void __hx_ctor_haxe_CallStack(haxe.CallStack __hx_this)
	{
	}
	
	
	public static haxe.root.Array<haxe.StackItem> exceptionStack()
	{
		//line 197 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		haxe.root.Array<haxe.StackItem> stack = new haxe.root.Array<haxe.StackItem>(new haxe.StackItem[]{});
		//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		{
			//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
			int _g = 0;
			//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
			java.lang.StackTraceElement[] _g1 = haxe.lang.Exceptions.currentException().getStackTrace();
			//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
			while (( _g < _g1.length ))
			{
				//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.StackTraceElement el = _g1[_g];
				//line 198 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				 ++ _g;
				//line 199 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String className = el.getClassName();
				//line 200 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String methodName = el.getMethodName();
				//line 201 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String fileName = el.getFileName();
				//line 202 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				int lineNumber = el.getLineNumber();
				//line 203 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				haxe.StackItem method = haxe.StackItem.Method(className, methodName);
				//line 204 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				if (( ( fileName != null ) || ( lineNumber >= 0 ) )) 
				{
					//line 205 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					stack.push(haxe.StackItem.FilePos(method, fileName, lineNumber));
				}
				else
				{
					//line 208 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					stack.push(method);
				}
				
			}
			
		}
		
		//line 211 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		return stack;
	}
	
	
	public static java.lang.String toString(haxe.root.Array<haxe.StackItem> stack)
	{
		//line 238 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		haxe.root.StringBuf b = new haxe.root.StringBuf();
		//line 239 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		{
			//line 239 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
			int _g = 0;
			//line 239 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
			while (( _g < stack.length ))
			{
				//line 239 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				haxe.StackItem s = stack.__get(_g);
				//line 239 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				 ++ _g;
				//line 240 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				b.add(haxe.lang.Runtime.toString("\nCalled from "));
				//line 241 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				haxe.CallStack.itemToString(b, s);
			}
			
		}
		
		//line 243 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		return b.toString();
	}
	
	
	public static void itemToString(haxe.root.StringBuf b, haxe.StackItem s)
	{
		//line 247 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
		switch (s.index)
		{
			case 0:
			{
				//line 249 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				b.add(haxe.lang.Runtime.toString("a C function"));
				//line 249 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				break;
			}
			
			
			case 1:
			{
				//line 250 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String m = haxe.lang.Runtime.toString(s.params[0]);
				//line 250 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				{
					//line 251 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString("module "));
					//line 252 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString(m));
				}
				
				//line 250 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				break;
			}
			
			
			case 2:
			{
				//line 253 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				int line = ((int) (haxe.lang.Runtime.toInt(s.params[2])) );
				//line 253 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String file = haxe.lang.Runtime.toString(s.params[1]);
				//line 253 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				haxe.StackItem s1 = ((haxe.StackItem) (s.params[0]) );
				//line 253 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				{
					//line 254 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					if (( s1 != null )) 
					{
						//line 255 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
						haxe.CallStack.itemToString(b, s1);
						//line 256 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
						b.add(haxe.lang.Runtime.toString(" ("));
					}
					
					//line 258 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString(file));
					//line 259 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString(" line "));
					//line 260 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(((java.lang.Object) (line) ));
					//line 261 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					if (( s1 != null )) 
					{
						//line 261 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
						b.add(haxe.lang.Runtime.toString(")"));
					}
					
				}
				
				//line 253 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				break;
			}
			
			
			case 3:
			{
				//line 262 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String meth = haxe.lang.Runtime.toString(s.params[1]);
				//line 262 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.String cname = haxe.lang.Runtime.toString(s.params[0]);
				//line 262 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				{
					//line 263 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString(cname));
					//line 264 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString("."));
					//line 265 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString(meth));
				}
				
				//line 262 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				break;
			}
			
			
			case 4:
			{
				//line 266 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				java.lang.Object n = s.params[0];
				//line 266 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				{
					//line 267 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(haxe.lang.Runtime.toString("local function #"));
					//line 268 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
					b.add(((java.lang.Object) (n) ));
				}
				
				//line 266 "C:\\Motion-Twin\\Haxe\\std\\haxe\\CallStack.hx"
				break;
			}
			
			
		}
		
	}
	
	
}


