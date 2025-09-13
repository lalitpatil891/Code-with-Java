package com.nit.final_keyword;

class A {
	protected int a = 10;
	protected int b = 20;

	public final void calculate() {
		int sum = a + b;

		System.out.println("Sum is: " + sum);
	}
}

class B extends A {
	@Override
	public void calculate() // error
	{
		int mul = a * b;

		System.out.println("Mul is: " + mul);
	}
}

public class FinalMethodEx {

	public static void main(String[] args) {
		A a1 = new B();
		a1.calculate();
	}
}
