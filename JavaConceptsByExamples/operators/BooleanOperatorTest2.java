package com.nit.operators;

public class BooleanOperatorTest2 {

	public static void main(String[] args)
	{
		int z = 5;
		if (++z > 6 & ++z > 6)
		{
			System.out.println("Inside If");
			z++;
		}
		System.out.println(z);  //7
	}
}
