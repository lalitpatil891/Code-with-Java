package static_intializer;

//static block
class Fooo {
	Fooo() {
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static {
		System.out.println("Static block...");
	}

}

public class StaticBlockDemo2 {
	public static void main(String[] args) {
		System.out.println("Main Method Executed ");
		
		Fooo f = new Fooo();	
	}
}

//OUTPUT: Main Method Executed 


//Here Foo.class file is not loaded into JVM Memory so static block of Foo class will not be executed.
//Static block executes only once when class is loaded.
//Instance block executes every time an object is created.