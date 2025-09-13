package com.nit.filter_demo;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int[] arr = {10, 15,20,25,30,40,45};
		
		int sum = Arrays.stream(arr).sum();
		
		Arrays.stream(arr).forEach(System.out::println);
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("Sum is: "+sum);	
	}
}



