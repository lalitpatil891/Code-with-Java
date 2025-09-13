package com.nit.list_Interface_examples;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>(2);
		
		ArrayList<String> list = new ArrayList<String>();
		//adding elements
		
		cities.add("Mumbai");
		cities.add("Delhi");      
		cities.add(null);
		cities.add(2, "Pune");
		cities.add(2, "hyderabad");
		cities.add("Nagpur");
		cities.add(1, "Nandurbar");
		cities.set(0, "Dhule");
		
		//cities.removeLast();
		//cities.removeFirst();
		
		System.out.println(cities);
		
		//remove from cities list pune
		
		
		System.out.println(cities.get(1));
		System.out.println(cities.size());
		System.out.println(cities.toArray());
		System.out.println(cities.addAll(cities));
		System.out.println(cities.contains(list));
	
		
		
	}

}
