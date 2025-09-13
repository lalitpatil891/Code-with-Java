package com.nit.factory_method;

import java.util.Scanner;

public class Friends {
	
	private String name;
	private int srNo;
	
	public Friends(int srNo, String name)
	{
		this.srNo = srNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friends [ srNo= " + srNo + ",name= " + name +"]";
	}
	
	public static Friends getFriendObject()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter SrNo: ");
		int srNo = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Friend Name: ");
		String name = sc.nextLine();
		
		return new Friends(srNo, name);	
	}
	
	
}
