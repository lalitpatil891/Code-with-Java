//WAP to find the minimum element from array by using java 8 features OR Stream API

class MinElementUsingStream
{
	public static void main(String[] args) 
	{
		int a[] = {9,7,1,5,2,-9};
		
		OptionalInt min = Arrays.stream(a).min();
		min.ifPresent(System.out::println);
	}
}
