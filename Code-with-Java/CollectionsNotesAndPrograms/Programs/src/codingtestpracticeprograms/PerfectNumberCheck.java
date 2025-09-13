package codingtestpracticeprograms;

public class PerfectNumberCheck {

	public static void main(String[] args) {

		int number = 6;
		int sum= 0;
		
		for(int i = 1; i<= number/2; i++) {
			
			if(number% i == 0) {
				sum += i; 
			}
		}
		
		boolean isPerfect= (sum == number);
		
		System.out.println(isPerfect);
	}
}


/**🔹 What is a Perfect Number?

A Perfect Number is a positive integer that is equal to the sum of its proper divisors (all divisors except the number itself).

🔹 Examples
✅ 6

Divisors: 1, 2, 3, 6
Proper divisors: 1, 2, 3
Sum = 1 + 2 + 3 = 6
So, 6 is a Perfect Number.

✅ 28

Divisors: 1, 2, 4, 7, 14, 28
Proper divisors: 1, 2, 4, 7, 14
Sum = 1 + 2 + 4 + 7 + 14 = 28
So, 28 is a Perfect Number.

❌ 12

Divisors: 1, 2, 3, 4, 6, 12
Proper divisors: 1, 2, 3, 4, 6
Sum = 16 ≠ 12
So, 12 is NOT a Perfect Number.
*/