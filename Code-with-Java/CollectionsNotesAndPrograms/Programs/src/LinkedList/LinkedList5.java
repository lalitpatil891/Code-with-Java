package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList5 {
	public static void main(String args[]) {
		LinkedList<String> city = new LinkedList<>();

		city.add("Kolkata");
		city.add("Bangalore");
		city.add("Hyderabad");
		city.add("Pune");
		
		System.out.println(city);
		
		ListIterator lst = city.listIterator();
		
		while (lst.hasNext()) {
            Object cityName = lst.next();

            if (cityName.equals("Kolkata")) {
                lst.remove(); 
            } 
            else if (cityName.equals("Hyderabad")) {
                lst.add("Amirpet"); 
            } 
            else if (cityName.equals("Pune")) {
                lst.set("Mumbai"); 
            } 
            else {
                System.out.println("Invalid input: " + cityName);
            }
        }
		
		city.forEach(System.out::println);	
	}
}

/* 
[Kolkata, Bangalore, Hyderabad, Pune]
Invalid input: Bangalore
Bangalore
Hyderabad
Amirpet
Mumbai
*/