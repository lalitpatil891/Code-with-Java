/*
 1) At the time of declaration. 
*/
package com.nit.how_ways_initialize_object_properties;

class Case1 {

	int x = 10;
	int y = 20;
}

public class AtTheTimeOfDeclarationCase1 {

	public static void main(String[] args) {

		Case1 c = new Case1();

		System.out.println(c.x);
		System.out.println(c.y);
	}
}

/*Here the drawback is all objects will be initialized with same value.*/