/**Que-3)
------------------
What will be the output of the following Java code?
a) [3, 2, 6]
b) [3, 2, 8]
c) [3, 2, 6, 8]
d) [3, 2, 8, 6]

*/

package com.nit.labTasksMCQ;

import java.util.*;

public class VectorDemo3 {

	public static void main(String[] args) {
		
		// Step 1: Create a Vector with initial capacity 4 and capacity increment 2
        Vector obj = new Vector(4, 2);

        // Step 2: Add elements to the Vector
        obj.addElement(new Integer(3));  // obj = [3]
        obj.addElement(new Integer(2));  // obj = [3, 2]
        obj.addElement(new Integer(6));  // obj = [3, 2, 6]

        // Step 3: Insert element 8 at index 2
        obj.insertElementAt(new Integer(8), 2);  // obj = [3, 2, 8, 6]
        obj.insertElementAt(9,0);  //[9, 3, 2, 8, 6]

        // Step 4: Print the final Vector
        System.out.println(obj);  // Output: [9, 3, 2, 8, 6]
	}

}


/**Ans ->  [3, 2, 8, 6] 
 * 
 * Initial Capacity = 4 (Vector can store up to 4 elements before resizing).
 * 
 * Capacity Increment = 2 (If full, capacity increases by 2).
 * */
