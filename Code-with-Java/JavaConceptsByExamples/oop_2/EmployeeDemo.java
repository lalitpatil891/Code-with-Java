/*How to initialize the object properties with parameter variable as per our requirement :ss */

package com.nit.oop_2;

public class EmployeeDemo {
	public static void main(String[] args)
	{
		Employee scott = new Employee();
		scott.setEmployeeData(10, "Lalit Patil", 80000);
		
		scott.calculateEmployeeGrade();
		scott.getEmployeeData();
	}
}

/*Output

Employee Id is: 10
Employee Name is: Lalit Patil
Employee Salary is: 80000.0
Employee Grade is : A
*/
