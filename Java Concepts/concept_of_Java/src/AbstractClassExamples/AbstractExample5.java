package AbstractClassExamples;

/* 5) Is the following program written correctly? If yes, what value “result” variable will hold if you run the program?
 * 
 * Yes, program is written correctly. result = 30.
 * 
 */
 

abstract class Calculate
{
    abstract int add(int a, int b);
}

public class AbstractExample5 {
	
	public static void main(String [] args)
	{
		 int result = new Calculate()
	     {   
	            @Override
	            int add(int a, int b)
	            {
	                return a+b;
	            }
	     }.add(10, 20);
	        
	     System.out.println(result);
	}
}

