package com.nit.loops_in_java;

import java.util.*;

public class ForEachSortDemo2 {

	public static void main(String[] args) {
		
		int[] values = {30,10,20,50,40};
		
		//java.util.Arrays.sort(values); 
		
		Arrays.sort(values);
		
		for(int value : values)
		{
			System.out.println(value);
		}
		
	}
}

/*
Output

10
20
30
40
50
*/