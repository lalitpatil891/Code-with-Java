// check the given number is armstrong or not

package codingtestpracticeprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		 int num = 947400;
		 int tempCount = num;
		 int org= num;
		 int ans = 0;
		 int power= 0;
		 int count = 0;
		 
		 while(tempCount!=0) {
			 tempCount/=10;
			 count++;
		 }
		 
		 while(num!=0) {
			 int temp =num%10;

			 power= (int)Math.pow(temp, count);
		
			 ans += power;
			 
			 num/=10;
		 }
		 
		 if(org == ans)
			 System.out.println("Armstrong number");
		 else
			 System.out.println("not a Armstrong number");
	}

}
