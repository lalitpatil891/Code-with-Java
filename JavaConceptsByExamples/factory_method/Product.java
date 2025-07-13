package com.nit.factory_method;

import java.util.Scanner;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	public static Product getProductObject()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Product Name: ");
		String pname = sc.nextLine();
		pname = sc.nextLine();
		
		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();
		
		return new Product(id, pname, price);
	}	
}
