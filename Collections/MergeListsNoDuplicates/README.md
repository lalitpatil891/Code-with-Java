# Java Program to Merge Lists & Remove Duplicates

## Overview

`RemoveDuplicateFromListELC` is a Java program that merges two lists provided by the user and removes duplicate elements, displaying the final list with unique values.

## Features

- Accepts two lists of integers from the user.
- Merges both lists.
- Removes duplicate elements.
- Displays the merged list with unique values.

## Program Structure

```
├── RemoveDuplicateFromListELC.java
```

## How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**

   ```bash
   javac RemoveDuplicateFromListELC.java
   ```

3. **Run the program:**

   ```bash
   java RemoveDuplicateFromListELC
   ```

## Sample Input/Output

**Example 1:**

```
Enter the size of the first list: 4
Enter elements: 1 2 3 4
Enter the size of the second list: 4
Enter elements: 3 4 5 6
[1, 2, 3, 4, 5, 6]
```

**Example 2:**

```
4 1 2 3 4 4 3 4 5 6
[1, 2, 3, 4, 5, 6]
```

## Code Explanation

- **Scanner** is used to read input from the user.
- Two lists are stored using `ArrayList<Integer>`.
- Elements from both lists are merged into a new list while checking for duplicates.
- The final list is displayed without any repeated elements.

## Contributing

Feel free to fork this repository, submit pull requests, or suggest improvements.
