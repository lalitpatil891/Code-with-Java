package com.nit.factory_method_1_student;

import java.util.Scanner; 

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter How many Student Data add: ");
		int numberOfStudents = scanner.nextInt();
		
		Student[] students = new Student[numberOfStudents];
		
		for(int i=0; i < numberOfStudents; i++ )
		{
			System.out.println("Enter details for Student " + (i + 1) + ":");
			students[i] = Student.createStudent();
		}
		
		for(Student student : students )
		{
			System.out.println(student);
		}
		
	}

}
