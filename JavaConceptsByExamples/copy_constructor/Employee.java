package com.nit.copy_constructor;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName)
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName; 
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [employeeId = "+ employeeId+ ", employeeName= "+employeeName+ "]";
	}
}
