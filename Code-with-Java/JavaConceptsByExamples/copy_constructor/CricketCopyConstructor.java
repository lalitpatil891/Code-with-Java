package com.nit.copy_constructor;

public class CricketCopyConstructor {

	public static void main(String[] args) {
		
		Batter p1 = new Batter(7,"MS Dhoni");
		
		System.out.println(p1);
		
		Boller b1 = new Boller(p1);
		System.out.println(b1);
	}

}
