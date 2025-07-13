package com.nit.static_block_demo;

class StaticBlockDemo7 
{
	static 
	{
      System.out.println("Static Block");
	  //return;   // Removed `return;` as it's invalid here.
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
}
