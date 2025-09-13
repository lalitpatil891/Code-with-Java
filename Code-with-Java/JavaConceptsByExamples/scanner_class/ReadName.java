//WAP to read your name from end user.

package com.nit.scanner_class;

import java.util.Scanner;

public class ReadName {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Your name is: " +name);
	}
}


