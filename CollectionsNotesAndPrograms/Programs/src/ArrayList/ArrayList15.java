//Iteratating ArrayList using Iterator, ListIterator, Enumeration

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList15 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		
		System.out.println("Original ArrayList: " + list);
		
		System.out.println("--Using Iterator--");

		// Call iterator() method to iterate over the elements.
		Iterator<Integer> itr = list.iterator();

		// Checking the next element availability using reference variable itr.
		while (itr.hasNext()) {
			// Moving the cursor to next element using reference variable itr.
			Integer it = itr.next(); // Here, return type is an integer.
			System.out.println(it);
		}
		System.out.println("--Iterating in forwarding direction using ListIterator--");

		// Call ListIterator() method to iterate over the elements.
		ListIterator<Integer> litr = list.listIterator();

		// Checking the next element availability using reference variable litr.
		while (litr.hasNext()) {
			Integer lit = litr.next();
			System.out.println(lit);
		}
		System.out.println("--Using Enumeration-- ");

		Enumeration<Integer> enumlist = Collections.enumeration(list);
		while (enumlist.hasMoreElements()) {
			System.out.println(enumlist.nextElement());
		}
		System.out.println("--Using Enhanced for loop--");
		for (Integer in : list) {
			System.out.println(in);
		}
	}
}
