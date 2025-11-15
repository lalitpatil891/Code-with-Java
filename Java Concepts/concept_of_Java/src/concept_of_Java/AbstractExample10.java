package concept_of_Java;

/* 
 * Check output
 * 
 */

abstract class O {
	
	public O() {
		System.out.println("ONE");
	}
	
	abstract void abstractMethod();
}

class P extends O {
	public P() {
		System.out.println("TWO");
	}
	
	@Override
	void abstractMethod() {
		System.out.println("THREE");
	}
}



public class AbstractExample10 {
	
	public static void main(String [] args)
	{
		
		O o = new P();
		
		o.abstractMethod();
	}
}

/*
OUTPUT

ONE
TWO
THREE
*/

