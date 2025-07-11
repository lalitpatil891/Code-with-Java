package com.nit.switch_case;

import java.util.*;

public class SwitchCaseDemo0 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter a character: ");
		char colour = sc.next().toLowerCase().charAt(0);
		
		switch(colour)
		{
			case 'r' : 	System.out.println("Red");
						break;
			
			case 'g' :  System.out.println("Green");
						break;
			
			case 'b' :  System.out.println("Black");
						break;
						
			case 'w' :  System.out.println("White");
						break;
						
			default  : System.out.println("No Colour");
		}
		System.out.println("Completed");
						
		}
	}
