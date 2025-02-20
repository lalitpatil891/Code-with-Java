/** Que-2)
-----------------
What will be the output of the following Java code?

a)2 b)3
c)4 d)6

ans -> c) 4

*/

import java.util.*;

public class VectorDemo2 {

	public static void main(String[] args) {

		// Step 1: Create a Vector with initial capacity 4 and increment size 2
        Vector obj = new Vector(4, 2);

        // Step 2: Add elements to the Vector
        obj.addElement(new Integer(3));  // obj = [3]
        obj.addElement(new Integer(2));  // obj = [3, 2]
        obj.addElement(new Integer(5));  // obj = [3, 2, 5]

        // Step 3: Print current capacity and size of the Vector
        System.out.println("Capacity is: " + obj.capacity());  // Output: 4
        System.out.println("Size is: " + obj.size());          // Output: 3
	}

}
