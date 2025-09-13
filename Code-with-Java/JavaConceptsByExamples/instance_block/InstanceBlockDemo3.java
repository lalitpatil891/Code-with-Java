//package instance_block;

class Sample
{
	int x;
	
	public Sample()
	{
		x=200;
		System.out.println("No Argument Constructor "+x);
	}
	
	{
		x = 100;
		System.out.println("Non Static block" +x);
	}
}

public class InstanceBlockDemo3 {

	public static void main(String[] args) {
		
		new Sample();
	}
}

/*

Note : Instance blocks are executed before the constructor body execution. 

*/
