package com.nit.FloatingPointLiteral;

public class RangeAndSizeFloatingPointLiteral {
	
	public static void main(String[] args)
	{
		System.out.println("\n Float Range:");
		System.out.println("min: "+Float.MIN_VALUE);
		System.out.println("max: "+Float.MAX_VALUE);
		System.out.println("Size: "+Float.SIZE);
		
		System.out.println("\n Double Range:");
		System.out.println("min: "+Double.MIN_VALUE);
		System.out.println("Max: "+Double.MAX_VALUE);
		System.out.println("Size: "+Double.SIZE);
		
	}
}

/**
OUTPUT

Float Range:
min: 1.4E-45
max: 3.4028235E38
Size: 32

Double Range:
min: 4.9E-324
Max: 1.7976931348623157E308
Size: 64
*/