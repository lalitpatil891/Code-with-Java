/**Que-1)
_____________________________________________
What will be the output of the following Java code?

a)0 b)3
c)2 d) 5

*/

package com.nit.labTasksMCQ;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		// Step 1: Creating a Vector with initial capacity 4 and increment size 2
        Vector obj = new Vector(4, 2);

        // Step 2: Adding elements to the Vector
        obj.addElement(new Integer(3));  // obj = [3]
        obj.addElement(new Integer(2));  // obj = [3, 2]
        obj.addElement(new Integer(5));  // obj = [3, 2, 5]
        obj.addElement("Kfde");
        obj.removeElement(5);
        // Step 3: Retrieving the element at index 1
        System.out.println(obj);  // Output: 2
        
       
	}
}

/** Ans : 2 */

/**Key Takeaways
✔ Vector(int initialCapacity, int capacityIncrement)

Initial capacity sets the starting size.
Capacity increment defines how much the Vector grows when it's full.
✔ addElement() adds elements sequentially.
✔ elementAt(index) retrieves an element at a specific position.*/
