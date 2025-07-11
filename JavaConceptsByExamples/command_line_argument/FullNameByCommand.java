//WAP to print First And last name using command line Argument

public class FullNameByCommand
{
	public static void main(String[] args)
	{
		System.out.println(args[0]);
	}
}

/**
cmd:
javac FullNameByCommand.java
java FullNameByCommand Virat Kohli  [Output: Virat]

java FullNameByCommand "Virat Kohli" [Output: Virat Kohli]

*/