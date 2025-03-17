/**Q 7 . What are the different ways are there to call static variables ?*/
package com.nit.Assignment_8;

public class Test5 {
	
	static int x = 10;
	
	void m1() {
		System.out.println("m1 X: "+x);
	}
	
	public static void main(String[] args) {
		
		System.out.println("main X : "+x);
	}
}

/*Execution Flow:
Class Loading:

The class Test5 is loaded, and the static variable x is initialized to 10.
main() Method Execution:

The main() method prints the value of x directly.
m1() Method:

The m1() method is not invoked in this code. If called from an instance of Test5, it would print the value of x.

Output:

main X : 10
*/
