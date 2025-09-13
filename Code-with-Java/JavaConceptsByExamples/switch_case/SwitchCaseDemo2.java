package com.nit.switch_case;

import java.util.Scanner;

public class SwitchCaseDemo2 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of the Season: ");
		String season = sc.next().toUpperCase();
		
		switch(season)
		{
			case "SUMMER" :  System.out.println("It is a Summer Season");
								break;
								
			case "RAINY" : 	System.out.println("It is Rainy Season!!");
							break;
		}
	}
}


/* OUTPUT
 * 
 * Enter the name of the Season: summer
 * It is a Summer Season
 */