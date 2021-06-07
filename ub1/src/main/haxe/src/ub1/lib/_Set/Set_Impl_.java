// Generated by Haxe 4.1.5
package ub1.lib._Set;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Set_Impl_
{
	public static <T> void add(haxe.IMap<T, java.lang.Object> this1, T key)
	{
		//line 37 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		this1.set(key, true);
	}
	
	
	public static <T> boolean remove(haxe.IMap<T, java.lang.Object> this1, T key)
	{
		//line 40 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return this1.remove(key);
	}
	
	
	public static <T> boolean exists(haxe.IMap<T, java.lang.Object> this1, T key)
	{
		//line 43 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return this1.exists(key);
	}
	
	
	public static <T> java.lang.Object iterator(haxe.IMap<T, java.lang.Object> this1)
	{
		//line 46 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return this1.keys();
	}
	
	
	public static <T> java.lang.String toString(haxe.IMap<T, java.lang.Object> this1)
	{
		//line 49 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return this1.toString();
	}
	
	
	public static <T> haxe.ds.StringMap<java.lang.Object> toStringMap(haxe.IMap<T, java.lang.Object> t)
	{
		//line 52 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return new haxe.ds.StringMap<java.lang.Object>();
	}
	
	
	public static <T> haxe.ds.IntMap<java.lang.Object> toIntMap(haxe.IMap<T, java.lang.Object> t)
	{
		//line 55 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return new haxe.ds.IntMap<java.lang.Object>();
	}
	
	
	public static <T> haxe.ds.EnumValueMap<T, java.lang.Object> toEnumValueMapMap(haxe.IMap<T, java.lang.Object> t)
	{
		//line 58 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return new haxe.ds.EnumValueMap<T, java.lang.Object>();
	}
	
	
	public static <T> haxe.ds.ObjectMap<T, java.lang.Object> toObjectMap(haxe.IMap<T, java.lang.Object> t)
	{
		//line 61 "/Users/fabrizio/ubimate/oss/ub1/ub1-core/src/ub1/lib/Set.hx"
		return new haxe.ds.ObjectMap<T, java.lang.Object>();
	}
	
	
}


