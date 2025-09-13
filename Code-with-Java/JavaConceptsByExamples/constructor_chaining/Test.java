/*The following program explains that default constructor will be added by java compiler and the first line is reserved for super()*/

package com.nit.constructor_chaining;

class A {
	public A() {
		System.out.println("A");
	}
}

class B extends A {
}

class C extends B {
	public C() {

		System.out.println("C");
	}
}

public class Test {

	public static void main(String[] args) {

		new C();

	}

}
