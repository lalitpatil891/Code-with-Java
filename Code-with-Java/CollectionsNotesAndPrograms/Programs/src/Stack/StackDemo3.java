package Stack;

import java.util.Stack;

public class StackDemo3 {
	public static void main(String[] args) {
	 Stack<String> city = new Stack<>();

     // Using Stack methods
     city.push("Pune");
     city.push("Mumbai");

     // Using Vector methods (since Stack extends Vector)
     city.addElement("Hyderabad");   // same as push()
     city.addElement("Surat");

     // Access using Vector method
     System.out.println("Element at index 2: " + city.elementAt(2));

     // Remove using Vector method
     city.removeElement("Mumbai");

     // Final Stack
     System.out.println("Final Stack: " + city);
	}
}


/*	OUTPUT
	Element at index 2: Hyderabad
	Final Stack: [Pune, Hyderabad, Surat]
 */

/**
Stack inherits from Vector, so all Vector methods can be used.
But it is recommended to use push(), pop(), peek() 
for stack operations because they clearly show LIFO behavior.
*/