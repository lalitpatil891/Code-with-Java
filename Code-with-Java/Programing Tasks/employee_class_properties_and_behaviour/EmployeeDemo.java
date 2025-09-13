/*  #0002  OOP Day-1
 * 	Write a Program on OOPs to define Employee class properties and behaviour.
 */

package com.nit.employee_class_properties_and_behaviour;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		new Employee()
		{{
			
			setEmployeeData();
			getEmployeeData();
			
		}};
	}
}

/* OUTPUT

Enter Employee Id: 01
Enter Employee Name: lalit
Enter Employee Salary: 30000
EmployeeId: 1
EmployeeName: lalit
EmployeeSalary: 30000.0

*/