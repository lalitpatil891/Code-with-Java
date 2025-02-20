/**Que-11)
--------------------
What is the output of the following code if there is no error in the code?*/


import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {

		// Step 1: Creating an empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Step 2: Adding null to the list
        list.add(null);  // list = [null]

        // Step 3: Adding "A" at index 0, shifting null to index 1
        list.add(0, "A");  // list = [A, null]

        // Step 4: Adding another null at the end of the list
        list.add(null);  // list = [A, null, null]

        // Step 5: Adding "B" at index 2 (valid because the list already has three elements)
        list.add(2, "B");  // list = [A, null, B, null]

        // Step 6: Adding "20" at the end of the list
        list.add("20");  // list = [A, null, B, null, "20"]

        // Step 7: Adding "C" at index 1, shifting elements to the right
        list.add(1, "C");  // list = [A, C, null, B, null, "20"]

        // Step 8: Printing the final list
        System.out.println(list);  // Output: [A, C, null, B, null, 20]

	}
}
