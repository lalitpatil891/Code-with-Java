package com.nit.exception_handling;

public class MultipleCatch {

	public static void main(String[] args) {

		System.out.println("Main Started...");

		try {
			int c = 10 / 2;
			System.out.println("c value is: " + c);

			int[] x = { 12, 78, 56 };
			System.out.println(x[4]);
			
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println("Array is out of limit...");
		} catch (ArithmeticException e1) {
			System.err.println("Divide By zero problem...");
		} catch (Exception e1) {
			System.out.println("General ");
		}
		System.out.println("Main Ended...");
	}

}


/* OUTPUT

Main Started...
c value is: 5
Array is out of limit...
Main Ended...

*/