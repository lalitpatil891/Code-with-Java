package com.nit.exception_handling;

public class MultiCatch {

	public static void main(String[] args) {

		System.out.println("Main Started");

		try
		{
			String str1 = "null";
			System.out.println(str1.toUpperCase());  //NULL
			
			String str2 = "Ravi";
			int x = Integer.parseInt(str2);
			System.out.println("Number is: "+x);
		}
		catch(NumberFormatException | NullPointerException e )
		{
			if(e instanceof NumberFormatException)
			{
				System.out.println("Number is not in a proper format");
			}
			else if (e instanceof NullPointerException)
			{
				System.out.println("ref variable is pointing to null");
			}
		}
		System.out.println("Main Ended...");

	}

}
