package AbstractClassExamples;

/* 
 * 16) Can you identify the error in the below code?
 * 
 *  Constructors can't be abstract.
 */
 
class X
{
    public X()
    {
        System.out.println("Constructor One");
    }
     
    abstract X(int i)   //Constructors can't be abstract.
    {
        System.out.println("Constructor Two");
    }
}

public class AbstractExample16 {
	
	public static void main(String [] args)
	{
		
		
	}
}

