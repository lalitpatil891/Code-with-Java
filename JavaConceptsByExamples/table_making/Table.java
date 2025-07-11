package com.nit.table_making;

public class Table {
	
	public static void printTable(int num)
	{
		for(int i=1; i<=10 ; i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
		System.out.println("==============================");
	}
}
