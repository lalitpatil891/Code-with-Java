package com.nit.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		
		int number = 121;
		int originalNum = number;
		int reverse = 0;
		
		while(number != 0)
		{
			/*int temp = number%10;
			reverse = reverse*10 + temp /10;
			number /= 10;*/
			
			reverse = reverse*10 + number%10;
			number /= 10;
		}
		
		if(reverse == originalNum)
		{
			System.out.println("The number "+originalNum+" is Palindrom.");
		}
		else
		{
			System.out.println("The number "+originalNum+" is Not a Palindrom.");
		}
	}
}


