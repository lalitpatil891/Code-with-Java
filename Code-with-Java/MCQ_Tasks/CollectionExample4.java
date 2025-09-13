/** 5. What is the output of the following code
A.	0 1 2 3 4 5 6 7 8 9
B.	1 2 3 4 5 6 7 8 9
C.	1 2 3 4 5 6 7 8 10
D.	1 2 3 4 5 6 7 8

*/

import java.util.ArrayList;

public class CollectionExample4 {

	public static void main(String[] args) {

		//Creating an empty array list of Integer
		ArrayList<Integer> al = new ArrayList<>();

		//all element in the list using forLoop
		for(int i=0; i<10; i++)
		{
			al.add(i);   //adding 0 to 9 value
		}

		//print all list element using forEach loop
		for(int str: al)
		{
			System.out.print(str+ " ");
		}
	}
}


/*OUTPUT -> 0 1 2 3 4 5 6 7 8 9 */
