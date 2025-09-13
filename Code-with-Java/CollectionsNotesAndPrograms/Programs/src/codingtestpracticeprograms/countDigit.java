//WAP find count of the program

package codingtestpracticeprograms;

class Solution1 {

	public int count(int num) {
		
		int count =0;
		
		while(num!=0) {
			num/=10;  //remove last digit
			count++;
		}
		
		return count;
	}
		
}

public class countDigit {

	public static void main(String[] args) {
		
		Solution1 sol = new Solution1();
		
		int ans = sol.count(6372);
		
		System.out.println("count ="+ans);
	}

}
