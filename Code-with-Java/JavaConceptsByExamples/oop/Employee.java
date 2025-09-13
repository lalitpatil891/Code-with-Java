package com.nit.oop;

public class Employee {

	int employeeId;
	String employeeName;

	public void setEmployeeData(int id, String name) {
		employeeId = id;
		employeeName = name;
	}

	public void getEmployeeData() {
		System.out.println("Employee id is: " + employeeId);
		System.out.println("Employee Name is: " + employeeName);
	}
}
