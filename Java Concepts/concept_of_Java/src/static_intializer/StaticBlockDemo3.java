package static_intializer;

class Test {
	static int x;

	static {
		x = 100;
		System.out.println("x value is :" + x);
	}

	static {
		x = 200;
		System.out.println("x value is :" + x);
	}

	static {
		x = 300;
		System.out.println("x value is :" + x);
	}

}

public class StaticBlockDemo3 {
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(Test.x);
	}
}

/*
OUTPUT:
Main Method
x value is :100
x value is :200
x value is :300
300
*/


//Note : If a class contains more than 1 static block then it will be executed from top to bottom.