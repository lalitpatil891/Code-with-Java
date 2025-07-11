package com.nit.method_chaining;

public class MethodChainingDemo1 {

	public static void main(String[] args) {
		
		String str = "india";

		char ch= str.concat("is great").toUpperCase().charAt(0);

		System.out.println(ch);
	}
}

/*OUTPUT*/


/**This Java program demonstrates *method chaining**, where multiple method calls are linked together in a single statement. Let's break it down step-by-step:

### Code Explanation
1. **Initial String**:
   `String str = "india";`
   A string variable `str` is initialized with the value `"india"`.

2. **Method Chaining**:
   ```java
   char ch = str.concat("is great").toUpperCase().charAt(0);
   ```
   Here’s what happens in detail:

   - `str.concat("is great")`**:
     - The `concat` method appends the string `"is great"` to the original string `"india"`.
     - Result: `"indiais great"`

   - **`.toUpperCase()`**:
     - The `toUpperCase` method converts the entire string to uppercase.
     - Result: `"INDIAIS GREAT"`

   - **`.charAt(0)`**:
     - The `charAt` method retrieves the character at index `0` of the resulting string.
     - In `"INDIAIS GREAT"`, the character at index `0` is `'I'`.

   The result `'I'` is assigned to the variable `ch`.

3. **Print the Result**:
   ```java
   System.out.println(ch);
   ```
   This prints the character `'I'` to the console.

### Output
```
I
```

### Key Concepts
1. **Immutability of Strings**:
   - Each method call creates a new string object because strings in Java are immutable. The original string `"india"` remains unchanged.

2. **Method Chaining**:
   - Methods like `concat`, `toUpperCase`, and `charAt` are called in sequence because each method returns a result that the next method operates on.

### Why Use Method Chaining?
- It allows for concise and readable code.
- However, care should be taken to avoid long, complex chains as they can become hard to debug.*/
