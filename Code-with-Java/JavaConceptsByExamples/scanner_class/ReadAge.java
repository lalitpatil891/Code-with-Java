//

package com.nit.scanner_class;

import java.util.Scanner;

public class ReadAge {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your Age: ");
		int Age = sc.nextInt();
		
		//System.out.println("Your Age is : "+Age);
		
		
		
		
		System.out.print("Your Age is : " +Age+ "AND Your name is : "+name );
		sc.close();
	}
}

/*
OUTPUT

Enter your Age: 30
Your Age is : 30
*/