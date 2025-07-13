/*Programmer is the subclass and Employee is the superclass. The relationship between the two classes is Programmer IS-A Employee. It means that Programmer is a type of Employee.*/
package com.nit.inheritance;

class Employee
{
	float salary = 40000;
}

class Programmer extends Employee {

	int bonus = 10000;
	
	public static void main(String[] args) {
		
		Programmer prog = new Programmer();
		
		System.out.println("Programmer Salary is: "+ prog.salary);
		
		System.out.println("Bonus of programmer is:"+prog.bonus);

	}

}
