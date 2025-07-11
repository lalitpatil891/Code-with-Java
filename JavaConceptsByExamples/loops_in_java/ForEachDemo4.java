package com.nit.loops_in_java;

public class ForEachDemo4 {

	public static void main(String[] args) {
		
		Object [] arr = {'A',12,89.67, true, new String("NIT")};
		
		//Arrays.sort(arr);  //java.lang.ClassCastException
		
		for(Object x : arr)
		{
			System.out.println(x);
		}
		
	}

}

/*
Output

A
12
89.67
true
NIT

*/
