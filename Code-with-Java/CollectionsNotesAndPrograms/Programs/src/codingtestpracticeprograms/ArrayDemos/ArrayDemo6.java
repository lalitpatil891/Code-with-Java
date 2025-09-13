package codingtestpracticeprograms.ArrayDemos;

import java.util.Arrays;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println("Array Elements before Change :" + Arrays.toString(arr));

		int[] recArray = ChangeArray.changeArrayElements(arr);

		System.out.println("Array Elements After Change :" + Arrays.toString(recArray));

		System.out.println("Original Array will Modified or Not :" + Arrays.toString(arr));

	}

}

class ChangeArray
{
   public static int [] changeArrayElements(int [] p)
   {
	   System.out.println("static method colled");
       p[0] = 100;
       p[1] = 200;
       
       return p;
   }    
}


//Note :- Java always works with pass by value only.