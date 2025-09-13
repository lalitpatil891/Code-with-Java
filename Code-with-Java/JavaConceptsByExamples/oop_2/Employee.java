/*How to initialize the object properties with parameter variable as per our requirement :*/
package com.nit.oop_2;

public class Employee {
	
	int employeeNumber;
	String employeeName;
	double employeeSalary;
	char employeeGrade;
	
	public void setEmployeeData(int eno, String ename, double salary)
	{
		employeeNumber = eno;
		employeeName = ename;
		employeeSalary = salary;
		
	}
	
	public void getEmployeeData()
	{
		System.out.println("Employee Id is: "+employeeNumber);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Employee Salary is: "+employeeSalary);
		System.out.println("Employee Grade is : "+employeeGrade);
	}
	
	public void calculateEmployeeGrade()
	{
		if(employeeSalary >= 75000)
		{
			employeeGrade = 'A';
		}
		else if(employeeSalary >= 50000)
		{
			employeeGrade = 'B';
		}
		else if(employeeSalary >= 30000)
		{
			employeeGrade = 'C';
		}
		else
		{
			employeeGrade = 'D';
		}
	}
}
