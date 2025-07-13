/**  Simple Example: Read and Write in a static Method  */

package com.nit.read_write_operations;

public class ReadWriteInStaticMethod {

	static int number = 5; // static variable

	static void performOperations() {

		//Read Operation: Accessing the value of 'number'
		System.out.println("Before Modification: " + number);

		// Write operation: Modifying the value of 'number'
		number = 10;

		// Read Operation: Accessing the updated value of 'number'
		System.out.println("After modification: " + number);
	}

	public static void main(String[] args) {

		performOperations(); // Calling the static method
	}

}

/*
Output
------
Before Modification: 5
After modification: 10

*/


/**Explanation:
Read Operation:

System.out.println("Before modification: " + number);
Here, the value of number is accessed (read) and printed.
Write Operation:

number = 10;
The value of number is updated (written) from 5 to 10.
Read Operation (Again):

System.out.println("After modification: " + number);
The updated value of number is accessed (read) and printed.


Summary
Direct Read/Write Valid: Static methods can directly read and write static fields because they share the same context.
Direct Read/Write Invalid: Static methods cannot directly access non-static fields or methods.
Solution for Non-Static Members: Use an instance of the class to access non-static fields or methods.

*/