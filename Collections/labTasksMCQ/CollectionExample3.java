package com.nit.labTasksMCQ;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample3 {

	public static void main(String[] args) {
		
	
		//Creating an Empty ArrayList of String
		ArrayList<String> al = new ArrayList<>();

		//Adding all Elements in the list
		al.add("25");		
		al.add("Naresh");
		al.add("A");
		al.add("37");
		
		// List = [25, Naresh, A , 37]
		
		
		Iterator<String> it = al.iterator();
		
		//print each Element using While loop
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}

//OUTPUT -> 25 Naresh A 37