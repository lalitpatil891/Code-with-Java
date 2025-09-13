package codingtestpracticeprograms.ArrayDemos;

////Given an array of integers length 3, return the sum of all the elements.
import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Array :");
		int arrayLength = sc.nextInt();

		int[] x = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			System.out.print("Enter the elements of an array :" + i + " position :");
			x[i] = sc.nextInt();
		}

		int total = sum3(x);
		System.out.println("Sum is :" + total);
	}

	public static int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

}
