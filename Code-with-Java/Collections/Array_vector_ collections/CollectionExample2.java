/**1.What is the output of the following code

A.	progress NareshIT goolge nareshIT
B.	goolge progress NareshIT nareshIT 
C.	progress NareshIT nareshIT goolge
D.	progress goolge NareshIT nareshIT

*/
package com.nit.labTasksMCQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample2 {

	public static void main(String[] args) {
		
		//Step 1: Create a list from an Array using Arrays.asList()
		List<String> list = Arrays.asList("google", "nareshIT", "NareshIT", "progress");
		
		//Step 2: Reverse the List
		Collections.reverse(list);
		
		//Step 3: Print Each element in the reverse List 
		for (String str : list)
			System.out.print(str + " ");
	}
}

//OUTPUT -> progress NareshIT nareshIT google


