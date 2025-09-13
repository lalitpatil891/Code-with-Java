/*	4) By using Constructor 
 * 
 *  C) Third Approach (Copy Constructor)
    --------------------------------------
 */
package com.nit.how_ways_initialize_object_properties;

import com.nit.copy_constructor.Employee;

class Manager {
	private int managerId;
	private String managerName;

	public Manager(Employee emp) {
		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmployeeName();
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}
}

public class ByUsingConstructorCase4Approch3 {

	public static void main(String[] args) {

		Employee m = new Employee(1, "lalit");

		System.out.println(m);
	}
}

/*Here with the help of Object reference (Employee class) we are 
initializing the properties of Manager class. (Copy Constructor)*/
