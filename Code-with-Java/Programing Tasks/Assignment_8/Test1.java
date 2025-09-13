/**Q 1. what is the output of this program?*/

package com.nit.Assignment_8;

public class Test1 {

	public static void main(String[] args) {
		
		int x = 20;
		System.out.println(x);
	}
	
	static {
		int x = 10;
		System.out.println(x+" ");
	}

}

/*
Ans :-

Execution Flow:
When the program starts, the class Test1 is loaded, and the static block is executed.
Output: 10
After the static block finishes execution, the main method is executed.
Output: 20

Note: A static block is executed once when the class is loaded into memory by the JVM (before the execution of the main method).

+-----------------------------+
|       Start Program         |
+-----------------------------+
+-----------------------------+
|   Load Test1 Class          |
|   Execute Static Block      |
|   int x = 10;               |
|   Print "10 "               |
+-----------------------------+
+-----------------------------+
|   Execute main() Method     |
|   int x = 20;               |
|   Print "20"                |
+-----------------------------+
+-----------------------------+
|       End Program           |
+-----------------------------+*/