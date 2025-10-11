package flatmap;

import java.util.ArrayList;


//Reacord to represent a product with pid, name and price
record Product(Integer pid, String name, Double price) {
	
}


public class MapToDouble {

	public static void main(String[] args) {

		//Creating  a list to store product objects
		ArrayList<Product> productList = new ArrayList<>();
		
		//Adding product object to the list
		productList.add(new Product(21, "Camera", 12000D));
		productList.add(new Product(23, "Mobile", 12000D));
		productList.add(new Product(25, "Laptop", 12000D));
		productList.add(new Product(28, "HeadPhone", 12000D));
		productList.add(new Product(30, "Apple Phone", 12000D));
		
		
		//finding the total cost of all the products using mapToDouble and sum
		double sum = productList.stream().mapToDouble(Product::price) //Extracting price from Each product
 				.sum(); //Summing up the prices
		
		
		//printing the total cost
		System.out.println("Total COst all the products: "+sum);
		//OUtput : Total COst all the products: 60000.0
		

	}

}
