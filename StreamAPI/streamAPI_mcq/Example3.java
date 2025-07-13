package com.nit.streamAPI_mcq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
	
		Optional<Integer> max = list.stream().max((x,y) -> x.compareTo(y));
		
		System.out.println(max);
	}

}

/*
 * OUTPUT => Optional[16] 
 */