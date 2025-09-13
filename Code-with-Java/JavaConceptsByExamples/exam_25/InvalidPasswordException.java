package com.nit.exam_25;

import java.util.Scanner;

public class InvalidPasswordException {

	public static void validatePassword(String password) {
		
		try {
			if(password.charAt(1) <= 'A' && password.charAt(1) >= 'Z') {
			}
			else
			{
				System.out.printlns
			}
	
		}
		
		
		
	
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Password: ");
		String password = sc.nextLine();

		validatePassword(password);

	}

}
