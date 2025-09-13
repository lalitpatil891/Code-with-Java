//peek() is useful when you only want to check the top element without modifying the stack.
package Stack;

import java.util.Stack;

public class StackDemo6 {
	public static void main(String[] args) {
		 // Create a Stack of fruits
        Stack<String> stk = new Stack<>();
        
        // Adding elements using push()
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        stk.push("Orange");
        
        // Display full stack
        System.out.println("Stack: " + stk);  
        
        // peek() -> returns top element without removing it
        String fruit = stk.peek();  
        System.out.println("Element at top: " + fruit);  
        
        // Stack remains unchanged after peek()
        System.out.println("Stack elements are : " + stk);   

	}
}

/*
Stack: [Apple, Grapes, Mango, Orange]
Element at top: Orange
Stack elements are : [Apple, Grapes, Mango, Orange]
*/