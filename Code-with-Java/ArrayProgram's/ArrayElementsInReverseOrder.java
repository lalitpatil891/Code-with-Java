//2. WAP to print the array elements in reverse order.( user input )

import java.util.*;

public class ArrayElementsInReverseOrder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int j=0; j<size; j++)
		{
			System.out.print("Enter the element of array at "+(j+1)+" th index: ");
			arr[j] = sc.nextInt();
		}
		
		System.out.println("Original array: "+Arrays.toString(arr));
		System.out.print("Reverse array: ");	
		for(int i=arr.length-1 ; i >= 0; i--){
			
			System.out.print(arr[i]+" ");
		}
	}
}
