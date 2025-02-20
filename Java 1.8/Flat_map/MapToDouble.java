//package com.nit.flat_map;

import java.util.ArrayList;

// Record to represent a Product with pid, name, and price
record Product(Integer pid, String name, Double price) {
}

public class MapToDouble {

	public static void main(String[] args) {

		// Creating a list to store Product objects
		ArrayList<Product> productList = new ArrayList<>();

		// Adding Product objects to the list
		productList.add(new Product(21, "Camera", 12000D));
		productList.add(new Product(23, "Mobile", 12000D));
		productList.add(new Product(25, "Laptop", 12000D));
		productList.add(new Product(28, "HeadPhone", 12000D));
		productList.add(new Product(30, "Apple Phone", 12000D));

		// Finding the total cost of all the products using mapToDouble and sum
		double sum = productList.stream()
				.mapToDouble(Product::price) // Extracting price from each product
				.sum(); // Summing up the prices

		// Printing the total cost
		System.out.println("Total Cost for all the products: " + sum); // Output: Total Cost for all the products: 60000.0
	}
}
