//Vector program on capacity

package vector;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {

		Vector<Integer> vc = new Vector<>();

		System.out.println("Initial Capacity is: " + vc.capacity());

		for (int i = 0; i < 20; i++) {
			vc.add(i);
		}

		System.out.println("After adding 20 elements capacity is: " + vc.capacity());

		vc.add(101);

		System.out.println("After adding 21 elements capacity is: " + vc.capacity());

		System.out.println("Size: " + vc.size());

		for (int i = 0; i < vc.size(); i++) {
			if (i % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(vc.get(i) + "\t");
			}
		}
	}
}

/**
OUTPUT

Initial Capacity is: 10
After adding 20 elements capacity is: 20
After adding 21 elements capacity is: 40
Size: 21

1	2	3	4	
6	7	8	9	
11	12	13	14	
16	17	18	19	

*/
