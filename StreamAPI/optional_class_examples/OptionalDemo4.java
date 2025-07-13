package streamAPI.optional_class_examples;

import java.util.*;


public class OptionalDemo4 {

	public static void main(String[] args) {
		
		System.out.println("Main Method");
		
		Integer i = 23;
		
		Optional<Integer> con = Optional.ofNullable(i);
		
		con.ifPresent(System.out::println); //-> if null the nothing print but is their value is present the it will return true.
	
		System.out.println(con.isPresent()); //-> it will return true or false - boolean
		
	}

}
