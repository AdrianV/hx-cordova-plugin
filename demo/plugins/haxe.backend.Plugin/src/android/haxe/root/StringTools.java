// Generated by Haxe 4.0.0 (git build development @ be76e496e)
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringTools extends haxe.lang.HxObject
{
	public StringTools(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringTools()
	{
		//line 33 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	protected static void __hx_ctor__StringTools(haxe.root.StringTools __hx_this)
	{
	}
	
	
	public static java.lang.String urlEncode(java.lang.String s)
	{
		//line 47 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		try 
		{
			//line 47 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return haxe.root.StringTools.postProcessUrlEncode(java.net.URLEncoder.encode(haxe.lang.Runtime.toString(s), haxe.lang.Runtime.toString("UTF-8")));
		}
		catch (java.lang.Throwable typedException)
		{
			//line 37 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			throw haxe.lang.HaxeException.wrap(typedException);
		}
		
		
	}
	
	
	public static java.lang.String postProcessUrlEncode(java.lang.String s)
	{
		//line 70 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		//line 71 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		int i = 0;
		//line 71 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		int len = s.length();
		//line 73 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		while (( i < len ))
		{
			//line 74 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			char _g = s.charAt(i++);
			//line 74 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			{
				//line 74 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
				char __temp_switch1 = (_g);
				//line 77 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
				if (( __temp_switch1 == 37 )) 
				{
					//line 77 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
					if (( i <= ( len - 2 ) )) 
					{
						//line 78 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						char c1 = s.charAt(i++);
						//line 78 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						char c2 = s.charAt(i++);
						//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						{
							//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
							char __temp_switch2 = (c1);
							//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
							if (( __temp_switch2 == 50 )) 
							{
								//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
								{
									//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									char __temp_switch4 = (c2);
									//line 82 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									if (( __temp_switch4 == 49 )) 
									{
										//line 82 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
										ret.addChar(33);
									}
									else
									{
										//line 84 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
										if (( __temp_switch4 == 55 )) 
										{
											//line 84 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											ret.addChar(39);
										}
										else
										{
											//line 86 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											if (( __temp_switch4 == 56 )) 
											{
												//line 86 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
												ret.addChar(40);
											}
											else
											{
												//line 88 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
												if (( __temp_switch4 == 57 )) 
												{
													//line 88 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
													ret.addChar(41);
												}
												else
												{
													//line 92 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
													ret.addChar(37);
													//line 93 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
													ret.addChar(((int) (c1) ));
													//line 94 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
													ret.addChar(((int) (c2) ));
												}
												
											}
											
										}
										
									}
									
								}
								
							}
							else
							{
								//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
								if (( __temp_switch2 == 55 )) 
								{
									//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									{
										//line 80 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
										char __temp_switch3 = (c2);
										//line 90 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
										if (( ( __temp_switch3 == 69 ) || ( __temp_switch3 == 101 ) )) 
										{
											//line 90 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											ret.addChar(126);
										}
										else
										{
											//line 92 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											ret.addChar(37);
											//line 93 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											ret.addChar(((int) (c1) ));
											//line 94 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
											ret.addChar(((int) (c2) ));
										}
										
									}
									
								}
								else
								{
									//line 92 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									ret.addChar(37);
									//line 93 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									ret.addChar(((int) (c1) ));
									//line 94 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
									ret.addChar(((int) (c2) ));
								}
								
							}
							
						}
						
					}
					else
					{
						//line 97 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						ret.addChar(((int) (_g) ));
					}
					
				}
				else
				{
					//line 76 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
					if (( __temp_switch1 == 43 )) 
					{
						//line 76 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						ret.add(haxe.lang.Runtime.toString("%20"));
					}
					else
					{
						//line 97 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
						ret.addChar(((int) (_g) ));
					}
					
				}
				
			}
			
		}
		
		//line 100 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		return ret.toString();
	}
	
	
	public static java.lang.String urlDecode(java.lang.String s)
	{
		//line 118 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		try 
		{
			//line 118 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return java.net.URLDecoder.decode(s, "UTF-8");
		}
		catch (java.lang.Throwable catchallException)
		{
			//line 117 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			haxe.lang.Exceptions.setException(catchallException);
			//line 119 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			java.lang.Object realException = ( (( catchallException instanceof haxe.lang.HaxeException )) ? (((haxe.lang.HaxeException) (catchallException) ).obj) : (catchallException) );
			//line 119 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			java.lang.Object e = realException;
			//line 119 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			throw haxe.lang.HaxeException.wrap(e);
		}
		
		
	}
	
	
	public static boolean isSpace(java.lang.String s, int pos)
	{
		//line 253 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		java.lang.Object c = haxe.lang.StringExt.charCodeAt(s, pos);
		//line 254 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		if ( ! ((( ( ((int) (haxe.lang.Runtime.toInt(c)) ) > 8 ) && ( ((int) (haxe.lang.Runtime.toInt(c)) ) < 14 ) ))) ) 
		{
			//line 254 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return haxe.lang.Runtime.eq(c, 32);
		}
		else
		{
			//line 254 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return true;
		}
		
	}
	
	
	public static java.lang.String ltrim(java.lang.String s)
	{
		//line 270 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		int l = s.length();
		//line 271 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		int r = 0;
		//line 272 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		while (( ( r < l ) && haxe.root.StringTools.isSpace(s, r) ))
		{
			//line 273 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			 ++ r;
		}
		
		//line 275 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
		if (( r > 0 )) 
		{
			//line 276 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return haxe.lang.StringExt.substr(s, r, ( l - r ));
		}
		else
		{
			//line 278 "C:\\Motion-Twin\\Haxe\\std\\StringTools.hx"
			return s;
		}
		
	}
	
	
}


