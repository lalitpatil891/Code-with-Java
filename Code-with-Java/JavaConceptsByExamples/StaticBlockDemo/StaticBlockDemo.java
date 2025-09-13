package com.nit.StaticBlockDemo;

class Foo
{	
	
	public Foo()
	{
	  System.out.println("Constructor");	
	}
	
	{
		 System.out.println("Instance Block");	
		 x = 10;
		 y = accept(); //20

	}
	
	public int accept()
	{
		System.out.println("Method");
		return 20;
	}
		
	int x = 1000;
	int y = 2000;
	
	
}
public class StaticBlockDemo 
{	
	public static void main(String [] args) 
	{		
		Foo f1 = new Foo();
		System.out.println(f1.x);
		 System.out.println(f1.y);	
	}	
}

/*-----------------------------------------------------------
|   Step    |  Event                                    |
-----------------------------------------------------------
|   1       |  Create object: Foo f1 = new Foo();           |
-----------------------------------------------------------
|   2       |  Execute instance initializer block:          |
|           |  - x = 10                                     |
|           |  - Call method accept()                       |
-----------------------------------------------------------
|   3       |  Inside accept():                             |
|           |  - Print "Method"                             |
|           |  - Return 20                                  |
-----------------------------------------------------------
|   4       |  Back to instance initializer block:          |
|           |  - y = 20                                     |
-----------------------------------------------------------
|   5       |  Execute constructor:                         |
|           |  - Print "Constructor"                        |
-----------------------------------------------------------
|   6       |  Print values of f1.x and f1.y:               |
|           |  - Print 10 (value of x)                      |
|           |  - Print 20 (value of y)                      |
-----------------------------------------------------------
*/