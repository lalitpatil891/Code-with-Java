package class_load_into_jvm_mem;

//1) Using Constructor
class Foo {
	static {
		System.out.println("Foo loaded");
	}
}

//2) Accessing static data member
class Bar {
	static {
		System.out.println("Bar loaded");
	}
	static int x = 10;
}

//3) Using inheritance
class Parent {
	static {
		System.out.println("Parent loaded");
	}
}

class Child extends Parent {
}

//4) Using Reflection
class ReflectDemo {
	static {
		System.out.println("ReflectDemo loaded");
	}
}

//Main class
public class LoadDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("=== Constructor Example ===");
		Foo f = new Foo(); // Loads Foo

		System.out.println("=== Static Member Example ===");
		System.out.println(Bar.x); // Loads Bar

		System.out.println("=== Inheritance Example ===");
		Child c = new Child(); // Loads Parent first, then Child

		System.out.println("=== Reflection Example ===");
		Class.forName("class_load_into_jvm_mem.ReflectDemo"); // Loads ReflectDemo
	}
}
