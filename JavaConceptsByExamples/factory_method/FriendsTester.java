package com.nit.factory_method;

import java.util.Scanner;

public class FriendsTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Objects you want: ");
		int  noOfObj = sc.nextInt();
		
		Friends[] frd = new Friends[noOfObj+1];
		
		for(int i=1; i<= noOfObj; i++)
		{
			//Friends frd = Friends.getFriendObject();    //Factory Method
			frd[i] = Friends.getFriendObject();   
			//System.out.println(obj);
		}
		
		System.out.println("\n Friends Details..");
		for(Friends friends : frd)
		{
			System.out.println(friends);
		}
		
		sc.close();
	}

}
