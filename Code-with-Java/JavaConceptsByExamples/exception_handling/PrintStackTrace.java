package com.nit.exception_handling;

public class PrintStackTrace 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method started");
		
		try
		{
			String str = null;
			System.out.println(str.toUpperCase());			
		}
		catch(Exception e)
		{
			System.out.println("Ref variable is pointing to null");
			System.out.println("...............");
			System.out.println(e.getMessage());
			System.out.println("...............");
			System.out.println(e.toString());
			System.out.println("...............");
			e.printStackTrace();				
		}	
		
		System.out.println("Main Method ended");
	}

}