package streamAPI.method_reference;

interface Workerrr
{
	void work(double salary);
}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		Workerrr w1 = Employeeee:: salary;
		
		w1.work(50000);
		
	}

}

class Employeeee {
	
	public static void salary(double salary)
	{
		System.out.println("Emploee Salary is: "+salary);
	}
}
