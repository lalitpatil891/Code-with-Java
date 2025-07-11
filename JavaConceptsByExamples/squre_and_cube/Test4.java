/* WAP to find out  Square and cube of the number by following criteria.
 * a) If numberr is 0 or negative it should return -1
 * b) If number is even It Should return square of the number
 * c) If number is odd It should return cube of the number.
 * 
 */

package com.nit.squre_and_cube;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		int result = Calculate.getSquareAndCube(num);
		
		System.out.println("Result is: "+result);
		sc.close();
	}

}
