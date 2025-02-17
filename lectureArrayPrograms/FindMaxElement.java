/** Q6 - WAP to find the maximum element in the Array. */

package logicalArray.lectureArrayPrograms;

class ArrayMaxFinder {
	public static void getMaxElement(int arr[]) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) { // 2<5<8<9<1 = 9
			if (max < arr[i]) {
				max = arr[i]; // 9
			}
		}
		System.out.println("The maximum element of the arrays is: " + max);
	}
}

public class FindMaxElement {

	public static void main(String[] args) {

		int a[] = { 2, 5, 8, 9, 1 };

		ArrayMaxFinder.getMaxElement(a);
	}
}
