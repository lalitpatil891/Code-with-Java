//
package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample4 {
	public static void main(String[] args) {
		// Create a generic list object of type Integer. 
		   List<Integer> list = new ArrayList<Integer>(); 
		   int size = list.size(); 
		   System.out.println("Size before adding elements: " +size); 

		// Adding elements to list object.  
		   list.add(5); 
		   list.add(10); 
		   list.add(5); 
		   list.add(15); 
		   list.add(20); 
		   list.add(10); 
		   list.add(20); 
		   list.add(30); 
		 
		   System.out.println("Original order of List Elements"); 
		   System.out.println(list); 
		 
		// Creating a hash set object of type Integer.
		   Set<Integer> s = new HashSet<Integer>(list); 
		   System.out.println("Unodered List Elements after removing duplicates."); 
		   System.out.println(s); 
	}
}

/*
Output: 
       Size before adding elements: 0 
       Original order of List Elements 
       [5, 10, 5, 15, 20, 10, 20, 30] 
       Unodered List Elements after removing duplicates
       [20, 5, 10, 30, 15]
 */