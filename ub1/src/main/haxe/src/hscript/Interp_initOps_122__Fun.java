// Generated by Haxe 4.1.5
package hscript;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Interp_initOps_122__Fun extends haxe.lang.Function
{
	public Interp_initOps_122__Fun()
	{
		//line 122 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		super(2, 1);
	}
	
	
	public static hscript.Interp_initOps_122__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 122 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		double v2 = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((double) (__fn_float2) )) : (((double) (haxe.lang.Runtime.toDouble(__fn_dyn2)) )) );
		//line 122 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		double v1 = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((double) (__fn_float1) )) : (((double) (haxe.lang.Runtime.toDouble(__fn_dyn1)) )) );
		//line 122 "/usr/local/lib/haxe/lib/hscript/2,4,0/hscript/Interp.hx"
		return ( v1 % v2 );
	}
	
	
}


