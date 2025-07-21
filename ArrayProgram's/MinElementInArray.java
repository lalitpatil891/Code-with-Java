//Q5. WAP to find the munimum element in the Array(Stream also)

class MinElementInArray
{
	public static void getMinimumValue(int []arr)
	{
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) 
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		System.out.println("The minimum element of the arrays is: "+min);
	}
	
	public static void main(String[] args) 
	{
		int a[] = {9,7,1,5,2};
		
		MinElementInArray.getMinimumValue(a);
	}
}
