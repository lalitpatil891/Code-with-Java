/* #0005  OOP Day - 3
 * 	Write a Program on OOPs to define Product class properties and behaviour.
 * 
 */

package com.nit.product_class_properties_and_behaviour_parameter;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Product Name: ");
		 sc.nextLine();
		String name = sc.nextLine();
		
		
		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();
		
		Product pro = new Product();
		pro.setProductData(id, name, price);
		
		pro.getProductInfo();
		
		sc.close();
	}
}
