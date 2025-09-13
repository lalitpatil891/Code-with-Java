package com.nit.operators;

public class UnaryMinusOperatorTest5 {

	public static void main(String[] args)
	{
		byte b = 2;
		byte c = -b; //error
		System.out.println(c);  
	}
}


/*In Arithmetic Operator Or Unary minus operator, the result will be promoted to int type (32 bits)
so to hold the result int data type is reqd.*/