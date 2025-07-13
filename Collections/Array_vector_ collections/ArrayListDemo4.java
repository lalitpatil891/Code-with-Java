/** Q9) What will be the output of the following Java program? */

package com.nit.labTasksMCQ;

import java.util.ArrayList;  // Importing the ArrayList class

public class ArrayListDemo4 {

	public static void main(String[] args) {
        // Step 1: Creating an empty ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Step 2: Adding null to the list
        list.add(null);  // list = [null]

        // Step 3: Adding "A" at index 0
        list.add(0, "A");  // list = [A, null]

        // Step 4: Attempting to add "B" at index 3 (This will cause an IndexOutOfBoundsException)
        list.add(3, "B");  // ERROR! Index 3 is out of bounds.

        // Step 5: (This line will not execute due to the error in Step 4)
        list.add(1, "C");  

        // Step 6: Printing the list (This won't execute because of the exception)
        System.out.println(list);
    }

}


/** java.lang.IndexOutOfBoundsException: Index: 3  */