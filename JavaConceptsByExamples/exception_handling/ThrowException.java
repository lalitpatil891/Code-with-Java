package com.nit.exception_handling;

public class ThrowException 
{
	public static void main(String[] args) 
	{
		try
		{	
		  //System.out.println(10/0);
		            //OR
	     throw new ArithmeticException("Ravi is dividing a number by zero");			
		}
		
		catch(Exception e)
		{
			System.out.println("Catch Block");
			System.err.println(e);
		}
		System.out.println("Main completed!!!");
	}

}
