import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateFromStack {
	
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        // Use LinkedHashSet to maintain insertion order & remove duplicates
        Set<Integer> set = new LinkedHashSet<>(stack);

        // Create new stack with unique elements
        Stack<Integer> uniqueStack = new Stack<>();
        for (int num : set) {
            uniqueStack.push(num);
        }

        System.out.println("Unique Stack: " + uniqueStack);
    }
}

/*OUTPUT

Original Stack: [10, 20, 10, 30, 20]
Unique Stack: [10, 20, 30]

*/
