package static_intializer;

class Demo {
	final static int a; // Blank static final field

	static {
		a = 100; // Initialization is compulsory here
	}
}

public class StaticBlockDemo5 {
	public static void main(String[] args) {
		System.out.println("a value is :" + Demo.a);   //a value is :100

	}
}