package com.nit.switch_case;

import java.util.Scanner;

public class SwitchCaseDemo1
{
	
	public static void main(String[] args)
	{
		System.out.println("\t\t** Menu **");
		System.out.println("\t\t** 100 Police**");
		System.out.println("\t\t** 101 Fire**");
		System.out.println("\t\t** 102 Ambulance**");
		System.out.println("\t\t** 139 Railway**");
		System.out.println("\t\t** 181 Women's Helpline**");
		
		
		System.out.println("Enter Your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 100:  System.out.println("police Service.");
					break;
		
		case 101:	System.out.println("Fire Service");
					break;
		
		case 102: System.out.println("Ambulance");
					break;
		
		case 139: System.out.println("Railway");
					break;
					
		case 181: System.out.println("Women's Helpline");
					break;
		
		default :	System.out.println("Your choice is wrong");
		}
	}
			
}
