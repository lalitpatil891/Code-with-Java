## Odd Numbers Square Generator

### Description
This Java program generates an infinite stream of odd numbers using `Stream.iterate()` and computes the square of each odd number up to a given limit `N`. The squared values are collected into a list and printed as output.

### How It Works
1. Reads an integer `N` from user input.
2. Generates an infinite stream of odd numbers starting from `1`.
3. Limits the stream to only odd numbers up to `N`.
4. Maps each odd number to its square.
5. Collects the squared values into a list and prints them.

### Sample Input/Output
### Input:
```
10
```
### Output:
```
[1, 9, 25, 49, 81]
```

### Technologies Used
- Java
- Java Streams API (`Stream.iterate()`, `map()`, `collect()`)

### How to Run
1. Compile the program:
   ```
   javac OddNumbersSquare.java
   ```
2. Run the program:
   ```
   java OddNumbersSquare
   ```
3. Enter a number as input when prompted.
