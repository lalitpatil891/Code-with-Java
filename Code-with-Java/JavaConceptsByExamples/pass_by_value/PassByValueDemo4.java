package com.nit.pass_by_value;

public class PassByValueDemo4 {

	public static void main(String[] args) {
		
		Product p1 = new Product();   //12000
		accept(p1);
		System.out.println(p1);  //12000
	}
	
	public static void accept(Product prod)
	{
		prod = new Product(); //new another object
		prod.setProductPrice(18000);
	
	}

	
}
