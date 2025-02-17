package logicalArray.lectureArrayPrograms;

public class FindFirstAndLastArrayIndex {

	public static void main(String[] args) {
		
		int arr[] = new int[] {20,33,88,99,55,44};
		
		System.out.print("The array is : ");
		for(int arrr: arr)
		{
			System.out.print(+arrr+" ");
		}
		
		System.out.println("");
		
		System.out.println("Length of the array:  "+arr.length);
		
		System.out.println("--------------------------------------");
		
		System.out.print("First index element: "+arr[0] +"\n");
		
		System.out.println("--------------------------------------");
		
		System.out.println("Last index element: "+arr[arr.length-1]);
		
	}
}

/*OUTPUT
 
The array is : 20 33 88 99 55 44 

Length of the array:  6
--------------------------------------
First index element: 20
--------------------------------------
Last index element: 44

*/
