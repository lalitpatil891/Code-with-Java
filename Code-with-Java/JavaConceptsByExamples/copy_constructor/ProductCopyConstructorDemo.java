package com.nit.copy_constructor;

public class ProductCopyConstructorDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product(1,"Camera");
		System.out.println("P1 = "+p1);
		
		Product p2 = new Product(p1);
		System.out.println("P2 = " +p2);

	}

}
