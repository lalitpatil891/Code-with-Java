package com.nit.FloatingPointLiteral;

public class FloatDoubleTest7 {

	public static void main(String[] args)
	{
		double a = 1.5e3;	//1500.0
		//float b = 1.5e3;  //error
		float c = 1.5e3F;	//1500.0
		double d = 10;		//10.0
		//int e = 10.0;		//error
		//long f = 10D;		//error
		//int g = 10F;		//error
		//long l = 12.78F;	//error
		
		System.out.println(a+" , "+c+" , "+d);
		
	}
}
