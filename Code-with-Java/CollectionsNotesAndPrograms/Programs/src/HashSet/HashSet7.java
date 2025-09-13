package HashSet;

import java.util.HashSet;

class Employee {
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
}

public class HashSet7 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(111, "Lalit");
		Employee emp2 = new Employee(111, "Lalit");
		
		System.out.println(emp1.equals(emp2));  // false
		
		
	}
}

/*
 	Note : It will return false because equals(Object obj) method 
of Object class is used to compare two objects based on the 
memory reference/Memory address.
 */
