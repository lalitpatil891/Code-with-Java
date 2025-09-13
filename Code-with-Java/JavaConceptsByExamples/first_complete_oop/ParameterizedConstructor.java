/*
 * Parameterized Constructor :
---------------------------
If we pass one or more argument to the constructor then it is called parameterized constructor.

By using parameterized constructor all the objects will be initialized with different values.
 */

package com.nit.first_complete_oop;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Dog tommy = new Dog("Tommy", 5, 3.5);
		System.out.println(tommy.toString());
		
		Dog tiger = new Dog("Tiger", 6, 4.4);
		System.out.println(tiger.toString());

	}

}
