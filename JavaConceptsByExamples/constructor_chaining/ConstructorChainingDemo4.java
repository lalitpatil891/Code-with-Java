/*this("java") : Must be explicitly written by user in the
           first line of constructor. It is used to call
           parameterized constructor of current class.*/

package com.nit.constructor_chaining;

class Base
{
	public Base() //Step 1: Implicitly calls Base(). Base() is called:
	{
		this(15);  //Step 2: Executes this(15) to call Base(int x). 
		
		System.out.println("No Argument constructore of base class"); //Step 4: Prints "No Argument constructor of base class".
			//Control returns to Derived(). Derived() continues execution:
	}
	
	public Base(int x)  //Base(int x) is called: 
	{
		System.out.println("Parameterized Constructor of base class:"+x);
		//Step 3: Prints "Parameterized Constructor of base class: 15". Control returns to Base(). Base() continues execution:
	}
}

class Derived extends Base
{
	public Derived() //first Derived() is called:
	{
		System.out.println("No Argument Constructor of Derived Class");
		//Step 5: Prints "No Argument Constructor of Derived Class".
	}
}


public class ConstructorChainingDemo4 {

	public static void main(String[] args) {
		
		new Derived();  //When Derived obj = new Derived(); is executed:
	}

}

/*
+-----------------------------+
|   new Derived();            |
|-----------------------------|
|   Derived()                 |
|       |                     |
|   Base()                    |
|       |                     |
|   Base(int x)               |
|       |                     |
|   Print "Parameterized      |
|          Constructor..."    |
|       |                     |
|   Print "No Argument..."    |
|       |                     |
|   Back to Derived()         |
|       |                     |
|   Print "No Argument..."    |
+-----------------------------+
*/
