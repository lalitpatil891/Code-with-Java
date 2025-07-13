package com.nit.labTasksMCQ;

/** Que-8
------------------
What will be the output of the following Java program?

*/

import java.util.ArrayList;  // Importing ArrayList class
import java.util.List;       // Importing List interface

public class ArrayListDemo3 {
    public static void main(String[] args) {
        // Step 1: Creating an empty List of Strings using ArrayList
        List<String> list = new ArrayList<String>();  
        
        // Step 2: Adding "Orange" to the list
        list.add("Orange");  // list = [Orange]
        
        // Step 3: Adding "Banana" at index 0 (this shifts "Orange" to index 1)
        list.add(0, "Banana");  // list = [Banana, Orange]
        
        // Step 4: Creating another ArrayList called arList
        ArrayList<String> arList = new ArrayList<>();
        
        // Step 5: Adding "Apple" to arList
        arList.add("Apple");  // arList = [Apple]
        
        // Step 6: Adding "Grapes" to the end of the list
        list.add("Grapes");  // list = [Banana, Orange, Grapes]
        
        // Step 7: Adding all elements of arList at index 3
        list.addAll(3, arList);  // list = [Banana, Orange, Grapes, Apple]
        
        // Step 8: Printing the final list
        System.out.println(list);  // Output: [Banana, Orange, Grapes, Apple]
    }
}


//OUTPUT : [Banana, Orange, Grapes, Apple]

/**
Key Points:
add(index, element) shifts elements to the right to accommodate the new element.
addAll(index, collection) inserts all elements of a collection at a specific index, shifting existing elements.
The List<String> interface allows flexible ArrayList operations while keeping generic type safety.*/