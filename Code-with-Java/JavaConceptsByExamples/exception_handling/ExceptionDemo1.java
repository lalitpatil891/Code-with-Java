package exception_handling;

class Foo
{
	
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try
		{
			throw new Foo();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

/**
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
 * No exception of type Foo can be thrown; an exception type must be a subclass
 * of Throwable
 * 
 * at exception_handling.ExceptionDemo1.main(ExceptionDemo1.java:13)
 */
