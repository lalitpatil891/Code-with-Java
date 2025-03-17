package com.nit.product_class_properties_and_behaviour_parameter;

public class Product {
	
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData(int productId, String productName, double productPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void getProductInfo() {
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
	}
}
