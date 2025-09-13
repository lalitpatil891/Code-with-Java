package codingtestpracticeprograms;

class Solution {

	public void isPalindromeNumber(int num) {
		
		int originalNum= num;  //121
		int temp =0;
		int reverse = 0;
		int count =0;
		
		while(num != 0) {
			temp = num%10;
			reverse = reverse * 10 + temp;
			num/=10;
			count++;
		}
		
		System.out.println("count: "+count);
		
		if(reverse == originalNum) 
			System.out.println("Palindrom");
		else
			System.out.println("not Palindrom");
	}
	
}

public class PalindromeNumber {

	public static void main(String args[]) {
		
		Solution sol = new Solution();
		
		sol.isPalindromeNumber(121);
		
		
	}
}
