//ArrayList Program based on isEmpty, Size, and Clear methods
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList16 {

	public static void main(String[] args) {

		// Creates an array with an initial capacity of 10.
		List<String> list = new ArrayList<String>();

		// Call isEmpty() method to check elements in the list.
		boolean b = list.isEmpty(); // It will return true if this list contains no elements.
		System.out.println(b);

		// Adding elements to the end of list.
		list.add("INDIA");
		list.add("USA");
		list.add("SRILANKA");
		list.add("JAPAN");
		list.add("FRANCE");
		System.out.println("Original ArrayList insertion order: " + list);

		// Call size() method to get the number of elements or length of ArrayList in
		// the list.
		Integer sizelist = list.size();
		System.out.println("Size/Length of the list: " + sizelist);
		System.out.println(list.isEmpty()); // Return false.

		System.out.println("--Clear all elements from the list--");
		list.clear();
		boolean bol = list.isEmpty();
		System.out.println(bol);

		Integer size = list.size();
		System.out.println("No of elements in the list: " + size);
	}
}

/*
OUTPUT
 
true
Original ArrayList insertion order: [INDIA, USA, SRILANKA, JAPAN, FRANCE]
Size/Length of the list: 5
false
--Clear all elements from the list--
true
No of elements in the list: 0
*/
