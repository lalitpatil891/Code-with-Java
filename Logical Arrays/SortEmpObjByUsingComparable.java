/** How to Sort Employee Object by using name*/

package logicalArray.lectureArrayPrograms;

import java.util.Arrays;
/**
 * A Java record (Employee) is created, which automatically provides immutable fields, a constructor, and methods like toString(), equals(), and hashCode().
 */
record Employee(Integer Id, String name) implements Comparable<Employee>
{
	@Override
	public int compareTo(Employee e2)
	{
		return this.name.compareTo(e2.name);
	}
}

/*
class Employee implements Comparable<Employee>{
	
	public int id;
	public String name;
	
	public Employee(int id, String name) {
		
		this.id =id;
		this.name = name;
	}
	
	
	public int compareTo(Employee other)
	{
		return this.name.compareTo(other.name);
	}
	
	@Override
	public String toString(){
		
		return "Employee [id :"+id+" Name: "+name+" ]" ;
	}
}*/

public class SortEmpObjByUsingComparable {
	
	public static void main(String [] args)
	{
		Employee employees[] = new Employee[3];
		
		employees[0] = new Employee(150, "Lalit");
		employees[1] = new Employee(200, "Sunil");
		employees[2] = new Employee(101, "Mayur");
		
		System.out.println("Employee array before Sorting.");
		
		for(Employee e1 : employees) {
			System.out.println(e1);
		}
		
		Arrays.sort(employees);
		
		System.out.println("\nEmployees array After Sorting.");
		for(Employee e1 : employees) {
			System.out.println(e1);
		}
			
	}
}