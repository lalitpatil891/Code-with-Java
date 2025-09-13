/**
Program 04:
----------- 08-12-2024 
Write a program to input the basic salary of a person. He gets 
15% of the basic as HRA, 
15% of the basic as Conveyance allowance and
10% of the basic as Entertainment allowance. 
The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument*/
package com.nit.employee_salary_calculate;

import java.util.Scanner;

public class EmployeeSalaryCalculate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employees Basic Salary: ");
		double basicSalary = sc.nextDouble();
		
		//double basicSalary = Double.parseDouble(args[0]);  // comnadline argument
		
		double hra = basicSalary * 0.15;
		
		double conveyance = basicSalary *0.15;
		
		double entertainment = basicSalary *0.10;
		
		
		double totalSalary = basicSalary + hra + conveyance + entertainment;
		sc.close();
		
		System.out.println("Salary of Employee");
		System.out.println("-----------------------------------------");
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("HRA : "+hra);
		System.out.println("Conveyance: "+conveyance);
		System.out.println("Entertainment "+entertainment);
		System.out.println("-----------------------------------------");
		System.out.println("Total Salary: "+totalSalary);
	}
}

/*
Enter Employees Basic Salary: 
30

Salary of Employee
-----------------------------------------
Basic Salary: 30.0
HRA : 4.5
Conveyance: 4.5
Entertainment 3.0
-----------------------------------------
Total Salary: 42.0
*/
