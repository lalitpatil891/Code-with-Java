// Program to calculate the sum of all elements in an array
class sumOfallElementsOfArray
{
	public static void main(String[] args)
	{
		// Declare and initialize an array with values
		int arr[] = {1, 2, 3, 4, 5};

		// Variable to store the sum of array elements
		int sum = 0;

		// Loop through the array elements
		for(int i = 0; i < arr.length; i++) {
			// Add each element to the sum
			sum += arr[i];
		}

		// Print the final sum
		System.out.println("The sum of Array elements is: " + sum);
	}
}
