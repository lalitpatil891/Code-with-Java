package com.nit.constructor_chaining;

class Super
{
	public Super() {
		super();
		System.out.println("No Argument Constructor of super class");
	}
	
	public Super(int x)
	{
		this();
		System.out.println("Parameterized Constructor of super class: "+x);
	}
}

class Sub extends Super
{
	public Sub(int val)
	{
		super(val);
		System.out.println("Parameterized Constructor of Sub class");
	}
}

public class ConstructorChaningDemo3 {

	public static void main(String[] args) {
		new Sub(21);
	}

}

/*+-----------------------------------------+
| Start                                   |
+-----------------------------------------+
| new Sub(21)                             |
|   Sub Constructor is called with val=21 |
|       |                                 |
|   super(val) in Sub Constructor         |
|       |                                 |
|   Super(int x) Constructor is called    |
|       |                                 |
|   this() in Super(int x)                |
|       |                                 |
|   Super() Constructor is called         |
|       |                                 |
|   Print: "No Argument Constructor       |
|              of super class"            |
|       |                                 |
|   Return to Super(int x)                |
|       |                                 |
|   Print: "Parameterized Constructor     |
|              of super class: 21"        |
|       |                                 |
|   Return to Sub Constructor             |
|       |                                 |
|   Print: "Parameterized Constructor     |
|              of Sub class"              |
+-----------------------------------------+
| End                                     |
+-----------------------------------------+
*/
