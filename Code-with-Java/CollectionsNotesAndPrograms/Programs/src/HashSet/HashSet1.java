package HashSet;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Integer> num =  new HashSet<>();
		
		System.out.println(num.size());
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(10);
		
		System.out.println(num);
		
		num.forEach(System.out::println);	
	}
}
