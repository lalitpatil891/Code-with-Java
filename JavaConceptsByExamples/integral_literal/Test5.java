//Assigning smaller data type value to bigger data type

package com.nit.integral_literal;

public class Test5 {
	
	public static void main(String[] args)
	{
		byte b = 125;
		
		short s = b;    //Automatic type casting OR Widening
		
		System.out.println(s);
	}
}
