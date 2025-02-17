//Q5) WAP to find the minimum element in the Array(Stream also)
package logicalArray.lectureArrayPrograms;

class ArrayMinFinder {
	public static void getMinimumValue(int arr[]) {

		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (min > arr[i])   
			{
				min = arr[i];
			}
		}

		System.out.println("The minimum element of the arrays is: "+min);
	}
}

public class FindMinElement {

	public static void main(String[] args) {

		int a[] = { 9, 7, 5, 2 };
		
		ArrayMinFinder.getMinimumValue(a);
	}
}


/**a) WAP to find the minimum element from array by using java * features OR Stream API*/
/*package logicalArray.lectureArrayPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinElementByUsingJava8 {

	public static void main(String[] args) {
		
		int a[] = {9,7,1,5,2,-9};
		
		OptionalInt min = Arrays.stream(a).min();
		min.ifPresent(System.out::println);	
	}
}*/
