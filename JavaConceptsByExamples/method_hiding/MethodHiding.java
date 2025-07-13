package com.nit.method_hiding;

/**

Case 1: 
======= 
Any public static method of super class is by default available to sub class so from sub class we can call super class static method as shown in the program below :

*/

class Super {
	public static void m1() {
		System.out.println("m1 static method of super class");
	}
}

class Sub extends Super {

}

public class MethodHiding {

	public static void main(String[] args) {
		{
			Super.m1();
			Sub.m1();
			Sub s1 = new Sub();
			s1.m1();
		}
	}
}

/*

m1 static method of super class
m1 static method of super class
m1 static method of super class

*/
