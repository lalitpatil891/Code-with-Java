/** Que-10)
------------------
What will be the output of the following Java program? */

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add(null);		//list = [null]
		list.add(0, "A");	//list = [A, null]
		list.add(2, "B");	//list = [A, null, B]
		list.add(1, "C");	//list = [A, C, null, B]

		System.out.println(list);  //[A, C, null, B]

	}
}


//may be some cause an IndexOutOfBoundsException
