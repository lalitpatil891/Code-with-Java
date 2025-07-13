/*
2) To call the method super class (Method Overriding)
------------------------------------------------------
If the super class non static method name and sub class non static method name both are same (Method Overriding) and if we create an object for sub class then sub class method will be 
executed (bottom to top), if we want to call super class method from sub class method body then we we should use super keyword as shown in the program.
*/
package com.nit.method_overriding;

class Alpha 
{
	public String toString()
	{
		return "Hyderabad";
	}
}

class Beta extends Alpha
{
	public String toString() {
		System.out.println(super.toString());
		
		return "India";
	}
}

public class MethodoveridingDemo {
	public static void main(String[] args) {
	
	Beta b = new Beta();
	System.out.println(b);
	}
}
