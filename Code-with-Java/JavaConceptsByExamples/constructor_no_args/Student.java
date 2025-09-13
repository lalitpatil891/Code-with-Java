package com.nit.constructor;

/*
 * 2) No Argument OR Parameter-less OR Non parameterized OR Zero argument Constructor.
 */
public class Student {

	private int rollNumber;
	private String studentName;
	
	public Student()     //No Argument Constructor
	{
		rollNumber = 111;
		studentName = "Raj";
	}
}

//------------default no argumenet constructor -----------------------

/* public class Student {
	
	public Student()  //Constructor [Default Constructor] 
	{
		System.out.println("I am Constructor");
		return;
	}
	

	public static void main(String[] args)
	{
		Student s1 = new Student();
	}
}
*/



//  -------------- mathod ---------------------------
/*public class Student {
	
	public void student()  // Method
	{
		System.out.println("I am a method");
	}
	

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.student();
	}
}
*/