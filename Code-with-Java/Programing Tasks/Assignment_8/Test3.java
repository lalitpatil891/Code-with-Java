/**Q 5. Define a class having one static variable say  static int x=10 and invoke x variable in m1() and main(-)  what is the output ? */

package com.nit.Assignment_8;

public class Test3 {

	public static void main(String[] args) {
		int a;  //The local variable a may not have been initialized
		
		System.out.println("A : "+a);

	}

}

/**Explanation of the Program:

The variable a is declared but not initialized.
In Java, local variables (like a in this case) must be explicitly initialized before they are used. If they are not initialized, the compiler will throw a compilation error.*/