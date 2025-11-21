package instance_Initializer;

public class Demo1 {

	{
		System.out.println("This is Instance Block"); // executes before constructor 
	}
	
	
	Demo1() {
		System.out.println("Constructor"); 
	}
	

	static {
		System.out.println("Static Block"); //executes before constructor or main method , only once when class loaded in memory. 
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		Demo1 d = new Demo1();
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1();
		
	}

}
