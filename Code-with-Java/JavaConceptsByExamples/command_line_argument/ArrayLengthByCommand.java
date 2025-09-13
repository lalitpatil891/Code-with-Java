//Array Length by using Command line


public class ArrayLengthByCommand
{
	public static void main(String[] args)
	{
		System.out.println("Length of array is: "+args.length);
	}
}

/**

cmd:

javac ArrayLengthByCommand.java

java ArrayLengthByCommand
Output= Length of array is:0

java ArrayLengthByCommand 55 33 22
Output= Length of array is:3

java ArrayLengthByCommand Java Python C @ #
Output= Length of array is:5

*/
