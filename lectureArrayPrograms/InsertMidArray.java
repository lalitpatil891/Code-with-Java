//Q22) Insert a new element in the array at middle position

//package logicalArray.lectureArrayPrograms;

import java.util.Arrays;

class InsertAtMiddle {
	public static int[] insertInMiddle(int arr[], int element) {
		int[] newArray = new int[arr.length + 1];

		int middle = arr.length / 2;

		for (int i = 0; i < middle; i++) {
			newArray[i] = arr[i];
		}

		newArray[middle] = element;

		for (int i = middle; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		return newArray;
	}
}

public class InsertMidArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		int[] insertInMiddle = InsertAtMiddle.insertInMiddle(arr, 99);

		System.out.println("After Insertion: " + Arrays.toString(insertInMiddle));

	}

}

/*OUTPUT

Original Array: [10, 20, 30, 40, 50, 60]
After Insertion: [10, 20, 30, 99, 40, 50, 60]

*/
