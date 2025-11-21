package static_intializer;

//static block
class Foo {
	Foo() {
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static {
		System.out.println("Static block...");
	}

}

public class StaticBlockDemo {
	public static void main(String[] args) {
		System.out.println("Main Method Executed ");
	}
}

//OUTPUT: Main Method Executed 
/**
A class in Java is loaded by the JVM only when it is first used.
In your main method, you never reference Foo, so JVM never loads Foo.class, hence the static block is never executed.
*/

//Here Foo.class file is not loaded into JVM Memory so static block of Foo class will not be executed.
//Static block executes only once when class is loaded.
//Instance block executes every time an object is created.