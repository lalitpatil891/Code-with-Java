/*Note : static variables are also having default value.*/

package com.nit.static_block_demo;

class Fooo
{
	static int x;
	
	static {
		System.out.println("x value is: "+x);
	}
}

class StaticBlockDemo3
{
	public static void main(String[] args)
	{
		new Fooo();
	}
}


//OUTPUT : x value is: 0