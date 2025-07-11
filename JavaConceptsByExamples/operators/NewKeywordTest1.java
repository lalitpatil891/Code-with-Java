package com.nit.operators;

class Welcome
{
	int x = 500; // non static veriable
	
	public void show()
	{
		System.out.println("hello Batch 40");
	}
}

public class NewKeywordTest1 {
	
	public static void main(String[] args)
	{
		Welcome w = new Welcome();
		System.out.println(w.x);
		w.show();		
	}
}

/*
Output

500
hello Batch 40


*/
