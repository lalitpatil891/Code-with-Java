package ArrayList;

import java.util.ArrayList;

public class ArrayList13 {

	public static void main(String[] args) {
		// Creates an ArrayList1 with an initial capacity of 10.
		ArrayList<String> al = new ArrayList<String>();
		al.add("G");
		al.add("H");
		al.add("I");
		al.add("M");
		al.add("N");
		System.out.println("Original ArrayList insertion order: " + al);

		// Create another ArrayList2 with an initial capacity of 10.
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("J");
		al2.add("K");
		al2.add("L");

		// Call addAll() method to add all elements of list2 at specific index 3.
		al.addAll(3, al2);
		System.out.println("ArrayList insertion order after adding group of elements in the list1 : " + al);

		// Create ArrayList3 with initial capacity 10.
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("20");
		al3.add("40");
		al3.add("12");

		// Adding group of elements at the end of array list1.
		al.addAll(al3);
		System.out.println(al);
	}

}

/*Output
Original ArrayList insertion order: [G, H, I, M, N]
ArrayList insertion order after adding group of elements in the list1 : [G, H, I, J, K, L, M, N]
[G, H, I, J, K, L, M, N, 20, 40, 12] */
