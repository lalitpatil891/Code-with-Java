package com.nit.copy_constructor;

public class CopyConstructor {
	
	public static void main(String [] args)
	{
		Employee e1 = new Employee(111, "Scott");
		System.out.println(e1);
		Manager m1 = new Manager(e1);
		System.out.println(m1);
	}
}
