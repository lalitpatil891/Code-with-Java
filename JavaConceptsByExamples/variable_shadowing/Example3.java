package com.nit.variable_shadowing;

public class Example3 {

	public int add(int a, int b) {

		//System.out.println("Sum of a&b is :"+ (a+b));
		int c = a+b;

		return c;
	}

	public static void main(String[] args) {

		Example3 e1 = new Example3();
		//e1.add(50, 50);
		int a = 10, b = 80;
//		System.out.println("sum is: "+e1.add(10, 20));
		System.out.println("Sum is: "+e1.add(a,b));


	}
}
