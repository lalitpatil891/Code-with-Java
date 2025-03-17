package com.nit.factory_method_1_employee;

import java.util.Scanner;
public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("How many employees do you want to create?");
	        int numberOfEmployees = scanner.nextInt();

	        Employee[] employees = new Employee[numberOfEmployees];

	        for (int i = 0; i < numberOfEmployees; i++) {
	            System.out.println("Enter details for Employee " + (i + 1) + ":");
	            employees[i] = Employee.createEmployee();
	        }

	        System.out.println("\nEmployee Details:");
	        for (Employee employee : employees) {
	            System.out.println(employee); // Calls Employee's toString method
	        }
	}

}
