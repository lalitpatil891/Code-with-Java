/**Q 7 . What are the different ways are there to call static variables ?*/

package com.nit.Assignment_8;

public class Test7 {

	static int a = 20;
	
	public static void main(String[] args) {
		
		//1. Direct Access (Within ths same Class)
		System.out.println("Direct Access: "+a);
		
		//2. Access Using class name.
		System.out.println("Access using class Name: "+Test7.a);
		
		//3. Access using object Reference
		Test7 obj = new Test7();
		System.out.println("Access Using Object Reference: "+obj.a);

	}
}

/*
Output

Direct Access: 20
Access using class Name: 20
Access Using Object Reference: 20
*/
