package com.nit.overloading;

import java.text.DecimalFormat;

public class Calculate
{
	public Calculate(int x, int y)  //20   20
	{
		this(2.3, 7.4);
		System.out.println("Sum of two integer is: "+(x+y));
	}
	
	public Calculate(double a,  double b)  //  2.3   7.4
	{
		this("Data", "base");
		double sum = a+b;
		DecimalFormat df = new DecimalFormat();
		System.out.println("Sum of two double is: "+df.format(sum));
	}
	
	public Calculate(String c, String d)   //  Data    base
	{
		System.out.println("Concatenation of two String is: "+(c+d));
	}
}