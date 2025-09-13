package com.nit.static_block_demo;

//illegal Forward Reference

class Demoo
{
	static 
	{
		i = 100;
		System.out.println("Static ="+Demoo.i);
	}
	
	static int i = 0 ;
}

public class StaticBlockDemo6 {

	public static void main(String[] args) {
		
		System.out.println("i = "+Demoo.i);

	}
}

/*Execution Flow
------------------
Class Demoo is loaded:

Static block executes: i = 100;
Static variable declaration overrides: i = 0;
Main method executes:

System.out.println(Demoo.i); prints the value of i, which is 0. 

*/