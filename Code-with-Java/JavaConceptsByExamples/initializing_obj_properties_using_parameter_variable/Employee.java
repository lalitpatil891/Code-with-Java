package com.nit.initializing_obj_properties_using_parameter_variable;

public class Employee {

	int employeeId;
	String employeeName;

	public void setEmployeeData(int id, String name) {
		this.employeeId = id;
		this.employeeName = name;
	}

	public void getEmployeeData() {
		System.out.println("Employee id is: " + employeeId);
		System.out.println("Employee Name is: " + employeeName);
	}
}
