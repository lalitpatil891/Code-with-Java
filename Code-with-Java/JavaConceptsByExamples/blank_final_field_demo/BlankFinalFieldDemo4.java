package com.nit.blank_final_field_demo;

class Demo {
	final int x;

	{
		print();
		x = 222;
	}

	public void print() {
		System.out.println("Default value: " + x);
	}
}

public class BlankFinalFieldDemo4 {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		System.out.println("User value: " + d1.x);

	}
}

//A blank final field also have default value.

//Default value: 0
//User value: 222
