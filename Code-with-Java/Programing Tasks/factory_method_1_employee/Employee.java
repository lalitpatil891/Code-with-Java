package com.nit.factory_method_1_employee;

import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee()
	{
		
	}
	
	public static Employee createEmployee() {
		
		Scanner sc = new Scanner(System.in);
		
		//sc.nextLine(); //ConSume newLine
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();
		
		sc.nextLine();
		System.out.print("Enter Department: ");
		String department = sc.nextLine();
		
		return new Employee(id, name, salary, department);
	}


	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	
	  @Override
	    public String toString() {
	        double annualSalary = CalculateAnnualSalary.calculateAnnualSalary(getSalary(), getDepartment());
	        return "ID: " + id +
	               ", Name: " + name +
	               ", Department: " + department +
	               ", Monthly Salary: " + salary +
	               ", Annual Salary (with Bonus): " + annualSalary;
	    }
	
}
