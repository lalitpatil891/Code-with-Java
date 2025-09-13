package com.nit.streamAPI_mcq;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		//create an empty list 
		List<Integer> list = new ArrayList<>();

		//add list elements
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(114);
		
		//remove duplicates & and store new list2
		List<Integer> list2 = list.stream().distinct().toList();
			
		//print the list2
		System.out.println(list2);

	}
}

/*OUTPUT
 * 
 * [12, 13, 114]
*/
