/*
Case 1:
-------
super() : Automatically added by compiler to maintain the hierarchy in the first line of the Constructor. 
          It is used to call default OR no argument constructor of super class.
 */

package com.nit.constructor_chaining;

class Alpha {
	public Alpha() {
		super();
		System.out.println("No argument constructor of Alpha Class.");
	}
}

class Beta extends Alpha {
	public Beta() {
		super();
		System.out.println("No argument Constructor of Beta Class.");
	}
}

public class ConstructorChainingDemo1 {

	public static void main(String[] args) {

		new Beta();
	}

}


/*
No argument constructor of Alpha Class.
No argument Constructor of Beta Class.
*/


