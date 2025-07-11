package com.nit.even_odd;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		boolean isEven = EvenOrOdd.isEven(num);
		System.out.println(num+" is Even ?:"+isEven);
		
		System.out.println("Enter Another Number : ");
		num = sc.nextInt();
		
		isEven = EvenOrOdd.isEven(num);
		System.out.println(num+" is Even ?: "+isEven);
	}

}
