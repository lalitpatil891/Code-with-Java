package com.nit.ArrayListExample;

import java.util.ArrayList;

class Array {
	private ArrayList<Integer> list;

	public Array() {
		list = new ArrayList<>();
	}

	public void addNum(Integer num) {

		if (list.contains(num)) {  //in the array elements not equal   20==20 false
			
			System.out.println("The number is already exits");
			
			
		} else {
			list.add(num);
			System.out.println("A value:"+num+" added SuccessFully..!");
			
		}

	}
	
	public void displayList() {
		System.out.println(list);
	}
}

public class ArrayListExample {

	public static void main(String[] args) {

		Array newNum = new Array();
		/*
		 * //Array of Integer list = new ArrayList<>();
		 * 
		 * list.add(10); list.add(20); list.add(30); //list.add(1, 90); //[10, 90, 20,
		 * 30]
		 */
		newNum.displayList();
		newNum.addNum(30);
		newNum.addNum(40);
		newNum.addNum(60);
		newNum.addNum(50);
		
		newNum.addNum(40);
		
		newNum.displayList();
		
		

		/*
		 * System.out.println("Index at"+list.get(1)); //20
		 * System.out.println("List is:"+list); //List is:[10, 20, 30]
		 * System.out.println("Reversed: "+list.reversed());
		 * System.out.println("Index is: "+list.indexOf(30)); //Index is: 2
		 * System.out.println(list.isEmpty()); //false
		 * System.out.println("First element: " +list.getFirst());
		 * System.out.println("Last element: "+list.getLast());
		 * 
		 * System.out.println("Size: "+list.size());
		 */

	

	}

}

/**
 * Index at90 List is:[10, 90, 20, 30] Reversed: [30, 20, 90, 10] Index is: 3
 * false First element: 10 Last element: 30
 * 
 */