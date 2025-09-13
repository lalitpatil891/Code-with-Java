## SortByLengthAndLexicographically

### Description
This Java program sorts a list of words based on:
1. Length (shorter words appear first).
2. Lexicographical order (case-insensitive) if words have the same length.

### How It Works
1. Reads an integer `N` from user input, representing the number of words.
2. Reads `N` words from input.
3. Uses Java Streams to sort words:
   - First by length (`Comparator.comparingInt(String::length)`).
   - Then lexicographically (`thenComparing(String::compareToIgnoreCase)`).
4. Collects and prints the sorted words.

### Sample Input/Output
### Input:
```
5
Apple
ball
ant
Banana
dog
```
### Output:
```
[Apple, Banana, ant, ball, dog]
```

### Technologies Used
- Java
- Java Streams API (`sorted()`, `collect()`)
- Comparator chaining for sorting

### How to Run
1. Compile the program:
   ```
   javac SortByLengthAndLexicographically.java
   ```
2. Run the program:
   ```
   java SortByLengthAndLexicographically
   ```
3. Enter the number of words and the words themselves.
