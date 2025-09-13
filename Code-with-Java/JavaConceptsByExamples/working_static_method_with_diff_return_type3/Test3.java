package com.nit.working_static_method_with_diff_return_type3;
//ELC
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of side: ");
		int side = sc.nextInt();
		
		System.out.println("Square of " +side+ " is: "+FindSquare.getSquare(side));
		
		sc.close();
		
	}
}

/*

Note: By using System.out.println(), we can't call a method whose return type is void. we will get compilation error as shown below.

*/
