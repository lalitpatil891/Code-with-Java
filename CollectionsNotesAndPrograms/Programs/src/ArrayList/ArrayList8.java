package ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayList8 {

	public static void main(String[] args) {

		List<String> listOfName = Arrays.asList("Rohit", "Akshar", "Pallavi", "Sweta"); // Length is fixed

		Collections.sort(listOfName);

		System.out.println(listOfName);
		
		////Fetching the data in both the direction
		ListIterator<String> lst = listOfName.listIterator();

		// Forward direction
		while (lst.hasNext()) {
			System.out.print(lst.next() + " ");
		}

		System.out.println("\n==================");
		// Backward Direaction
		while (lst.hasPrevious()) {
			System.out.print(lst.previous() + " ");
		}
	}
}

/*OUTPUT
[Akshar, Pallavi, Rohit, Sweta]
Akshar Pallavi Rohit Sweta 
==================
Sweta Rohit Pallavi Akshar

*/
