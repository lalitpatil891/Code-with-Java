package AbstractClassExamples;

abstract class E {
	
	abstract void firstMethod();
	
	void secondMethod() {
		System.out.println("SECOND");
		
		firstMethod();
	}
}

abstract class F extends E {
	
	@Override
	void firstMethod() {
		System.out.println("FIRST");
		
		thirdMethod();
	}
	
	abstract void thirdMethod();	
}

class G extends F {

	@Override
	void thirdMethod() {
		System.out.println("THIRD");
	}
}

public class AbstractExample9 {
	
	public static void main(String [] args)
	{
		G g = new G();
		
		g.firstMethod();
		
		g.secondMethod();
		
		g.thirdMethod();
		
	}
}


/*OUTOUT
FIRST
THIRD
SECOND
FIRST
THIRD
THIRD

*/