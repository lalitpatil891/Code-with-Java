/*
Role of instance variable while creating the Object :
-----------------------------------------------------
Whenever we create an objet in java, a separate copy of all the instance variables will be created with each and every object.
*/

package com.nit.oop_2;

public class Test {

	int x = 10; //instance Variable
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		++t1.x;
		--t2.x;
		
		System.out.println(t1.x);   //11
		System.out.println(t2.x);   //9
		
	}

}
