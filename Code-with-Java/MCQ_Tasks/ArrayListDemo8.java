import java.util.ArrayList;

public class ArrayListDemo8 {

	public static void main(String[] args) {

		// Step 1: Creating an empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Step 2: Adding elements to the list
        list.add("a");  // list = ["a"]
        list.add("b");  // list = ["a", "b"]
        list.add("c");  // list = ["a", "b", "c"]
        list.add("d");  // list = ["a", "b", "c", "d"]

        // Step 3: Removing element "c" from the list
        list.remove("c");  // list = ["a", "b", "d"]

        // Step 4: Printing the final list
        System.out.println(list);  // Output: [a, b, d]

	}
}

/**Explanation
✔ list.remove("c") removes the first occurrence of "c".
✔ Since "c" is found at index 2, it is removed.
✔ The final list contains ["a", "b", "d"].*/
