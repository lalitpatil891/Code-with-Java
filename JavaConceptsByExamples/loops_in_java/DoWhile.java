package com.nit.loops_in_java;

public class DoWhile {
	
	public static void main(String[] args) {
		
			do
			{
				int x = 1;//Local Variable(Block level)
				
				System.out.println("X value is : "+x);
				x++;
				
			}
			
			while(x <= 10);   //ERRORs

	}

}

/*
	Note: x is a block level variable because It is declared inside do block so the scope of this x varible will be within the do block only.

*/