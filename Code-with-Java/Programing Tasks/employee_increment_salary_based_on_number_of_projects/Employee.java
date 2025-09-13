//OOps Day-06 (setter Intialization) Q1

package com.nit.employee_increment_salary_based_on_number_of_projects;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	/* public Employee(String firstName,String lastName, int employeeId,double salary,int noOfProject)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}  */
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setNoOfProject(int noOfProject) {
		this.noOfProject = noOfProject;
	}
	
	public int getNoOfProject() {
		return noOfProject;
	}

	public void calculateSalary(int noOfProject) {
		if (noOfProject >= 5 && noOfProject <= 10) {
			this.salary += 5000;
		} else if (noOfProject >= 10 && noOfProject <= 20) {
			this.salary += 10000;
		} else if (noOfProject > 20) {
			this.salary += 15000;
		} else {
			this.salary += 0;
		}
	}
	
	public void displayEmployeeDetails() {
		System.out.println("FirstName: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("employeeId: "+employeeId);
		System.out.println("Salary: "+salary );
		System.out.println("noOfProject : "+noOfProject);
	}

}