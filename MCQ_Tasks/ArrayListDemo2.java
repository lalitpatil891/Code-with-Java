import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		// Step 1: Creating two empty ArrayLists
        ArrayList obj1 = new ArrayList();
        ArrayList obj2 = new ArrayList();

        // Step 2: Adding elements to obj1
        obj1.add("A");  // obj1 = ["A"]
        obj1.add("B");  // obj1 = ["A", "B"]

        // Step 3: Adding elements to obj2
        obj2.add("A");      // obj2 = ["A"]
        obj2.add(1, "B");   // obj2 = ["A", "B"]

        // Step 4: Checking equality between obj1 and obj2
        System.out.println(obj1.equals(obj2));  // Output: true
	}
}
