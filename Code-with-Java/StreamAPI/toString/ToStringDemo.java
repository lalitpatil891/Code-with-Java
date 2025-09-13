/**
 * toArray() [without Arguments]
 */

package com.nit.toString;

import java.util.stream.Stream;
import java.util.Arrays;

public class ToStringDemo {

	public static void main(String[] args) {
		
		Stream<String> nameStream = Stream.of("mumbai", "hyd", "pune", "nagpur");
		
		Object[] nameArray = nameStream.toArray();
		
		//Arrays.stream(nameArray).forEach(System.out::println);
		
		System.out.println(Arrays.toString(nameArray));
		
	}

}


/**⚠️ Limitation: Since it returns an Object[], you may need to cast elements when working with specific types.

*/