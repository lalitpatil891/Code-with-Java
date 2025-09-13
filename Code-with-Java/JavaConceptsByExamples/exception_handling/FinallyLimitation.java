package com.nit.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation 
{	
	public static void main(String[] args) 
	{
		Scanner sc = null;
        try
        {
        	sc = new Scanner(System.in);
        	System.out.print("Enter your Age :");
        	int age = sc.nextInt();
        	System.out.println("Age is :"+age);
        	
        }
        catch(InputMismatchException e)
        {
        	System.err.println("Input mismatched..");
        }
		finally
		{
			System.out.println("Inside finally");
			sc.close();
		}
	}
}