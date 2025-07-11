/*WAP in java to pass some value from command line argument based on the following criteria.

If the array length is 0 : It should print length is 0
If the array length is 1 : It should find the cube of the number
If the array length is 2 : It should print sum of the number

*/

package com.nit.command_line_args;

public class ArrayLengthCalculation {
	
	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("Array Length is 0.");
		}
		else if(args.length == 1)
		{
			int num = Integer.parseInt(args[0]);
			System.out.println("Cube of "+num+" is : "+(num * num * num));
		}
		else if(args.length == 2)
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			
			int sum = x + y;
			
			System.out.println("Sum is :"+sum);
		}
	}

}



/* 

Steps to execute the commad Line Argument Program using Eclipse IDE

Right Click on the Program -> Run As -> Run configuration -> Check Your main class name -> select Argument tab -> Pass the approprite value -> Run

*/