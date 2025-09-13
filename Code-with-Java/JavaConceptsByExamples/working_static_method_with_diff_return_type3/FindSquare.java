package com.nit.working_static_method_with_diff_return_type3;
// A Static method returning integer value
//BLC
public class FindSquare {
	
	public static int getSquare(int x)
	{
		return(x*x);
	}
}


/*

Note: By using System.out.println(), we can't call a method whose return type is void. we will get compilation error as shown below.

*/