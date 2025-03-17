package com.nit.factory_method_1_employee;

public class CalculateAnnualSalary {

	public static double calculateAnnualSalary(double salary, String department) {

		// Employee emp = new Employee();
		// double sal = emp.getSalary();
		double annualSalary = salary * 12;
		double bonusPercentage;

		switch (department.toLowerCase()) {
		case "sales":
			bonusPercentage = 0.10;
			break;

		case "engineering":
			bonusPercentage = 0.15;
			break;

		case "hr":
			bonusPercentage = 0.08;
			break;

		default:
			bonusPercentage = 0.05;
			break;
		}
		
		
		annualSalary += annualSalary* bonusPercentage; 
		return annualSalary;

	}

}
