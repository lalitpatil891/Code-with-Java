package com.nit.operators;

public class OperatorsTest11 {

	public static void main(String[] args)
	{
		int x = 1;
		do
		{
			System.out.println("Hello");
			x++;
			
			boolean b = false;
			if(b = true)
				break;
		}
		while(x<=10);     //Hello
	}
}
