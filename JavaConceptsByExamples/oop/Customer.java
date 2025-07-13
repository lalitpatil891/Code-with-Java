//Initializing the Object properties using Method without parameter (Using Scanner class) :

package com.nit.oop;

import java.util.Scanner;

public class Customer {
	int customerId;
	String customerName;
	double customerBill;
	
	//Initialize the Object Properties
	
	public void setCustomerData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer Name: ");
		//customerName = sc.nextLine();
		customerName = sc.nextLine();
		
		
		System.out.print("Enter Customer Id: ");
		customerId = sc.nextInt();
		
		
		
		System.out.print("Enter Customer Bill :");
		customerBill = sc.nextDouble();
		
		sc.close();
		
	}


//Printing the Object Properties

		public void getCustomerData()
		{
			System.out.println("Customer Id is: " +customerId);
			System.out.println("Customer Name is: "+customerName);
			System.out.println("Customer Bill is: "+customerBill);
		}
}
