package com.nit.method_chaining;

public class MethodChainingDemo2 {

	public static void main(String[] args) {
		
		String str = "Hyderabad";
		
		int length = str.concat(" is IT City").toUpperCase().length();
		
		System.out.println(length);	
		
		/**
		String updatedStr = str.concat(" is IT City");
		updatedStr = updatedStr.toUpperCase();
		int length = updatedStr.length();
		System.out.println(updatedStr);
		System.out.println(length);
		*/
	}
}

/**This Java program is another example of **method chaining**, where methods are called in sequence to perform multiple operations on a `String`. Let’s break down the code step-by-step.

---

### Code Explanation

1. **Initial String**:
   ```java
   String str = "Hyderabad";
   ```
   - A string variable `str` is initialized with the value `"Hyderabad"`.

2. **Method Chaining**:
   ```java
   int length = str.concat(" is IT City").toUpperCase().length();
   ```
   Here's what happens step by step:

   - **`str.concat(" is IT City")`**:
     - The `concat` method appends the string `" is IT City"` to the original string `"Hyderabad"`.
     - Result: `"Hyderabad is IT City"`

   - **`.toUpperCase()`**:
     - The `toUpperCase` method converts the entire string to uppercase.
     - Result: `"HYDERABAD IS IT CITY"`

   - **`.length()`**:
     - The `length` method calculates the number of characters in the string `"HYDERABAD IS IT CITY"`.
     - Result: `21` (the string has 21 characters, including spaces).

   The result `21` is assigned to the variable `length`.

3. **Print the Result**:
   ```java
   System.out.println(length);
   ```
   - The value of `length` (`21`) is printed to the console.

---

### Output
```
21
```

---

### Key Concepts

1. **String Concatenation**:
   - The `concat` method appends one string to another and returns the combined string.

2. **Case Conversion**:
   - The `toUpperCase` method converts all the characters in the string to uppercase.

3. **String Length**:
   - The `length` method counts the total number of characters in the string, including spaces.

4. **Immutability**:
   - Strings in Java are immutable. Every method (like `concat`, `toUpperCase`, etc.) creates a new string object without altering the original string.

5. **Method Chaining**:
   - Each method returns a result that is immediately used as the input for the next method in the chain.

---

### Benefits of Method Chaining
- **Conciseness**: Combines multiple operations in a single line of code.
- **Readability**: Makes it easier to understand the flow of operations.

---

### Notes
- Method chaining should be used cautiously; excessively long chains can reduce code readability and make debugging harder.
- To make the code more readable, you can split the chained calls across multiple lines, like so:
  ```java
  String updatedStr = str.concat(" is IT City");
  updatedStr = updatedStr.toUpperCase();
  int length = updatedStr.length();
  System.out.println(length);
  ```*/

