package com.nit.encapsulation_setter_getter;

public class Employee {
	
	private String employeeName;
	private double employeeSalary;
	
	public Employee(String employeeName,  double employeeSalary)
	{
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public String toString() {
		
		return "Employee [ employeeName = "+employeeName+" , employeeSalary = "+employeeSalary+" ]";
	}
	
	public String getEmployeeName()
	{
		return this.employeeName;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public double getEmployeeSalary()
	{
		return this.employeeSalary;
	}
	
	public void setEmployeeSalary(double employeeSalary)
	{
		this.employeeSalary = employeeSalary;
	}
}
