// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Exceptions extends haxe.lang.HxObject
{
	static
	{
		//line 29 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.exception = new java.lang.ThreadLocal<java.lang.Throwable>();
	}
	
	public Exceptions(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Exceptions()
	{
		//line 28 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.__hx_ctor_haxe_lang_Exceptions(this);
	}
	
	
	protected static void __hx_ctor_haxe_lang_Exceptions(haxe.lang.Exceptions __hx_this)
	{
	}
	
	
	public static java.lang.ThreadLocal<java.lang.Throwable> exception;
	
	public static void setException(java.lang.Throwable exc)
	{
		//line 33 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Exceptions.hx"
		haxe.lang.Exceptions.exception.set(((java.lang.Throwable) (exc) ));
	}
	
	
	public static java.lang.Throwable currentException()
	{
		//line 38 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Exceptions.hx"
		return haxe.lang.Exceptions.exception.get();
	}
	
	
}


