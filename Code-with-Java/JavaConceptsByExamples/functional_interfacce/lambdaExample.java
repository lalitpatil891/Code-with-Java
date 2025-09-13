package com.nit.functional_interfacce;

@FunctionalInterface
interface SquareFinder {

	void findSquare(int num);
}

public class lambdaExample {

	public static void main(String[] args) {

		// Using lambda expression to implement the functional interface
		SquareFinder square = (num) -> System.out.println("Square is: " + (num * num));

		// calling the method
		square.findSquare(5); // Output: Square is: 25

	}

}
