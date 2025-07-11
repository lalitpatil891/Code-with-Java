package com.nit.exception_handling;

import java.util.Scanner;

public class ExceptionPropagationUsingChecked {

	public static void main(String[] args) {
		System.out.println("Main method Started!!!");
		try {
			m1();
		} catch (ClassNotFoundException e) {
			System.out.println("Handled by main method");
		}
		System.out.println("Main method Ended!!!");
	}

	public static void m1() throws ClassNotFoundException {
		System.out.println("M1 method Started!!!");
		m2();
		System.out.println("M1 method Ended!!!");
	}

	public static void m2() throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your FQN (class Name :) :");
		String className = sc.next();

		Class.forName(className);
		sc.close();

	}

}

class Fooo {
	static {
		System.out.println("Static Block");
	}
}
