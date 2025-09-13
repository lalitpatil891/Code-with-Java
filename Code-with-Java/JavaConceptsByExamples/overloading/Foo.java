package com.nit.overloading;

public class Foo {

	private Foo()  //Private Constructor
	{
		System.out.println("It is a private Construtor");
	}
	
	public static void main(String[] args) {
		new Foo();
	}
}
