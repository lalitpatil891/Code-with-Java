//Initializing the object properties using parameter variable :s
package com.nit.initializing_obj_properties_using_parameter_variable;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee john = new Employee();
		john.setEmployeeData(11, "John");
		john.getEmployeeData();
		
		System.out.println("--------------------");
		
		Employee lalit = new Employee();
		lalit.setEmployeeData(12,"Lalit");
		lalit.getEmployeeData();

	}

}
