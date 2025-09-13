//package instance_block;

class NIT {
	public NIT() {
		System.out.println("Constructor");

		{
			System.out.println("Non Static block");
		}
	}

}

public class InstanceBlockDemo6 {

	public static void main(String[] args) {

		new NIT();

	}
}

/*
 * 
 * Note : Non static block will be executed as it is if it is written by user in
 * the body of the constructor.
 * 
 */