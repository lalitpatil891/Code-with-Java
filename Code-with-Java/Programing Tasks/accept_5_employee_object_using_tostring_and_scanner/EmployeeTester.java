package com.nit.accept_5_employee_object_using_tostring_and_scanner;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[5];
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Enter Details for Employee "+(i+1)+":");
			employees[i] = Employee.getEmployeeObject();
		}
		
		System.out.println("\nEmployee Details: ");
		for (Employee employee: employees) {
			System.out.println(employee);
		}
	}
}
