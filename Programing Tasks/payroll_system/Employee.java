package com.nit.payroll_system;

public class Employee {

	int employeeId;
	String employeeName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	Employee(int employeeId, String employeeName, double basicSalary, double HRAPer, double DAPer)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
	}
	
	public double calculateGrossSalary() {
		
		return basicSalary + HRAPer + DAPer;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + "]";
	}

}
