package com.nit.encapsulation_setter_getter;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(name, salary);
		System.out.println(emp);
		
		emp.setEmployeeSalary(emp.getEmployeeSalary() +10000);
		System.out.println(emp);
		
		
		//Based on the salary, I want to known whether employee
		//is Developer, Designer OR Tester
		
		double sal = emp.getEmployeeSalary();
		
		if(sal >= 75000)
		{
			System.out.println(emp.getEmployeeName()+" is a Developer");
		}
		else if(sal >= 50000)
		{
			System.out.println(emp.getEmployeeName()+" is a Designer");
		}
		else
		{
			System.out.println(emp.getEmployeeName()+ " is a Tester");
		}
		
		
	}

}
