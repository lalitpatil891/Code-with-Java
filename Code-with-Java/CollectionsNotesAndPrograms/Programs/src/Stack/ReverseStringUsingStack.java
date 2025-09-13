package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String input = "HELLO";
		
		Stack<Character> stack = new Stack<>();

		// Push all characters into stack
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}

		// Pop all characters → reversed string
		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed.toString());

	}

}
