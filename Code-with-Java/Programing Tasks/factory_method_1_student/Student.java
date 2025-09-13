package com.nit.factory_method_1_student;

import java.util.Scanner;

public class Student {
	
	private String name;
	private int age;
	private String grade;
	
	//constructor
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	//Static method to a create Student Object
	public static Student createStudent() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Grade: ");
		String grade = sc.nextLine();
		
		
		
		return new Student(name, age, grade);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
