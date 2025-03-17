package com.nit.assignment_09_jan_mcq;

import java.io.FileNotFoundException;

public class a60 {

	public static void main(String[] args) throws Exception {
		
		try
		{
			throw new FileNotFoundException("");
		}
		
		catch (FileNotFoundException ex)
		{
			System.out.println("Book list not found!");
			throw ex;
		}
		

	}

}

/*Output

	Book list not found!
	
	Exception in thread "main" java.io.FileNotFoundException: 
	at AllLabTasks/com.nit.assignment_09_jan_mcq.a60.main(a60.java:11)


 */

/**
Here's the **flow structure** of the given Java program:

### **Program Flow:**

1. **Start of `main` method**:
   - The `main` method is declared with `throws Exception`, which means it can throw exceptions to the JVM.

2. **`try` Block Execution**:
   - Inside the `try` block, a `FileNotFoundException` is explicitly thrown using `throw new FileNotFoundException("");`.

3. **Exception Handling in `catch` Block**:
   - The `catch (FileNotFoundException ex)` block catches the `FileNotFoundException` that was thrown in the `try` block.

4. **Inside the `catch` Block**:
   - The message **"book list not found!"** is printed to the console.
   - The same exception (`FileNotFoundException`) is rethrown using `throw ex;`.

5. **Re-Thrown Exception Handling**:
   - Since the `main` method has `throws Exception` in its signature, the rethrown `FileNotFoundException` propagates up to the JVM.
   - The JVM will handle the uncaught exception and print the stack trace.

---

### **Output of the Program**:
1. **Console Output**:
   ```
   book list not found!
   ```

2. **Stack Trace** (printed by JVM):
   ```
   Exception in thread "main" java.io.FileNotFoundException
       at a60.main(a60.java:6)
   ```

---

### **Detailed Flow Summary**:
1. The program enters the `try` block and throws a `FileNotFoundException`.
2. The `catch` block catches this exception, prints a message, and rethrows it.
3. The `main` method does not handle the rethrown exception explicitly but declares `throws Exception`, so the JVM takes over and prints the exception's stack trace.


*/