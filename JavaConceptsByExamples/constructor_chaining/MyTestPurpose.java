package com.nit.constructor_chaining;

class Subject
{
	public Subject()
	{
		System.out.println("Subject");
	}
}

class Math extends Subject
{
	public Math()
	{
		System.out.println("Math");
	}
}

public class MyTestPurpose {

	public static void main(String[] args) {
		
		//Math m = new Math();
		new Math();
	}
}
