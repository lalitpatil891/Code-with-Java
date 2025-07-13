/**
 * 3) public T get();
 * 
 * --> It will get/fetch the value from the container, if the value is not available then it will throw java.util.NoSuchElementException.
 *
 */

package streamAPI.optional_class_examples;

import java.util.Optional;

class Employee {
	private Integer employeeId;
	private String employeeName;
	
	public Employee() {
		
	}
	
	public Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [ employeeId=" + employeeId + ", employeeName="+employeeName+ "]";
	}
	
	//Defferent Style of getter
	public Optional<Integer> getEmployeeId()
	{
		return Optional.ofNullable(this.employeeId);
	}
	
	public Optional<String> getEmployeeName() {
		return Optional.ofNullable(this.employeeName);
	}
}

public class OptionalDemo3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1032, "Lalit");
		
		Optional<Integer> idContnr = emp.getEmployeeId();
		
		if(idContnr.isPresent())
		{
			System.out.println("Employee id is: "+idContnr.get());
		}
		else
		{
			System.out.println("No employee id is available");
			
		}
		
		
		Optional<String> nameContnr = emp.getEmployeeName();
		String name = nameContnr.orElse("Name is not available");
		System.out.println("Employee Name is: "+name);
		
	}
}
