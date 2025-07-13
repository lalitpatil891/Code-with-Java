package com.nit.oop_demo;

//ELC
public class StudentDemo {
	public static void main(String[] args) {

		Student raj = new Student();

		// Initializing to object properties

		raj.name = "Raj Gourav";
		raj.age = 21;
		raj.height = 5.8;

		// Calling the behavior
		raj.talk();
		raj.writeExam();

		System.out.println("----------------------------");

		Student priya = new Student();

		// Initializing the object properties
		priya.name = "Priya";
		priya.age = 20;
		priya.height = 5.6;

		// calling the behavior
		priya.talk();
		priya.writeExam();
		
		System.out.println("-----------------------------");
		
		Student lalit = new Student();
		
		lalit.name = "Lalit Patil";
		lalit.age = 23;
		lalit.height = 5.6;
		
		lalit.talk();
		lalit.writeExam();	
	}
}


/*
Hello Everyone, my name is: Raj Gourav
My age is: 21
and my height is :5.8
Every Saturday, I am writing the exam 
----------------------------
Hello Everyone, my name is: Priya
My age is: 20
and my height is :5.6
Every Saturday, I am writing the exam 
-----------------------------
Hello Everyone, my name is: Lalit Patil
My age is: 23
and my height is :5.6
Every Saturday, I am writing the exam 
*/
