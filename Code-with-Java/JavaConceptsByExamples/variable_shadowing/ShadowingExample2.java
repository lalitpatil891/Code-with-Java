/**Q) How to overcome from variable shadowing?

Ans : Using 'this' keyword for non-static variable we can overcome from variable shadowing.
*/

package com.nit.variable_shadowing;

class Example {

	int x = 10;

	public void myMethod() {
		
		System.out.println(this.x);
	}
}

public class ShadowingExample2 {

	public static void main(String[] args) {

		Example shadow1 = new Example();
		Example shadow2 = new Example();
		
		shadow1.x = 50;
		shadow2.x = 80;
	
		shadow1.myMethod();
		shadow2.myMethod();
	}

}
