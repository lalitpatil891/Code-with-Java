/**6. Choose the correct output of the following code

A.	4 5 6 7 8
B.	5 6 7 8
C.	4 5 6 7 8 9
D.	5 6 7 8 9

*/

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionExample5 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		for(int i = 5 ; i < 10; i++)
		{
			al.add(i);
		}

		al.remove(4);  //4th index element will be removed.

		for(int str: al)
		{
			System.out.print(str+" ");
		}
	}
}

//OUTPUT -> 5 6 7 8    -> 4th index value 9 is removed.
