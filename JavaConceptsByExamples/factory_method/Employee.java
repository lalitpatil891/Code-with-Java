package com.nit.factory_method;

import java.util.Scanner;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		name = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		double sal = sc.nextDouble();
		
		return new Employee(id, name, sal);	
	
	}
		
}
