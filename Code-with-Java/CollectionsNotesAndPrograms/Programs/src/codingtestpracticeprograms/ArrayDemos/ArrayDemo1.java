package codingtestpracticeprograms.ArrayDemos;

////Given an array of integers, return true if 15 appears as either the first or last element in the array. The array will be length 1 or more.
public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int[]nums = {19,78,45, 89, 15};
		
		boolean b = firstLast(nums);
		System.out.println("15 is available : "+b);
	}

	private static boolean firstLast(int[] nums) {
		
		if(nums[0] == 15 || nums[nums.length-1] == 15)
			return true;
		else
			return false;
	}

}
