package Stack;

import java.util.Stack;

public class StackDemo1 {
	
	public static void main(String[] args) {
	 
		Stack<String> city = new Stack<>();
	 
		city.push("hyderabad");
		city.push("pune");
		city.push("mumbai");
		city.push("surat");
		city.push("anandpur");
		

		System.out.println(city);
		
		//sort city using lambda expression
		city.sort((x,y) -> x.compareTo(y));
	 
		System.out.print(city);
	
	}
}
