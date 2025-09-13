package com.nit.working_static_method_with_diff_return_type2;
//BLC
public class GetSquare {
	
	public static void getSquareNumber(int num)
	{
		System.out.println("Square of : "+num+" is : "+(num*num));
	}
	
}

/*

Here getSquareNumber() method return type is void so there is no communication between BLC and ELC class.

*/