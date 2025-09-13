package codingtestpracticeprograms.ArrayDemos;

import java.util.Arrays;

//Given an integer array, return a new array with double the length where its last element is the same as the original array, and all the other elements are containing 0. The original array will be length 1 or more.

public class ArrayDemo13 {

	public static void main(String[] args) {
		
		int[] x = { 11, 12, 100, 89 };

		int[] y = makeLast(x);
		
		System.out.println("Array is :" + Arrays.toString(y));
	}

	public static int[] makeLast(int[] nums) {
		int len = nums.length;
		
		int[] myArray = new int[2 * len];

		myArray[myArray.length - 1] = nums[len - 1];
		return myArray;
	}
}
