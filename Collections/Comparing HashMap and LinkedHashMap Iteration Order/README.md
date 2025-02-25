## Comparing HashMap and LinkedHashMap Iteration Order

### Overview

`ComparingHashMapAndLinkedHashMap` is a Java program that demonstrates the difference in iteration order between `HashMap` and `LinkedHashMap`.

- **HashMap** does not guarantee any specific iteration order.
- **LinkedHashMap** maintains the insertion order.

### Features

- Takes dynamic input for key-value pairs.
- Stores entries in both `HashMap` and `LinkedHashMap`.
- Displays the iteration order for both maps.

### Program Structure

```
├── ComparingHashMapAndLinkedHashMap.java
```

### How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**

   ```bash
   javac ComparingHashMapAndLinkedHashMap.java
   ```

3. **Run the program:**

   ```bash
   java ComparingHashMapAndLinkedHashMap
   ```

### Sample Input/Output

**Example 1:**

```
Enter number of elements: 5
Enter key: 1
Enter value: One
Enter key: 2
Enter value: Two
Enter key: 3
Enter value: Three
Enter key: 4
Enter value: Four
Enter key: 5
Enter value: Five

HashMap iteration order:
3 -> Three
5 -> Five
1 -> One
2 -> Two
4 -> Four

LinkedHashMap iteration order:
1 -> One
2 -> Two
3 -> Three
4 -> Four
5 -> Five
```

**Example 2:**

```
Enter number of elements: 5
Enter key: 10
Enter value: Ten
Enter key: 20
Enter value: Twenty
Enter key: 30
Enter value: Thirty
Enter key: 40
Enter value: Forty
Enter key: 50
Enter value: Fifty

HashMap iteration order:
50 -> Fifty
20 -> Twenty
40 -> Forty
10 -> Ten
30 -> Thirty

LinkedHashMap iteration order:
10 -> Ten
20 -> Twenty
30 -> Thirty
40 -> Forty
50 -> Fifty
```

### Code Explanation

- **Scanner** is used to take user input.
- Two maps are initialized: `HashMap` and `LinkedHashMap`.
- Both maps are populated with the same key-value pairs.
- Iteration over both maps shows the difference in how they store elements.

### Contributing

Feel free to fork this repository, submit pull requests, or suggest improvements.
