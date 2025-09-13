package com.nit.exception_handling;

public class InfinityFloatingPoint {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		System.out.println(10/0.0);
		System.out.println(-10/0.0);
		System.out.println(0/0.0);
		System.out.println(10/0);
		System.out.println("Main Ended");
	}

}


/* Output
Main Started
Infinity
-Infinity
NaN
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.nit.exception_handling.InfinityFloatingPoint.main(InfinityFloatingPoint.java:11)
*/