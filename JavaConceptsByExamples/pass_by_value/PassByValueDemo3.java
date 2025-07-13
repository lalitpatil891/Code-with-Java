package com.nit.pass_by_value;

public class PassByValueDemo3 {

	public static void main(String[] args) {
		
		Product p1 = new Product();  //12000
		accept(p1);
		System.out.println(p1);   //18000
	}
	
	public static void accept(Product prod)
	{
		prod.setProductPrice(18000);
	}

}


//Product [productPrice=18000.0]