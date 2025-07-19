//WAP to find the maximum element in the array.

class MaxElementInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {30, 50, 40, 70, 45, 56, 34};
		
		int length = arr.length;
		
		int max = 0;
		int min = max;
		
		for(int i=0; i < length; i++) {
			for(int j=0+1; j < length; j++) {
				      
				if(arr[i] <= arr[j]){
					if(max <= arr[j]){
						max = arr[j];
					}
				}
				else
				{	
					if(max <= arr[i]){
						max = arr[i];
					}	
				}
			}
		}
		System.out.println("max="+max);		
	}
}
