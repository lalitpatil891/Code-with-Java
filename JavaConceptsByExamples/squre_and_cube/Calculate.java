/* WAP to find out  Square and cube of the number by following criteria.
 * a) If numberr is 0 or negative it should return -1
 * b) If number is even It Should return square of the number
 * c) If number is odd It should return cube of the number.
 * 
 */
package com.nit.squre_and_cube;

public class Calculate {
	
	public static int getSquareAndCube(int num)
	{
		if(num <= 0)
		{
			return -1;
		}
		else if( num % 2 == 0)
		{
			return num*num;
		}
		else
		{
			return num*num*num;
		}
	}
}
