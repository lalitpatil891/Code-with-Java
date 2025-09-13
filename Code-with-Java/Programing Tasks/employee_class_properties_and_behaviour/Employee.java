package com.nit.employee_class_properties_and_behaviour;

import java.util.Scanner;
public class Employee {
	

	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id: ");
		employeeId = sc.nextInt();
		
		System.out.print("Enter Employee Name: ");
		employeeName = sc.nextLine();
		employeeName = sc.nextLine();
		
		System.out.print("Enter Employee Salary: ");
		employeeSalary = sc.nextDouble();
		
		sc.close();
		
	}
	
	public void getEmployeeData() {
		
		System.out.println("EmployeeId: "+employeeId);
		System.out.println("EmployeeName: "+employeeName);
		System.out.println("EmployeeSalary: "+employeeSalary);
	}
}
