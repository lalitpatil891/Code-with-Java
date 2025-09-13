package com.nit.fetch_the_collection_object_nine_ways;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject {

	public static void main(String[] args) {

		Vector<String> listOfCity = new Vector<>();
		
		listOfCity.add("Hyderabad");
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Indore");
		listOfCity.add("kolkata");
		
		//1) By using toString() method
		System.out.println("1) By using toString() method "+listOfCity.toString());
		
		System.out.println("----------------------------------");
		
		//2) by using Ordinary for loop:
		System.out.println("2) by using Ordinary for loop:");
		for(int i=0; i<listOfCity.size(); i++)
		{
			System.out.print(listOfCity.get(i)+" ");
		}
	
		System.out.println("\n----------------------------------");
	
		//3) By using forEach
		System.out.println("3) By using forEach: ");
		
		for(String list: listOfCity) {
			System.out.print(list+" ");
		}
	
		System.out.println("\n----------------------------------");
		
		//4) By using Enumeration interface
		System.out.println("4) By using Enumeration interface");
		Enumeration<String> ele = listOfCity.elements();
		while(ele.hasMoreElements()) {
			System.out.print(ele.nextElement()+" ");
		}
		
		System.out.println("----------------------------------");
		//5) By using Iterator interface
		System.out.println("5) By using Iterator interface");
		
		Iterator<String> itr = listOfCity.iterator();
		itr.forEachRemaining(city -> System.out.println(city));
		
		System.out.println("----------------------------------");
		
		System.out.println("6) By using listIterator interface");
		
		ListIterator<String> lstItr = listOfCity.listIterator();
		//In forward Direction
		while(lstItr.hasNext()) {
			System.out.print(lstItr.next()+" ");
		}
		
		System.out.println("\nin backward direction");
		while(lstItr.hasPrevious())
		{
			System.out.print(lstItr.previous() +" ");
		}
		
		System.out.println("----------------------------------");
		//7) By using SplIterator interFace
		System.out.println("7) By using SplIterator interFace");
		
		Spliterator<String> splItr = listOfCity.spliterator();
		splItr.forEachRemaining(city -> System.out.println(city));
		
		System.out.println("----------------------------------");

		//8) by using SplIterator interface
		System.out.println("8) by using forEach() method");
		listOfCity.forEach(city -> System.out.print(city+" "));
		
		
		System.out.println("----------------------------------");
		//9) by using Method Reference
		
		System.out.println("9) by using Method Reference");
		listOfCity.forEach(System.out::println);
		
		
		System.out.println("----------------------------------");
		
		
	}

}
