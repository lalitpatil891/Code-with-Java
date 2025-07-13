package com.nit.oop_demo;

public class Student {
	
	String name;
	double height;
	int age;
	
	public void talk()
	{
		System.out.println("Hello Everyone, my name is: " +name);
		System.out.println("My age is: " +age);
		System.out.println("and my height is :" +height);
	}
	
	public void writeExam()
	{
		System.out.println("Every Saturday, I am writing the exam ");
	}
}
