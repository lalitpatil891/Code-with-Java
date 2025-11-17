package AbstractClassExamples;

/* Which class is instantiable? Class A or Class B?
 * 
 * -> Class B
 * */

abstract class X {
	
}

class Y extends X{
	
}

public class AbstractExample3 {
	
	public static void main(String [] args)
	{
		X x = new Y();	
	}
}
