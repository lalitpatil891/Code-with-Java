package codingtestpracticeprograms.ArrayDemos;
//Given 2 arrays of integers, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

public class ArrayDemo4 {

	public static void main(String[] args) {
		
		int[] x = { 55, 12, 78, 45, 89, 75 };
		int[] y = { 55, 12, 78, 45, 89, 76 };

		
		boolean b = commonEnd(x, y);
		
		System.out.println(b);
		
	}

	private static boolean commonEnd(int[] x, int[] y) {

		if(x[0] == y[0] || x[x.length-1] == y[y.length-1]) 
			return true;
		else
			return false;
	}
	

}
