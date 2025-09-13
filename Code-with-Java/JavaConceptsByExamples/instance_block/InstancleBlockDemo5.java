//package instance_block;

class Stuff {
	int x;

	public Stuff() {
		x = 400;
		System.out.println(x);
	}

	{
		x = 100;
		System.out.println(x);
	}

	{
		x = 200;
		System.out.println(x);
	}

	{
		x = 300;
		System.out.println(x);
	}
}

public class InstancleBlockDemo5 {

	public static void main(String[] args) {

		new Stuff();
	}
}


/*
Note : Non static blocks are executed according to the order.
[top to bottom]
*/