package com.nit.filter_demo;

import java.util.*;

public class RetrieveAllEvenNumFromArrayUsingStreamAPI {

	public static void main(String[] args) {
		
		int []arr = {10,15,20,25,30,35,40,45,50};
		
		System.out.print("arr is: ");
		for(int ar: arr)
		{
			System.out.print(ar+" ");
		}
		
		int []array = Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
		
		System.out.println("\nArray which contains even nubmer: "+Arrays.toString(array));
		
	}
	

}
