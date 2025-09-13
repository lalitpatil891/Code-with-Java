package com.nit.factory_method;

import java.util.Scanner;
public class ProductDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many product object: ");
		int noOfObj = sc.nextInt();
		double totalPrice;
		
		for(int i=1; i<= noOfObj; i++)
		{
			Product object = Product.getProductObject();
			System.out.println(object);
			
		}
		sc.close();
		
	}

}
