package com.nit.static_block_demo;

class Demo
{
	final static int a; //blank static final field

	
	static 
	{
		a = 100; //Initialization is compulsory here	
	}
}

public class StaticBlockDemo4 {

	public static void main(String[] args) {
		
		System.out.println("a value is: "+Demo.a);
		
	}
}


//OUTPUT : a value is: 100