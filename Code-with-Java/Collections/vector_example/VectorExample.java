package com.nit.vector_example;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> lang = new Vector<>(2, 5);
		
		lang.add("Java");
		lang.add("c");
		lang.add("react");
		lang.add("html");
		lang.add("Java");
		
		System.out.println("Vector is: "+lang);
		
		System.out.println("Vector Capacity : "+lang.capacity());
		System.out.println("Vecto Size: "+lang.size());
		
		
	}
}


/**
OUTPUT

Vector is: [Java, c, react, html]
Vector Capacity : 7
Vecto Size: 4
*/