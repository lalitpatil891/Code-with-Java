# ReverseListELC

## Overview
`ReverseListELC` is a simple Java program that takes a list of integers from the user, reverses it, and displays the reversed list.

## Features
- User inputs the size of the list.
- Accepts list elements from the user.
- Reverses the list using Java's `Collections.reverse()`.
- Displays the reversed list.

## Program Structure
```
├── ReverseListELC.java
```

## How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**
   ```bash
   javac ReverseListELC.java
   ```

3. **Run the program:**
   ```bash
   java ReverseListELC
   ```

## Sample Input/Output

**Example 1:**
```
Enter the size of the list: 5
Enter elements of the list:
4 5 6 7 8
Reversed list: [8, 7, 6, 5, 4]
```

**Example 2:**
```
Enter the size of the list: 5
Enter elements of the list:
5 4 3 2 1
Reversed list: [1, 2, 3, 4, 5]
```

## Code Explanation
- **Scanner** is used to read input from the user.
- The list is stored using an `ArrayList<Integer>`.
- `Collections.reverse(list)` is used to reverse the list in place.

## Contributing
Feel free to fork this repository, submit pull requests, or suggest improvements.
