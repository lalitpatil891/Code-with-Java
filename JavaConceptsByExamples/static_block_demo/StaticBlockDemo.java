package com.nit.static_block_demo;

//static block
class Foo {											//3																				
	Foo() {
		System.out.println("No Argument Constructor"); //5
	}

	{
		System.out.println("Instance block");		//4
	}

	static {
		System.out.println("Static Block");
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Method Executed");   //1
		new Foo(); //2          
		new Foo(); 
		new Foo();
	}
}
/*
Main Method Executed
Static Block
Instance block
No Argument Constructor
*/

/*Here Foo.class file is not loaded into JVM Memory so static block of Foo class will not be executed.*/