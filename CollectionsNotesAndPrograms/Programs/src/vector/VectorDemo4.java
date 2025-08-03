/**Program that describes ArrayList is better than Vector in performance wise
----------------------------------------------------------------------
As we know ArrayList methods are not synchronized so multiple threads can access the method of ArrayList, on the other hand most of the methods are synchronized in Vector class. 

java.lang.System class has provided a predefined static method called currentTimeMillis() through which we can get the current system time in millisecond. 

public static native long currentTimeMillis();
----------------------------------------------------------------
*/
package vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo4 {

	public static void main(String[] args) {
		//---------- ArrayList -------------------
		long startTime = System.currentTimeMillis();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Total Time taken by ArrayList class : " + (endTime - startTime));

		//---------- Vector ------------------
		startTime = System.currentTimeMillis();

		Vector<Integer> v1 = new Vector<Integer>();

		for (int i = 0; i < 1000000; i++) {
			v1.add(i);
		}

		endTime = System.currentTimeMillis();

		System.out.println("Total Time taken by Vector class : " + (endTime - startTime));
	}

}

/**
OUTPUT
------

Total Time taken by ArrayList class : 30
Total Time taken by Vector class : 129

 * */
