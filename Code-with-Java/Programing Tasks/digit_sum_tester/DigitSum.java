package com.nit.digit_sum_tester;

public class DigitSum {

	private int num;
	
	public DigitSum(int num) {
		super();
		this.num = num;
	}

	public int getNthDigitFromRight(int position) {
		int temp = num;
		
		for(int i = 1;  i < position; i++) {
			temp /= 10;
			
		}
		return temp % 10;
		
	}
	
	public int addFirstAndNthDigit(int position) {
		
		int nthDigit = getNthDigitFromRight(position);
		
		int temp = num;
		
		while (temp >= 10)
		{
			temp /= 10;
		}
		int firstDigit = temp;
		
		return firstDigit + nthDigit;
		
	}
}
