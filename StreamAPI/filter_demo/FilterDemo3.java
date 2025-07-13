/**
 * WAP to print all the array elements which are divisible by 3 and 5
 * */

package com.nit.filter_demo;

import java.util.*;

public class FilterDemo3 {

	public static void main(String[] args) {
		
		Integer []number = {15,20,30,45,75,90,100};
		
		System.out.println("Original : "+Arrays.toString(number));
		
		Object []array = Arrays.stream(number).
						filter(n -> n%3 == 0 && n% 5 ==0).
						toArray();
		
		System.out.println(Arrays.toString(array));
		
	}

}
