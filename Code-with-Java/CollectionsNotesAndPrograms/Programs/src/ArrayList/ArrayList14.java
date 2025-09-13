//Java ArrayList Program based on Remove, Get, Contains, and Set methods
package ArrayList;

import java.util.ArrayList;

public class ArrayList14 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Science");
		al.add("Maths");
		al.add("Hindi");
		al.add("English");
		al.add("Social Science");
		System.out.println("Original ArrayList insertion order: " + al);

		// Call get() method to get element at the index 2.
		// Since the return type of get method is String. So, we will store it using a
		// variable str of type string.
		String str = al.get(2);
		System.out.println("Element at index 2: " + str);

		// Call contains() method to check whether the element English is present in the
		// list or not.
		// Since the return type of contains method is boolean.
		// So, we will store it by using a variable b of type boolean.
		boolean b = al.contains("English");

		// The contains() method returns true if the specified element is present in the
		// list otherwise false.
		System.out.println(b); // return true.
		boolean b2 = al.contains("Sanskrit");
		System.out.println(b2); // return false.

		// This statement will return true if the collection contains all elements in
		// the specified collection.
		boolean bo = al.containsAll(al);
		System.out.println(bo);

		// call remove() method to remove element English at a specified index.
		al.remove(3);
		System.out.println("After removing element, ArrayList Order: " + al);

		// Call set() method to replace element Social Science.
		al.set(3, "Computer");
		System.out.println("After replacing element, ArrayList Order: " + al);
	}

}

/*OUTPUT

Original ArrayList insertion order: [Science, Maths, Hindi, English, Social Science]
Element at index 2: Hindi
true
false
true
After removing element, ArrayList Order: [Science, Maths, Hindi, Social Science]
After replacing element, ArrayList Order: [Science, Maths, Hindi, Computer]
*/
