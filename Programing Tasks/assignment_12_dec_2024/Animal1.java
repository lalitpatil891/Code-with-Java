package com.nit.assignment_12_dec_2024;

public class Animal1 {

	String name;
	
	Animal1(String name)
	{
		this.name = name;
	}
	
	Animal1()
	{
		this.makeRandomName();
	}
	
	static String makeRandomName()
	{
		String name = "i";
	
		return name;
	}
	
	public static void main(String[] args) {
		
		Animal1  a = new Animal1();
		System.out.println(a.name);
		
		Animal1 b = new Animal1();
		System.out.println(b.name);
	}
}

/*
null
null
*/

/**Reason
The static method makeRandomName() returns "i", but the return value is not assigned to the name field in the default constructor. As a result, the name field remains null for both objects.*/