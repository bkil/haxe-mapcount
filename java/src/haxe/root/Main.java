// Generated by Haxe 4.2.1
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 3 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	protected static void __hx_ctor__Main(haxe.root.Main __hx_this)
	{
	}
	
	
	public static void main()
	{
		//line 5 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.lang.Function countClient = ( (( haxe.root.Main_main_5__Fun.__hx_current != null )) ? (haxe.root.Main_main_5__Fun.__hx_current) : (haxe.root.Main_main_5__Fun.__hx_current = ((haxe.root.Main_main_5__Fun) (new haxe.root.Main_main_5__Fun()) )) );
		//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>> _g = new haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>>();
		//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		{
			//line 11 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			haxe.ds.StringMap<java.lang.String> _g1 = new haxe.ds.StringMap<java.lang.String>();
			//line 11 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g1.set("OSX", "1");
			//line 11 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g1.set("QNX", "2");
			//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g.set("Balu", _g1);
		}
		
		//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		{
			//line 12 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			haxe.ds.StringMap<java.lang.String> _g2 = new haxe.ds.StringMap<java.lang.String>();
			//line 12 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g2.set("OSX", "3");
			//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g.set("Tomi", _g2);
		}
		
		//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		{
			//line 13 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			haxe.ds.StringMap<java.lang.String> _g3 = new haxe.ds.StringMap<java.lang.String>();
			//line 13 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g3.set("QNX", "4");
			//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
			_g.set("Zsoc", _g3);
		}
		
		//line 10 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.ds.StringMap<haxe.ds.StringMap<java.lang.String>> map = _g;
		//line 15 "/home/bkil/cache/haxe/MapCount/src/Main.hx"
		haxe.Log.trace.__hx_invoke2_o(((double) (((int) (countClient.__hx_invoke2_f(0.0, "OSX", 0.0, map)) )) ), haxe.lang.Runtime.undefined, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"Main", "Main.hx", "main"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (15) )) )}));
	}
	
	
}

