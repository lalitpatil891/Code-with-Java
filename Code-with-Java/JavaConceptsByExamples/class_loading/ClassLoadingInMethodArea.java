package com.nit.class_loading;

class Student
{ }

class Sample
{ }

class Employee
{ }

class Customer
{ }

public class ClassLoadingInMethodArea {

	public static void main(String[] args) {
		
		Class cls = Student.class;
		System.out.println(cls.getName()); //FQN (package Name + Class Name)
		
		cls = Sample.class;
		System.out.println(cls.getName());
		
		cls = Employee.class;
		System.out.println(cls.getName());
		
		cls = Customer.class;
		System.out.println(cls.getName());
		
	}

}
