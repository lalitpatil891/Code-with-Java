package com.nit.exception_handling;

import java.util.Scanner;

public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Main Method started...");

		Scanner sc = new Scanner(System.in);

		try {

			System.out.print("Enter x: ");
			int x = sc.nextInt();

			System.out.println("Enter y: ");
			int y = sc.nextInt();

			int result = x / y;
			System.out.println("Ans : " + result);

		} catch (Exception e) {
			System.out.println("Inside catch.//");
			System.out.println(e);
		}

		System.out.println("Main Method Ended...");
		sc.close();

	}
}

/*
Output
Main Method started...
Enter x: 8
Enter y: 
0
Inside catch.//
java.lang.ArithmeticException: / by zero
Main Method Ended...
 */


/**
 * In the above program if we put the value of y as 0 but still program will be executed normally because we have used try-catch so it is a 
normal termination even we have an exception in the program.*/
