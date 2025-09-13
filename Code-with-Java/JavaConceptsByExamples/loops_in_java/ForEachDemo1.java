package com.nit.loops_in_java;

public class ForEachDemo1 {

	public static void main(String[] args) {
		
		int []arr = {20, 40, 60, 50, 89,56,45};
		
		for(int x : arr)
		{
			System.out.println(x);
		}

	}

}

/*OUTPUT

20
40
60
50
89
56
45


Note : Internally the compiler will convert this for-each loop into ordinary for loop.
*/

