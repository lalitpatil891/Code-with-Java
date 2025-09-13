package com.nit.static_block_demo;

class Test1
{
	public static final Test1 t1 = new Test1(); //t1 = null;
	
	static 
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("Non Static Block"); // non-static block and instance block 
	}
	
	Test1()
	{
		System.out.println("No Argument Constructor");
	}
}

public class StaticBlockDemo9 {

	public static void main(String[] args) {
		
		new Test1();   //2 steps (class loading + Object Creation)
	}
}

/*
Non Static Block
No Argument Constructor
static block
Non Static Block
No Argument Constructor

*/
