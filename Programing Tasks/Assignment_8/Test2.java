/**Q 3. What is the output of this below program ?*/

package com.nit.Assignment_8;

public class Test2 {

	static {
		System.out.println("Test2 class Static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Test2 class main method");
	}

}

/*
Ans :-
Execution Flow :

Class Loading:
	The JVM loads the Test2 class into memory.
	The static block executes during this phase.
	Output: Test2 class Static Block

Main Method Execution:
	After the static block, the main method is executed.
	Output: Test2 class main method

OUTPUT :
Test2 class Static Block
Test2 class main method
*/