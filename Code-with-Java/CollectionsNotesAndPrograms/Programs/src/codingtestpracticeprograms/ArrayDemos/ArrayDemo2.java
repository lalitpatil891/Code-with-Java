//Given an array of integers, return true if the array length is 1 or more,and the first element and the last elements both are equal.

package codingtestpracticeprograms.ArrayDemos;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int []x = {12, 12, 90, 89, 56, 12};
		
		boolean b = sameFirstAndLast(x);
		
		System.out.println(b);
		
		
	}

	
	public static boolean sameFirstAndLast(int[] x) {
		
		if(x.length > 1 && x[1] == x[x.length-1])
			return true;
		else
			return false;
	}
}
