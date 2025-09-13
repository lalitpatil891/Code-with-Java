package codingtestpracticeprograms.ArrayDemos;

import java.util.Arrays;

//Given an array of integers of odd length, return a new array length 3 containing the elements from the middle of the array.One element should be before middle and another one should be after middle. The original array length will be at least 3.

public class ArrayDemo15 {

	public static void main(String[] args) {
		int[] arr = { 12, 89, 90, 78, 99, 56, 99 };

		int[] newArray = midThree(arr);
		System.out.println("New Array Elements are :" + Arrays.toString(newArray));
	}

	private static int[] midThree(int[] arr) {
		
		int[] myArray = new int[3];
		
		int middle = arr.length/2;
		
		myArray[0] = arr[middle-1];
		myArray[1] = arr[middle];
		myArray[2] = arr[middle+1];
		
		return myArray;  //New Array Elements are :[90, 78, 99]
	}
	
	

}
