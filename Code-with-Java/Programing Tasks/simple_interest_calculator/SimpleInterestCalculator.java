/**Program-3  ---- Java Basics (DAY 5)
----------
Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.

Explanation:
Simple Interest formula: SI = P*R*T/100
Total Amount formula: A = P + SI

Sample Input :
Principal (P): 5000
Rate of Interest (R): 5
Time (T in years): 3

Sample Output :
Simple Interest (SI): 750.0
Total Amount (A): 5750.0

=========================================*/

package com.nit.simple_interest_calculator;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Principle: ");
		double principle = sc.nextDouble();

		System.out.print("Enter Rate of Interest(R): ");
		double rateOfInterest = sc.nextDouble();

		System.out.print("Enter Time(In Years):");
		double time = sc.nextDouble();

		double simpleInterest = principle * rateOfInterest * time / 100;

		double totalAmount = principle + simpleInterest;

		// Print Result
		System.out.println("Simple Interest(SI): " + simpleInterest);
		System.out.println("Total Amount : " + totalAmount);

		sc.close();
	}
}


