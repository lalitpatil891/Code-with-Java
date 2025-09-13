//By Default Every integral Literal is of type int only.

package com.nit.integral_literal;

public class Test4 {
	
	public static void main(String[] args)
	{
		byte bb = 128;  
		System.out.println(bb);  //ERROR : Type mismatch: cannot convert from int to byte
		
		short ss = 32768;
		System.out.println(ss);  //ERROR : Type mismatch: cannot convert from int to short
		
		
		
		byte b = -128;
		System.out.println(b);  //-128
		
		short s = -32768;
		System.out.println(s);  //-32768
	}
}
