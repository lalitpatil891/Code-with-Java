package com.nit.exception_handling;

import java.util.Scanner;

public class CustomerDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Client, Welcome to my application :");
		
		Scanner sc = new Scanner(System.in);
		try
		  {
			   System.out.print("Enter the value of x :");
			   int x = sc.nextInt();
			   

			   System.out.print("Enter the value of y :");
			   int y = sc.nextInt();
			   
			   
			   int result = x /y;
			   System.out.println("Result is :"+result);		 

		   }
		   catch(Exception e)
		   {
			    System.err.println("Please don't put zero here");
		   }

		   System.out.println("Thank you for Visiting my application !!");
		   sc.close();
	}

}