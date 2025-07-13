package com.nit.pass_by_value;

public class Product {
	
	private double productPrice = 12000;
	
	public void setProductPrice(double productPrice)
	{
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productPrice=" + productPrice + "]";
	}
	
	
}
