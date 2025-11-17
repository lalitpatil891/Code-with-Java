package AbstractClassExamples;
/*2) Why the below class is showing compilation error?
 *  Because, abstract methods must not have a body.
 * */

abstract class ABC {
	
	abstract void abstractMethod()
    {
        System.out.println("First Method");
    }
}

class BCA extends ABC {
	
}

public class AbstractExample2 {
	
	public static void main(String [] args)
	{
		
		ABC abc = new BCA();
		
		abc.abstractMethod();
	}
}

