/**
 *  toArray(IntFunction<T[]> generator) 
 *  
 *  -> This variant allows creating an array of a specific type.
 */

package com.nit.toString;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToStringDemo2 {

	public static void main(String[] args) {

		Stream<String> nameStream = Stream.of("Alice","Bob", "Charlie");
		
	   String []nameArray = nameStream.toArray(String[]::new);
		
		System.out.println("The array is: "+Arrays.toString(nameArray));
		
	}
}
