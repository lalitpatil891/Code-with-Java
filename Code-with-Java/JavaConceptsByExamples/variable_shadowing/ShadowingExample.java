/**-> Variable shadowing
======================
Variable shadowing occurs when a variable declared in an inner scope (like a method or a block) has the same name as a variable declared in an outer scope (like a class or a method). In such cases, the inner-scope variable "shadows" the outer-scope variable, meaning that within the inner scope, the inner-scope variable takes precedence.


-> Compiler and JVM activity in variable shadowing.
During execution, when the variable is accessed within the scope where it's declared, the JVM uses the value of the inner-scope variable. The outer-scope variable is temporarily hidden.

The inner-scope variable takes precedence within its scope. 

*/

package com.nit.variable_shadowing;

class VarShadow {

	int x = 10; // Outer scope variable

	public void myMethod() {
		int x = 20; // Inner Scope variable(Shadows the outer scope variable)

		System.out.println("The x value is: "+x);   //prints 20
	}
}

public class ShadowingExample {

	public static void main(String[] args) {

		VarShadow shadow = new VarShadow();

		shadow.myMethod(); 

	}
}
