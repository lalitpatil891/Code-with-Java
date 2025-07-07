package com.nit.streamAPI_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example5 {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("AB");
		list.add("ABC");
		list.add("ABCD");
		
		System.out.println("List Before: "+list);
		
		//if length() 2 or more print that words only
		List<String> list2 = list.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
		
	
		
		System.out.println("List Atfer Modification: "+list2);
		
		
	}

}

/*
 * OUTPUT
 * 
 * List Before: [A, AB, ABC, ABCD]
 * List Atfer Modification: [AB, ABC, ABCD]
 */