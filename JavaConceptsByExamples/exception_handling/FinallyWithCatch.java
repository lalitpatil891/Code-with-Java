package com.nit.exception_handling;

public class FinallyWithCatch {

	public static void main(String[] args) {
		
		try {
			int []x = new int [-2];
			x[0] = 12;
			x[1] =15;
			System.out.println(x[0]+" : "+x[1]);
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array Size is in negative value...");
		}
		
		finally
		{
			System.out.println("Resource will be handled here!!");
		}
		
		System.out.println("Main method ended!!!");
	}

}
