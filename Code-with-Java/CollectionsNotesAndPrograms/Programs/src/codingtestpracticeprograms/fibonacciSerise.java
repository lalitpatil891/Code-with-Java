//fibonacciSerise given number

package codingtestpracticeprograms;

import java.util.Arrays;

class Solution2 {
	
	public void findSeries(int num) {
		//0 1 1  2  3 5  8
		System.out.println(num);
				
		int temp = 0;
		
		int first = 0;  //1
		int second = 1; //2 

		for(int i=1; i<=num; i++) {
			
			System.out.print(first +" ");  //0 1 1 2 3 5 8 
			
			int next = first + second;
			first = second;
			second = next;
			
		}		
	};
}

public class fibonacciSerise {

	public static void main(String[] args) {
		
		
		Solution2 sol = new Solution2();
		
		sol.findSeries(7);

		
		
	}

}
