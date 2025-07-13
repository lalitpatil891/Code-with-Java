package com.nit.single_level_inheritance;

class Employee {
	protected int employeeId;
	protected String employeeName;
	protected double employeeSalary;

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
}

class PermanentEmployee extends Employee {
	protected String departmentName;
	protected String designation;
	
	public PermanentEmployee(int employeeId, String employeeName, double employeeSalary, String departmentName, String designation)
	{
		super(employeeId, employeeName, employeeSalary);
		this.departmentName = departmentName;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", departmentName=" + departmentName + ", designation=" + designation + "]";
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) {
		
		PermanentEmployee pm = new PermanentEmployee(1,"Lalit", 90000, "IT", "Developer");
		System.out.println(pm);
		
		/*
		 * String details = pm.toString(); // Explicit call to toString()
			System.out.println(details);
		 */
		
	}
}


/*
Execution Flow Diagram for Single-Level Inheritance
+----------------------------------------------------+

| Start                                              |
+----------------------------------------------------+
| main() Method                                      |
|   Create PermanentEmployee Object                 |
|   -> PermanentEmployee Constructor is Called      |
|       |                                            |
|   super(employeeId, employeeName, employeeSalary) |
|       |                                            |
|   Employee Constructor is Called                  |
|       |                                            |
|   Assign employeeId = 1                           |
|   Assign employeeName = "Lalit"                   |
|   Assign employeeSalary = 90000                   |
|       |                                            |
|   Return to PermanentEmployee Constructor         |
|       |                                            |
|   Assign departmentName = "IT"                    |
|   Assign designation = "Developer"                |
|       |                                            |
|   Return to main()                                 |
|       |                                            |
|   toString() Method of PermanentEmployee Called   |
|       |                                            |
|   Generate String Representation                  |
|       |                                            |
|   Print: "PermanentEmployee [employeeId=1,        |
|           employeeName=Lalit, employeeSalary=90000|
|           , departmentName=IT, designation=       |
|           Developer]"                             |
+----------------------------------------------------+
| End                                                |
+----------------------------------------------------+
*/