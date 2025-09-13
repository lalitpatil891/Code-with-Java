package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList21 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		   list.add("John");
		   list.add("Bob");
		   list.add("Mark");
		   list.add("Deep");

		// Converting ArrayList into array.
		   String[] array = list.toArray(new String[list.size()]);

		// Iterating array.
		   for (int i = 0; i < array.length; i++) 
		   {
		      System.out.println(array[i]);
		   }
	}

}
