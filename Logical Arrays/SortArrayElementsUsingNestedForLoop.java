package logicalArray.lectureArrayPrograms;

import java.util.Arrays;

public class SortArrayElementsUsingNestedForLoop {

	public static void main(String[] args) {
		
		int arr[] = {20, 90, 10, 80, 40};
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
				
			} 
		}
		
		System.out.println(Arrays.toString(arr));
	
		System.out.println("---------------- Java 1.8 -----------------------");
		
		int ar[] = {12,  90, 40, 15, 24};
		
		Arrays.stream(ar).sorted().forEach(System.out::println);
		
		
	}

}
