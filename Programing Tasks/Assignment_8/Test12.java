/**
Q 12 . Can we call static method inside static block if yes ,what is the output?
 */
package com.nit.Assignment_8;

public class Test12 {

	static {
		System.out.println("Test12 : SB1 Called");
		m1();
	}
	
	static void m1()
	{
		System.out.println("Test2 : m1() Called");
	}
	
	public static void main(String[] args) {
		
		//No operation
	}

}

/*
OUTPUT

Test12 : SB1 Called
Test2 : m1() Called

*/
