package com.nit.method_execution;

public class MethodExecution {
	
	public static void main(String[] args)
	{
		System.out.println("Main Method Started!!!");
		m1();
		System.out.println("Main Method Ended!!!");
	}
	
	public static void m1()
	{
		System.out.println("m1 Method Started!!!");
		m2();
		System.out.println("m1 Method Ended!!!");
	}
	
	public static void m2()
	{
		System.out.println("HII I am m2 Method");
	}
}


/*
OUTPUT


Main Method Started!!!
m1 Method Started!!!
HII I am m2 Method
m1 Method Ended!!!
Main Method Ended!!!

*/
