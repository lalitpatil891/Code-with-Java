//WAP in java to add two numbers using Command Line Argument.

public class CommandAddition
{
	public static void main(String[] args)
	{
		System.out.println(args[0] + args[1])
	}
}

/** 

cmd : 

javac CommandAddition.java
java CommandAddition 200 300

output : 200300


Here '+' operator will work as String concatenation operator
 because args is String type variable.
 
 */