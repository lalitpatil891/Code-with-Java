/**WAP to filter all the prime number from the given array.*/

package com.nit.filter_demo;

import java.util.*;

public class FilterDemo5 {

	public static void main(String[] args) {

		int[] numbers = {2,3,4,5,6,7,8,9,10,11,13};
		
		//filtering prime numbers
		int[] primeNumbers = Arrays.stream(numbers).filter(FilterDemo5::isPrime)
				.toArray();
		
		System.out.println("Prime Numbers:" +Arrays.toString(primeNumbers));		
	}
	
	private static boolean isPrime(int num) {
		if(num<2)
		{
			return false;
		}
		for(int i=2; i<=Math.sqrt(num);i++)
		{
			if(num%i ==0)
			{
				return false;
			}
		}
		return true;
	}
}

