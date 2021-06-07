// Generated by Haxe 4.1.5
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringRefl
{
	static
	{
		//line 204 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
		haxe.lang.StringRefl.fields = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"length", "toUpperCase", "toLowerCase", "charAt", "charCodeAt", "indexOf", "lastIndexOf", "split", "substr", "substring"});
	}
	
	public StringRefl()
	{
	}
	
	
	public static haxe.root.Array<java.lang.String> fields;
	
	public static java.lang.Object handleGetField(java.lang.String str, java.lang.String f, boolean throwErrors)
	{
		//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
		{
			//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			java.lang.String __temp_svar1 = (f);
			//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			boolean __temp_executeDef2 = true;
			//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				switch (__temp_hash3)
				{
					case -1106363674:
					{
						//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
						if (__temp_svar1.equals("length")) 
						{
							//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
							__temp_executeDef2 = false;
							//line 211 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
							return str.length();
						}
						
						//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
						break;
					}
					
					
					case -399551817:
					case -1137582698:
					case 530542161:
					case -891529231:
					case 109648666:
					case -467511597:
					case 1943291465:
					case 397153782:
					case -1361633751:
					{
						//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
						if (( (( ( __temp_hash3 == -399551817 ) && __temp_svar1.equals("toUpperCase") )) || ( (( ( __temp_hash3 == -1137582698 ) && __temp_svar1.equals("toLowerCase") )) || ( (( ( __temp_hash3 == 530542161 ) && __temp_svar1.equals("substring") )) || ( (( ( __temp_hash3 == -891529231 ) && __temp_svar1.equals("substr") )) || ( (( ( __temp_hash3 == 109648666 ) && __temp_svar1.equals("split") )) || ( (( ( __temp_hash3 == -467511597 ) && __temp_svar1.equals("lastIndexOf") )) || ( (( ( __temp_hash3 == 1943291465 ) && __temp_svar1.equals("indexOf") )) || ( (( ( __temp_hash3 == 397153782 ) && __temp_svar1.equals("charCodeAt") )) || __temp_svar1.equals("charAt") ) ) ) ) ) ) ) )) 
						{
							//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
							__temp_executeDef2 = false;
							//line 213 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
							return new haxe.lang.Closure(str, f);
						}
						
						//line 209 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 215 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			if (__temp_executeDef2) 
			{
				//line 215 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				if (throwErrors) 
				{
					//line 216 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
					throw ((java.lang.RuntimeException) (haxe.Exception.thrown(( ( "Field not found: \'" + f ) + "\' in String" ))) );
				}
				else
				{
					//line 218 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
					return null;
				}
				
			}
			else
			{
				//line 215 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public static java.lang.Object handleCallField(java.lang.String str, java.lang.String f, java.lang.Object[] args)
	{
		//line 223 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
		java.lang.Object[] _args = null;
		//line 224 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
		if (( args == null )) 
		{
			//line 225 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			_args = ((java.lang.String[]) (new java.lang.String[]{haxe.lang.Runtime.toString(str)}) );
		}
		else
		{
			//line 227 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			_args = new java.lang.Object[( args.length + 1 )];
			//line 228 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			_args[0] = str;
			//line 229 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
			{
				//line 229 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				int _g = 0;
				//line 229 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				int _g1 = args.length;
				//line 229 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
				while (( _g < _g1 ))
				{
					//line 229 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
					int i = _g++;
					//line 230 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
					_args[( i + 1 )] = args[i];
				}
				
			}
			
		}
		
		//line 232 "/usr/local/lib/haxe/std/java/internal/StringExt.hx"
		return haxe.lang.Runtime.slowCallField(haxe.lang.StringExt.class, f, _args);
	}
	
	
}


