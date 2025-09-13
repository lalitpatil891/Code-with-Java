package codingtestpracticeprograms.ArrayDemos;

import java.util.Arrays;

//Given an array of integers length 3, return an array with the elements "rotated left" so {1, 2, 3} will become  {2, 3, 1}.

public class ArrayDemo5 {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3 };

		int[] arr = rotateLeft3(x);

		System.out.println(Arrays.toString(arr));

	}

	private static int[] rotateLeft3(int[] nums) {
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 1;
		return nums;
	}

}
