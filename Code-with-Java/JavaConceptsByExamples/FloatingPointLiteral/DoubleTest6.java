package com.nit.FloatingPointLiteral;

public class DoubleTest6 {
	
	public static void main(String[] args)
	{
		double a = 0791;		//Error
		
		double b = 0791.0;     //791.0
		
		double c = 0777;		//511.0
		
		double d = 0Xdead;		//57005.0
		
	    double e = 0Xdead.0;	//Error
		
		System.out.println(b+" , "+c+" , "+d);
	}
}
