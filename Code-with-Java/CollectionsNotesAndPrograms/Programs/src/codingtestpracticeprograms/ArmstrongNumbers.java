package codingtestpracticeprograms;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int lowerLimit = 1;
		int upperLimit = 1000;

		for(int num = lowerLimit; num<= upperLimit; num++) {
			int originalNum = num;
			int digits = 0;
			int sum = 0;
			
			while(originalNum != 0) {
				originalNum/=10;
				digits++;
			}
			
			originalNum= num;
			
			while(originalNum != 0) {
				
				int digit= originalNum % 10;
				sum += Math.pow(digit, digits);
				originalNum/= 10;
			}
			
			if(sum == num) {
				System.out.println(num);
			}
		}
	}

}
