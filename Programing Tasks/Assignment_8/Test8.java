/**Q 8. What are the different ways to call/invoke static methods from main method 
*/
package com.nit.Assignment_8;

public class Test8 {

	static void m1() {
		System.out.println("Test8 : m1() Called");
	}
	public static void main(String[] args) {
		
		//Direct call
		m1();
		
		
		//Using Class name
		Test8.m1();
		
		//Using Object Reference  
		//Avoid calling static methods using an object reference.
		Test8 obj = new Test8(); 
		obj.m1();
		
	}
}


/*Note: The preferred way to call a static method is either directly (if in the same class) or using the class name for clarity. Avoid calling static methods using an object reference.*/