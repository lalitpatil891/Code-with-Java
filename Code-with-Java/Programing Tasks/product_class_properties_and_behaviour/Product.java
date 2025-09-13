package com.nit.product_class_properties_and_behaviour;

import java.util.Scanner;

public class Product {
	
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product ID: ");
		productId = sc.nextInt();
		
		System.out.print("Enter Product Name: ");
		productName = sc.nextLine();
		productName = sc.nextLine();
		System.out.print("Enter Product Price: ");
		productPrice = sc.nextDouble();
		
		sc.close();
	}
	
	public void getProductInfo() {
		
		System.out.println("Product Id is: "+productId);
		System.out.println("Product Name is: "+productName);
		System.out.println("Product Price is: "+productPrice);
	}
	
}
