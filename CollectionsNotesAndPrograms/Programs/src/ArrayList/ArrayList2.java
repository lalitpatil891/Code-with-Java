//sum of the Arraylist elements
package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(100);
		int total = 0;

		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);

		for (int num : numbers) {
			total += num;
		}

		System.out.println(total);  //1000s
	}
}
