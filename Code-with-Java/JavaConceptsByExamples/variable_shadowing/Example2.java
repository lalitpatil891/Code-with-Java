package com.nit.variable_shadowing;

public class Example2 {

	int x = 10;

	public void m1() {
		int x = 20; // This inner scope var shadow of the outer scope varable.
		System.out.println("m1 :" + this);
	}

	public static void main(String[] args) {

		Example2 obj1 = new Example2();
		Example2 obj2 = new Example2();

		System.out.println(obj1);
		obj1.m1();

		System.out.println("--------------------------");

		System.out.println(obj2);
		obj2.m1();

	}
}

/*
OUTPUT

com.nit.variable_shadowing.Example2@378fd1ac
m1 :com.nit.variable_shadowing.Example2@378fd1ac
--------------------------
com.nit.variable_shadowing.Example2@7c3df479
m1 :com.nit.variable_shadowing.Example2@7c3df479

*/
