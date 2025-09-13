package com.nit.final_keyword;

final class A {
	private int x = 100;

	public void setDate();

	{
		x = 120;
		System.out.println(x);
	}
}

class B extends A {

}

public class FinalClassExample {

	public static void main(String[] args) {
		B b1 = new B();
		b1.setData();

	}
}


/** 
 * NOTE: class A is final so we can't inherit hence we will get compilation error.
 */