package com.nit.factory_method;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("How many Objects you want?");
			int noOfObj = sc.nextInt();
			
			for(int i=1; i <= noOfObj; i++)
			{
				Employee object = Employee.getEmployeeObject();
				System.out.println(object);
				
			}
			sc.close();		
			
			
	}	
}
