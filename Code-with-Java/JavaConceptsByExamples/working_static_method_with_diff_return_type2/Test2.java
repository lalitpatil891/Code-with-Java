package com.nit.working_static_method_with_diff_return_type2;
//ELC
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The side: ");
		int side = sc.nextInt();
		
		GetSquare.getSquareNumber(side);
		sc.close();
		
	}

}

/*

Here getSquareNumber() method return type is void so there is no communication between BLC and ELC class.

*/
