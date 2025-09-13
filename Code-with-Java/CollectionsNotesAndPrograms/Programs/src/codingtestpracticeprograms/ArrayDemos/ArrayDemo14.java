package codingtestpracticeprograms.ArrayDemos;

//Given an array of integers, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.

import java.util.Arrays;

public class ArrayDemo14 {

	public static void main(String[] args) {
		int[] arr = { 12, 89, 90, 67, 34, 66 };

		int[] newArray = swapEnds(arr);

		System.out.println("New Array Elements are :" + Arrays.toString(newArray));
	}

	public static int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

}
