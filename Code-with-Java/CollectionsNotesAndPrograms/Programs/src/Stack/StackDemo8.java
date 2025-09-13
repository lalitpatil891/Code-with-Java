package Stack;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class StackDemo8 {

	public static void main(String[] args) {
		
		Stack<String> movies = new Stack<>();
		
		System.out.println(movies.capacity());
		
		movies.add("dangal");
		movies.add("dangal");
		movies.add("dangal");
		movies.add("dangal");
		movies.add("sulatan");
		movies.add("pushpa");
		movies.add("pushpa");
		movies.add("pushpa");
		movies.add("kalki");
		movies.add("jawan");
		movies.add("jawan");
		movies.add("jawan");
		
		Set<String> set = new LinkedHashSet<>(movies);
		
		Stack<String> newStack = new Stack<>();
		
		for(String n : set) {
			newStack.push(n);
		}
		
		System.out.println(newStack);
	}
}
