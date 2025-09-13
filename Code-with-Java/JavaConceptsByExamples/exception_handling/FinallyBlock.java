package com.nit.exception_handling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
			
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
	}

}

/**Note :- In the above program finally block will be executed, even we have an exception in the try block but here only the resourses will be handled but not the exception.*/