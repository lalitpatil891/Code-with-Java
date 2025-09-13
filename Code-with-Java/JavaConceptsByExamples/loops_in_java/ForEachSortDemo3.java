package com.nit.loops_in_java;

import java.util.Arrays;

public class ForEachSortDemo3 {

	public static void main(String[] args) {
		
		String[] fruits = {"Mango","Apple", "Guava", "Grapes"};
		
		Arrays.sort(fruits);
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
	}
}

/*
Output

Apple
Grapes
Guava
Mango

*/
