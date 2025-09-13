package com.nit.variable_shadowing;

public class Example1 {

	// Variable Shadowing
	int x = 10;

	public void m1() {
		int x = 40;
		System.out.println("m1 : " + this.x); // 10;
	}

	public static void main(String[] args) {

		Example1 e1 = new Example1();

		System.out.println(e1.x); // 10

		e1.m1(); // 10
	}
}
