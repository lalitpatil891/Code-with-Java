package com.nit.blank_final_field_demo;

class foo {
	final int x;

	public Foo()
	{
		x = 300;
	}
}

public class BlankFinalFieldDemo3 {

	public static void main(String[] args) {

		Foo f1 = new Foo();

		System.out.println(f1.x);
	}

}


/* A blank final field must be initialized inside non static block OR inside constructor body.*/