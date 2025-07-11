//Wrapper Classes

package com.nit.integral_literal;

public class WrapperClasses {
	
	public static void main(String[] args)
	{
		Integer x = 24;
		Integer y = 24;
		Integer z = x+y;
		
		System.out.println("The sum is : "+z);
		
		boolean b = true;
		System.out.println(b);
		
		double d = 90.90;
		System.out.println(d);
		
		Character c = 'A';
		System.out.println(c);
		
	}
	
}

/*
 * Note: Form JAVA 1.5 version we have two concept.
 * 
 * AutoBoxing : Converting Primitive to Wrapper Object (int to Integer)
 * UnBoxing : Converting Wrapper object back to primitive (Integer to int)
 * 
 * 
 */
