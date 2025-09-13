package com.nit.static_block_demo;

class A
{
	static 
	{
		System.out.println("A");  //Static block
	}
	
	{
		System.out.println("B");   //Instance Block
	}
	
	A()
	{
		System.out.println("C");   //no parameterized constructor
	}
}

class B extends A
{
	static
	{
		System.out.println("D");  // Static Block
	}
	
	{
		System.out.println("E");  //Instance Block
	}
	
	B()
	{
		System.out.println("F");  //No parameterized constructor
	}
}

public class StaticBlockDemo5 {

	public static void main(String[] args) {
		
		new B();  //class Loading + object Creation
		
	}
}

/*

    Class Loading Phase:
        A (static block) -> "A"
        B (static block) -> "D"

    Object Creation Phase:
        A (instance block) -> "B"
        A (constructor)    -> "C"
        B (instance block) -> "E"
        B (constructor)    -> "F"
*/
