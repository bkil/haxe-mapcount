// Generated by Haxe 4.2.1
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main_main_5__Fun extends haxe.lang.Function
{
	public Main_main_5__Fun()
	{
		//line 7 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		super(2, 1);
	}
	
	
	public static haxe.root.Main_main_5__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 5 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>> map = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>>) (((java.lang.Object) (__fn_float2) )) )) : (((haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>>) (__fn_dyn2) )) );
		//line 5 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		java.lang.String clientId = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 7 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		return ((double) (((int) (haxe.root.Lambda.count(((java.lang.Object) (map) ), ((haxe.lang.Function) (new haxe.root.Main_main_7__Fun(clientId)) ))) )) );
	}
	
	
}


