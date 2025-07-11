package com.nit.exception_handling;

import java.util.Scanner;

public class ExceptionPropagationUsingUnchecked
{
	public static void main(String [] args)
	{
	   System.out.println("Main method Started!!!");
	   try
	   {
		   m1();
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("Handled by main");
	   }
	   System.out.println("Main method Ended!!!");
	}

	public static void m1()
	{
	   System.out.println("M1 method Started!!!");
	   m2();
	   System.out.println("M1 method Ended!!!");
	}
	
	public static void m2()
	{
	       Scanner sc = new Scanner(System.in);
	   	   System.out.print("Enter the value of x :");
		   int x = sc.nextInt();
		   System.out.print("Enter the value of y :");
		   int y = sc.nextInt();
		   int result = x /y;
		   System.out.println("result is :"+result);
	       sc.close();
	   
	}

}