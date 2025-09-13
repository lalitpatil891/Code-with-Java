package com.nit.operators;

class MemberOperator {
	
	static int x = 100;
	
	public static void  accept()
	{
		System.out.println("Accept static method");
	}
}

public class MemberOperatorTest1 {
	public static void main(String[] args)
	{
		System.out.println(MemberOperator.x);
		
		MemberOperator.accept();
	}
}


/*
 * Output
 * 
 * 100
 * Accept static method
 * 
 */

