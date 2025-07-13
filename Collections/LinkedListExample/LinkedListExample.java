package com.nit.LinkedListExample;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//LinkedList of Strings
		LinkedList<String> animals = new LinkedList<>();
		
		//Adding Elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		
		System.out.println("Animals: "+animals);
		
		animals.addFirst("Elephant");
		animals.addLast("Tiger");
		
		
		System.out.println("After adding first & Last :"+animals);
		
		animals.removeFirst();
		System.out.println("After Removing first: "+animals);
		
		System.out.println("Size: "+animals.size());  //4
		
	}

}


/**Animals: [Dog, Cat, Horse]
After adding first & Last :[Elephant, Dog, Cat, Horse, Tiger]
After Removing first: [Dog, Cat, Horse, Tiger]
Size: 4

*/