/**Q8)WAP to modify the value of an array */

package logicalArray.lectureArrayPrograms;

import java.util.Arrays;

class ModifyArray {
	public static int[] modify(int[] arr) {
		arr[0] = 10;
		arr[1] = 20;
		
		return arr;
	}
}

public class ModifyArrayElement {

	public static void main(String[] args) {

		int arr[] = { 100, 200, 300, 400, 500 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		System.out.println(".......................................");

		int[] modify = ModifyArray.modify(arr);
		System.out.println("Modified Array: " + Arrays.toString(modify));

		System.out.println(".......................................");

		System.out.println("Original Array:  " + Arrays.toString(arr));
	}
}

/**
Original Array: [100, 200, 300, 400, 500]
......................................
Modified Array: [10, 20, 300, 400, 500]
......................................
Original Array [10, 20, 300, 400, 500]
 * */
