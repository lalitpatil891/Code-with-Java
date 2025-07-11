public class Command
{
	public static void main(String[] args)
	{
		//Integer.parseInt(args[0]);
		System.out.println(args[0]);
	}
}

/** 

cmd :

javac Command.java	
java Command Rohit Rahul Ravi
	
Output : Rohit

----------------------------------------

javac Command.java
java Command 

Output Exception : java.lang.ArrayIndexOutOfBoundsException

Note : This program is expecting at-least one value from the command line argument at runtime, 
if we don't provide single value then we will get an execption 
i.e. java.lang.ArrayIndexOutOfBoundsException


*/