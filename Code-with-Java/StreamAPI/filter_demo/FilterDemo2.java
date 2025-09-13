//Retrieve cities which starts whith "H" character in string array

package com.nit.filter_demo;

import java.util.Arrays;

public class FilterDemo2 {

	public static void main(String[] args) {

		String []cities = {"Hyderabad", "Jaipur", "Haryana", "indore", "Channai"};
		
		System.out.println("Original  citie list : "+Arrays.toString(cities));
		
		Object[] array = Arrays.stream(cities).filter(str -> str.startsWith("H")).toArray();
		
		
		System.out.println("City which start with character 'H'"+Arrays.toString(array));
		
	}

}
