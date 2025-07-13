package com.nit.digit_sum_tester;

import java.util.Scanner;

public class DigitSumTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		

        System.out.print("Enter the position (n): ");
        int position = sc.nextInt();

        // Create an instance of DigitSum with the provided number
        DigitSum digitSum = new DigitSum(num);

        // Call the addFirstAndNthDigit method and display the result
        int result = digitSum.addFirstAndNthDigit(position);
        System.out.println("Result of adding the first digit and the " + position + "th digit: " + result);

        sc.close();
	}

}
