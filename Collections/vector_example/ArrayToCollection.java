package com.nit.vector_example;

import java.util.*;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		Vector<Integer> num = new Vector<>();
		
		System.out.println("Before Vector is: "+num);
		
		int arr[] = {22,20,10,40,15,58};
		
		
		//Add arr[] value in vector num
		for(int i=0; i<arr.length; i++)
		{
			num.add(arr[i]);
		}
		
		System.out.println("After Vector is: "+num);
		
		Collections.sort(num);
		
		System.out.println("After Sorting:"+num);
		
		System.out.println("Maximum element is: "+Collections.max(num));
		System.out.println("Minimum element is: "+Collections.min(num));
		

		num.forEach(y -> System.out.print(y+" "));
		
		System.out.println("");
		Collections.reverse(num);
		
		num.forEach(y -> System.out.print(y+" "));
		
		// 	How to convert collection to array
		Object[] array = num.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
	
	
	}

}
