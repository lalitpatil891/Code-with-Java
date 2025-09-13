//Different Ways to create 1D array and fetching the elements using ordinary for loop/forEach.
import java.util.*;	

class ArrayDemo1 {
		
public static void main(String[] args)
	{
		//Create a empty Array
		int arr[] = new int[5];
		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 23;
		arr[3] = 33;
		arr[4] = 43;
		
		System.out.println("Array Length is: "+arr.length);
		//printing the elements using for loop
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i +"index -> "+arr[i]);	
		}
		
		//Printing The element using for each loop
		int arr2[] = new int[]{10,20,30,40,50};
		
		for(int ar : arr2){
		
			System.out.println(ar);	
		}
		
		//Printing the element using toString() method.
		int arr3[] = {100,200,300,400,500};
		
		System.out.println("Arr3 elements are -> "+Arrays.toString(arr3));
	}
}