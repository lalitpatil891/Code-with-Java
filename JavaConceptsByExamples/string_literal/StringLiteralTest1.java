//Three ways to create the string object

package com.nit.string_literal;

public class StringLiteralTest1 {
	
	public static void main(String[] args)
	{
		String s1 = "Hello World";					//Literal			
		System.out.println(s1);
		
		String s2 = new String("Ravi");				//Using new Keyword
		System.out.println(s2);
		
		char s3[] = {'H','E','L','L','O'};			//Character Array
		System.out.println(s3);
	}
}

/*
 * char used for read/set for single charector
output

Hello World
Ravi
HELLO

*/

