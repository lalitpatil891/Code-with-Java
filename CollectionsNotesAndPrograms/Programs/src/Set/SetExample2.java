//
package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		// Create a generic set object of type String. 
		   Set<String> s = new HashSet<String>(); 

		// Check set is empty or not. 
		   boolean check = s.isEmpty(); // Return type of this method is an boolean. 
		   System.out.println("Is Set empty: " +check); 

		// Adding elements to set. 
		   s.add("Orange"); 
		   s.add("Red"); 
		   s.add("Blue"); 
		   s.add("Yellow"); 
		   s.add("Green"); 
		   
		   if(s.isEmpty())
		   { 
		      System.out.println("Set is empty."); 
		   } else 
		    { 
		       System.out.println("Set is not empty."); 
		       System.out.println("Elements in the Set"); 
		       System.out.println(s); 
		    } 
		// Remove an element from set. 
		   s.remove("Blue"); 
		   System.out.println("Set elements after removing"); 
		   System.out.println(s); 

		// Get the total number of set elements. 
		   int size = s.size(); 
		   System.out.println("Total number of elements: " +size); 
	}
}

/*
Is Set empty: true
Set is not empty.
Elements in the Set
[Red, Blue, Yellow, Orange, Green]
Set elements after removing
[Red, Yellow, Orange, Green]
Total number of elements: 4

 */