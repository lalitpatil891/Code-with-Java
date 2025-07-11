package com.nit.exception_handling;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("The main method Started.");
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		
		int result = x/y;
		
		System.out.println("The ans is : "+result);
		
		} catch(ArithmeticException e) {
			
		    System.out.println("Catch block");
			System.err.println("Y value never 0.");
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		System.out.println("main method end");
		sc.close();

	}

}
