/** Find the second largest element in the arrays */

package logicalArray.lectureArrayPrograms;

public class FindSecondLargestElement {

	public static void main(String[] args) {

		int arr[] = { 12, 50, 90, 35, 65 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("\n Second Large Element is:"+ arr[1]);
	}

}
