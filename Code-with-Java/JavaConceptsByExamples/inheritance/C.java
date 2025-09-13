/*

Q) Why multiple inheritance is not supported in Java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
Suppose there are three classes A, B, and C. The C class inherits A and B classes. If A and B classes have the same method and we call it from child class object, there will be ambiguity to call the method of A or B class.
Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

*/
package com.nit.inheritance;

class A {
	void msg()
	{
		System.out.println("Hello");
	}
}

class B 
{
	void msg()
	{
		System.out.println("Welcome");
	}
}

class C extends A,B 
{
	public static void main(String[] args)
	{
		C n = new C();
		
		n.msg(); //Now which msg() method would be invoked?  
	}
}


