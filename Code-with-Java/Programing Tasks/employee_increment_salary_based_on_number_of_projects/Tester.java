//OOps Day-06 (setter Intialization) Q1

package com.nit.employee_increment_salary_based_on_number_of_projects;

public class Tester {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setFirstName("Lalit");
		emp.setLastName("Patil");
		emp.setEmployeeId(11);
		emp.setSalary(30000);
		emp.setNoOfProject(30);
		emp.calculateSalary(emp.getNoOfProject());

		emp.displayEmployeeDetails();

	}
}

/*
Output

FirstName: Lalit
Last Name: Patil
employeeId: 11
Salary: 45000.0
noOfProject : 30
*/
