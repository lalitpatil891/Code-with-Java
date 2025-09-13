/**Que-1) : What is the output of below program ?*/
package com.nit.assignment_9;

public class Example19 {
	
	static {
		int x = 10;
		Example19.x = x+x;  //10+10 =20
	}
	
	static int x;   //0  The class level x
	
	public static void main(String[] args) {
		
		System.out.println("Class Level X : "+Example19.x);  //40
	}
	
	static {
		x = x+Example19.x;  //20+20=40
	}
}

/*Simple Execution Flow:
Class Loading

The JVM loads the class Example19, and the static variable x is initialized to 0 by default.
First Static Block

A local variable x is set to 10.
The class-level x is updated to 10 + 10 = 20.
Second Static Block

The class-level x is updated to 20 + 20 = 40.
Main Method

The main() method runs.
The value of the class-level x (which is now 40) is printed.*/