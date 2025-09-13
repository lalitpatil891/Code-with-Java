/**Q 6. Is it possible to access non-static variable in static method directly if not what is the error ?.*/

package com.nit.Assignment_8;

public class Test6 {
	
	int a = 10;
	
	public static void main(String [] args)
	{
		//Test6 aa = new Test6();
		System.out.println("A volue : "+a);
	}
}

/*Output: 
Error: non-static variable a cannot be referenced from a static context

Key Takeaway:

1) Static methods can only access static variables and methods directly.

2) To access non-static variables or methods from a static method, you must create an object of the class.

