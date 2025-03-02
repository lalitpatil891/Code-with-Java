##A StartWithVowelAndLengthGreaterThanFive

### Description
This Java program processes a list of words and filters out the ones that:
1. Start with a vowel (case-insensitive).
2. Have a length greater than 5 characters.

The filtered words are collected and printed as output.

### How It Works
1. Reads an integer `N` from user input, representing the number of words.
2. Reads `N` words from input.
3. Uses Java Streams to filter words based on:
   - First character being a vowel (`a, e, i, o, u` in any case).
   - Length greater than 5.
4. Collects and prints the filtered words.

## Sample Input/Output
### Input:
```
5
Aeroplane
apple
egg
Dog
Orange
```
### Output:
```
[Aeroplane, apple, Orange]
```

### Technologies Used
- Java
- Java Streams API (`filter()`, `collect()`)
- Regular Expressions for filtering

### How to Run
1. Compile the program:
   ```
   javac StartWithVowel.java
   ```
2. Run the program:
   ```
   java StartWithVowel
   ```
3. Enter the number of words and the words themselves.
