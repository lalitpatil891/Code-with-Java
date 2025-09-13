package com.nit.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Predicate<Integer> isEven = (num) -> num % 2 == 0;

		// System.out.println(isEven.test(10));
		// System.out.println(isEven.test(7));

		System.out.print("Enter num: ");
		int num = sc.nextInt();

		boolean even = isEven.test(num);

		if (even) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}

}
