package Stack;

import java.awt.SystemTray;
import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		 // Create a Stack of city names (Strings)
        Stack<String> city = new Stack<>();
        city.push("Hyderabad");
        city.push("Pune");
        city.push("Mumbai");
        city.push("Surat");
        city.push("Anandpur");

        // Display original stack
        System.out.println("Without sort : " + city);

        // Sort cities alphabetically using lambda expression (Java 8+)
        city.sort((x, y) -> x.compareTo(y));
        // Alternative: city.sort(String::compareTo);

        System.out.println("After sort : " + city);

        int sum = 0;   // total characters count
        int temp;      // temporary variable to store string length

        // Process stack until it's empty
        while (!city.isEmpty()) {
            // peek() gives top element without removing
            temp = city.peek().length();
            sum += temp;

            // pop() removes the top element
            System.out.println("Popped city: " + city.pop());
        }

        // Print total length of all city names
        System.out.println("Total characters in all city names: " + sum);
	}
}

/*
OUTPUT

Without sort : [Hyderabad, Pune, Mumbai, Surat, Anandpur]
After sort : [Anandpur, Hyderabad, Mumbai, Pune, Surat]
Popped city: Surat
Popped city: Pune
Popped city: Mumbai
Popped city: Hyderabad
Popped city: Anandpur
Total characters in all city names: 32
 * */
