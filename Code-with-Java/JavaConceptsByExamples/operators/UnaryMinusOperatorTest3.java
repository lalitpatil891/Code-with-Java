package com.nit.operators;

public class UnaryMinusOperatorTest3 {

	public static void main(String[] args)
	{
		short s = 12;
		short t = 14;
		
		short u = s + t;
		System.out.println(u);
	}
}

//After the arithmatic operator expression the result will be promoted to int type so, to hold the result minimum 32 bit data is required.
