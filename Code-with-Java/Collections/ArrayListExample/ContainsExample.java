package com.nit.ArrayListExample;

import java.util.*;

public class ContainsExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		int num = 40;
		
		if(numbers.contains(num)) {
			System.out.println("20 present in the array");
		}
		else
		{
			numbers.add(num);
			System.out.println("20 not present");
		}
		
		
		
		System.out.println(numbers);
	}

}
