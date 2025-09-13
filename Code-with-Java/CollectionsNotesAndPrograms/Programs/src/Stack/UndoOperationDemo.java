package Stack;

import java.util.Stack;

public class UndoOperationDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		// Perform operations
		stack.push("Type A");
		stack.push("Type B");
		stack.push("Type C");

		System.out.println("Operations: " + stack);

		// Undo last action
		System.out.println("Undo: " + stack.pop());
		System.out.println("Current state: " + stack);
	}

}
