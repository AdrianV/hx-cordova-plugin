// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VarArgsFunction extends haxe.lang.VarArgsBase
{
	public VarArgsFunction(haxe.lang.Function fun)
	{
		//line 54 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Function.hx"
		super(-1, -1);
		//line 55 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Function.hx"
		this.fun = fun;
	}
	
	
	public haxe.lang.Function fun;
	
	@Override public java.lang.Object __hx_invokeDynamic(java.lang.Object[] dynArgs)
	{
		//line 60 "C:\\Motion-Twin\\Haxe\\std\\java\\internal\\Function.hx"
		return ((java.lang.Object) (this.fun.__hx_invoke1_o(0.0, ((haxe.root.Array<java.lang.Object>) (haxe.root.Array.ofNative(((java.lang.Object[]) (dynArgs) ))) ))) );
	}
	
	
}


