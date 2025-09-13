package streamAPI.flatMap;

import java.util.*;
import java.util.Arrays;
import java.util.List;

class Product
{
	private Integer productId;
	private List<String> listOfProducts;
	public Product(Integer productId, List<String> listOfProducts) {
		super();
		this.productId = productId;
		this.listOfProducts = listOfProducts;
	}
	
	public Integer getProductId() {
		return productId;
	}

	public List<String> getListOfProducts() {
		return listOfProducts;
	}	
}

public class FlatMapDemo5 {

	public static void main(String[] args) {
		
		List<Product> listOfProduct = Arrays.asList(
				new Product(1, Arrays.asList("Camera", "Mobile", "Laptop")),
				new Product(2, Arrays.asList("Bat", "Ball", "Wicket")),
				new Product(3, Arrays.asList("Chair", "Table", "Lamp")),
				new Product(4, Arrays.asList("Cycle", "Bike", "Car"))
				
				);
		
		List<String> list = listOfProduct.stream().
				flatMap(prod -> prod.getListOfProducts().stream()).toList();
		
		System.out.println(list);
		
	}

}








