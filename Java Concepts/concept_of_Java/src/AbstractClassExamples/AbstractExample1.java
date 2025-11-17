package AbstractClassExamples;
/*Below class ABC doesn’t have even a single abstract method, but it has been declared as abstract. Is it correct?
Yes, it is correct. abstract classes may or may not have abstract methods. */

abstract class ABC {
	
	void firstMethod() {
		System.out.println("First Method");
	}
	
	void secondMethod() {
		System.out.println("Second Method");
	}
}

class BCA extends ABC {
	
}

public class AbstractExample1 {
	
	public static void main(String [] args)
	{
		
		ABC abc = new BCA();
		abc.firstMethod();
		abc.secondMethod();
	}
}

//ABC is an abstract class, so you cannot create an object of an abstract class.
