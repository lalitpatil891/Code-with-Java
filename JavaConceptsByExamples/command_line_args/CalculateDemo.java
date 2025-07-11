//Program that Describes how Integer.parseInt(String x) works internally ?

package com.nit.command_line_args;

class Calculate {
	
	public static int doSum(int x, int y)
	{
		return (x+y);
	}
}

public class CalculateDemo
{
	public static void main(String[] args)
	{
		int result = Calculate.doSum(12, 24);
		
		System.out.println("Sum is :" +result);
	}
}

