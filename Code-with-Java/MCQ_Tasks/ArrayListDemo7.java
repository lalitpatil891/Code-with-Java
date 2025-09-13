/**
Que-12)
--------------------
*/



import java.util.ArrayList;

public class ArrayListDemo7 {

	public static void main(String[] args) {

		// Step 1: Creating an empty ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<>();

		// Step 2: Adding elements to the list
		list.add(12); // list = [12]
		list.add(16); // list = [12, 16]
		list.add(34); // list = [12, 16, 34]
		list.add(78); // list = [12, 16, 34, 78]

		// Step 3: Removing element at index 12 (ERROR!)
		list.remove(12); // ❌ IndexOutOfBoundsException (Valid indexes: 0 to 3)

	//	list.remove(Integer.valueOf(12)); // ✅ Removes the element "12", not index 12

		// Step 4: Printing the list (This line won't execute due to the error)
		System.out.println(list);
	}
}

/**
Issue in the Code
-----------------
list.remove(12); is incorrect because remove(int index) expects a valid index.
The list only has 4 elements, so valid indexes are 0, 1, 2, and 3.
Trying to remove an element at index 12 causes IndexOutOfBoundsException.
*/
