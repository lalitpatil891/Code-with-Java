package streamAPI.method_reference;

interface Workerr 
{
	void work();
}

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		
		Worker w1 = Employeee::salary;
		w1.work();
	}
}

class Employeee {
	
	public static void salary() {
		System.out.println("Employee is working for getting salary");
	}
}


