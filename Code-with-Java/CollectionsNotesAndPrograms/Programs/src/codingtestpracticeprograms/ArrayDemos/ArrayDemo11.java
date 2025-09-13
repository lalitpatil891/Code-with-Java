package codingtestpracticeprograms.ArrayDemos;

//Given an integer array length 2,return true if it contains a number 2 or 3.

public class ArrayDemo11 {

	public static void main(String[] args) {
		
		int []x = {2,5};
        boolean b = has2Or3(x);
        System.out.println("Array contains 2 or 3 :"+b);
		
	}

	private static boolean has2Or3(int[] x) {

		if(x[0]==2 || x[0]==3 || x[1] == 2 || x[1] == 3)
			return true;
		else
			return false;
	}

}
