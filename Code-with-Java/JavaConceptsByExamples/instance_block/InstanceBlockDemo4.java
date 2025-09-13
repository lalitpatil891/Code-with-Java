package instance_block;

class Foo
{
	public Foo(int x, int y)
	{
		this(2.4, 5.7);
		System.out.println("Integer Parameter constructor");
	}
	
	public Foo(double x, double y)
	{
		System.out.println("Double parameter constructor");
	}
	
	{
		System.out.println("Non Static block");
	}
}

public class InstanceBlockDemo4 {

	public static void main(String[] args) {
		
		Foo f1 = new Foo(100, 200);
	}
}

/*
Note : The constructor which contains super(), only that constructor will contain non static block.

Output

Non Static block
Double parameter constructor
Integer Parameter constructor

*/