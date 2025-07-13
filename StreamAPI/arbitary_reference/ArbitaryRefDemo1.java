package streamAPI.arbitary_reference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ArbitaryRefDemo1 {

	public static void main(String[] args) {
		
		Vector<Integer> listOfNumbers = new Vector<>();
		
		listOfNumbers.add(12);
		listOfNumbers.add(22);
		listOfNumbers.add(9);
		listOfNumbers.add(5);
		
		//By using Lambda Exp
		
		Collections.sort(listOfNumbers, (i1,i2) -> i2.compareTo(i1));
		System.out.println(listOfNumbers);
	
	
		System.out.println("-------------------------------------");
		
		//by using Method Ref
		Collections.sort(listOfNumbers, Integer::compareTo);
		System.out.println(listOfNumbers);
		
		System.out.println("-------------------------------------");
		
		//by using lambda
		
		String [] players = {"virat", "rohit", "dhoni", "zaheer", "Abhishek"};
		Arrays.sort(players,(s1,s2) -> s2.compareTo(s1));
		
		System.out.println(Arrays.toString(players));
				
		System.out.println("-------------------------------------");
		//by using method reference
		
		Arrays.sort(players, String::compareTo);
		System.out.println(Arrays.toString(players));
		
	}
}
