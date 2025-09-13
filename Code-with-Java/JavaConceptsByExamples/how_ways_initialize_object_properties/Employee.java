package com.nit.how_ways_initialize_object_properties;

class Employee {
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
}