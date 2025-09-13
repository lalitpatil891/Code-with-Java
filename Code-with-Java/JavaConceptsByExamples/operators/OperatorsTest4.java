package com.nit.operators;

public class OperatorsTest4 {
	
	public static void main(String[] args)
	{
		int x = 20;
		int y = ++(++x);    //ERROR
		
		System.out.println(x+ " : "+y);
	}
}
