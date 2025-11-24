package patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TringlePrimeNumber {

	public static void main(String[] args) {

		int rows = 5; //number of rows
		int num = 2;  //starting prime number
		int count = 0;
		
		for(int i =1; i<=rows; i++) {
			for(int j=1; j <=i; j++) {
				
				while(!isPrime(num)) {
					num++;
				}
				
				System.out.print(num +" ");
				num++;
				count++;
				
			}
			System.out.println();
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<=1) return false;
		
		for(int i =2; i<=num/2; i++) {
			if(num % i == 0) return false;
		}
		
		return true;
	}
}
