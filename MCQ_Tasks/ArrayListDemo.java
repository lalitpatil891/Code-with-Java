/** Que-5) What will be the output of the following Java program?
 */

import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Step 1: Declare an integer array of size 5
        int array[] = new int[5];  // Default values: [0, 0, 0, 0, 0]

        // Step 2: Populate the array using a loop
        for (int i = 5; i > 0; i--) {
            array[5 - i] = i;
        }
        // After the loop, array values: [5, 4, 3, 2, 1]

        // Step 3: Print the array elements before modification
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]);  // Output: 54321
        }

        // Step 4: Use Arrays.fill() to set elements from index 1 to 3 to 8
        Arrays.fill(array, 1, 4, 8);
        // Modified array: [5, 8, 8, 8, 1]

        // Step 5: Print the array after modification
        System.out.println("");  // Move to a new line
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]);  // Output: 58881
        }
	}

}
