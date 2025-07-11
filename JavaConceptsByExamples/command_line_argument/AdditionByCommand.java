public class AdditionByCommand
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Sum is : "+(a+b));
	}
}

/*
javac AdditionByCommand.java

java AdditionByCommand 100 200

output: Sum is : 300

*/