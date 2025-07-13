package com.nit.streamAPI_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(13);
		list.add(16);
		list.add(18);
		list.add(3);
 		list.add(7);
		
		//find odd num using filter
		List<Integer> list2 = list.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
		
		System.out.println("List 1: "+list);		
		System.out.println("List 2: "+list2);	
	}
}


/* OUTPUT
List 1: [10, 13, 16, 18, 3, 7]
List 2: [13, 3, 7]
*/
