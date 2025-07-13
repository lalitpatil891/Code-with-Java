//Quetion 1
package com.nit.exam_25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter withdrawal Amount: ");
			double amt = sc.nextDouble();

			if (amt < 0) {
				System.out.println("Invalid Amount!!");
			} else {
				System.out.println("You entered withdrawal amount:"+amt);
			}
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
}
