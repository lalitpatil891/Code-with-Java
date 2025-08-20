package ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(20);
		num.add(50);
		num.add(60);
		num.add(70);
		
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Lalit");
		name.add("Mayur");
		name.add("Sunil");
		name.add("Arun");
		
		for(Integer n : num) {
			
			name.add(String.valueOf(n));
		}
		
		System.out.println(name);
	}
}
