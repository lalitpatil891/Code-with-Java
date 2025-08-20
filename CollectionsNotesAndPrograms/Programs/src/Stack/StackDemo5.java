package Stack;

import java.util.Stack;

public class StackDemo5 {

	public static void main(String[] args) {
		// Create a stack of fruits
        Stack<String> stk = new Stack<>();
        
        // Add elements into stack
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        
        // search(Object o) → returns 1-based position from TOP of stack
        // If element not found, returns -1
        System.out.println("Offset Position of Mango: " + stk.search("Mango"));   // 1
        System.out.println("Offset Position of Banana: " + stk.search("Banana")); // -1
        
        // empty() → checks if stack is empty (true/false)
        System.out.println("Is stack empty? " + stk.empty());  // false
        
        // indexOf(Object o) → returns 0-based index from BOTTOM of stack
        System.out.println("Index Position of Mango: " + stk.indexOf("Mango")); // 2

	}

}

/*OUTPUT

Offset Position of Mango: 1
Offset Position of Banana: -1
Is stack empty? false
Index Position of Mango: 2
*/
