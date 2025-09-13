package com.nit.variables;

public class Test {
	
	static int a = 100;   //Class Variable OR Static Field
	int b = 200;        //Instance Variable OR Non Static Field
	
	public void accept(int c)
	{
		int d = 400;
		System.out.println("Class Variable: "+a);
		System.out.println("Instance Variable: "+b);
		System.out.println("Parameter Variable: "+c);  //Parameter Variable
		System.out.println("Local Variable: "+d);   //Local variable
	}
}
