package com.nit.hierarchical_inheritance;

class Employee {
	protected String empId;
	protected String name;
	protected double salary;

	public Employee(String empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
}

class Developer extends Employee {
	protected String designation;

	public Developer(String empId, String name, double salary, String designation) {
		super(empId, name, salary);
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Developer [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
}

class Designer extends Employee {
	protected String designation;

	public Designer(String empId, String name, double salary, String designation) {
		super(empId, name, salary);
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Designer [empId=" + empId + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}
}

public class HierarchicalInheritanceDemo2 {

	public static void main(String[] args) {

		Developer dev = new Developer("DEV001", "Lalit", 30000, "Programer");
		System.out.println(dev.toString());

		Designer des = new Designer("DES002", "Sunil", 25000, "Designer");
		System.out.println(des.toString());

	}
}


/*
	Developer [empId=DEV001, name=Lalit, salary=30000.0, designation=Programer]
	Designer [empId=DES002, name=Sunil, salary=25000.0, designation=Designer]
*/
