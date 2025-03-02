## UniqueWords Program

### Description
This Java program reads multiple sentences from the user and extracts a list of all unique words in lowercase while preserving the order in which they appear.

### Features
- Reads a number of sentences from the user.
- Converts all words to lowercase.
- Removes duplicate words while maintaining the original order.
- Uses Java Streams for efficient processing.

## Usage
### Input Format
1. An integer `n` representing the number of sentences.
2. `n` sentences, each containing multiple words.

### Output Format
- A list of unique words extracted from the sentences, printed in order of appearance.

### Sample Input
```
3
java is beautiful
java is a platform
java is a multithreaded
```

### Sample Output
```
[beautiful, platform, multithreaded]
```

### Implementation
### Code
```java
import java.util.*;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        while (n-- > 0) {
            words.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
        }
        scanner.close();

        // Remove duplicates while maintaining order
        List<String> uniqueWords = words.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}
```

### How It Works
1. The program takes input for `n`, the number of sentences.
2. It then reads `n` sentences and splits them into words while converting them to lowercase.
3. The words are added to a list, preserving their original order.
4. Using Java Streams and `distinct()`, duplicate words are removed.
5. The final list of unique words is printed as output.

### Dependencies
- Java SE 8 or higher
- A Java compiler (e.g., `javac`)

### Compilation & Execution
To compile and run the program, use the following commands:
```sh
javac UniqueWords.java
java UniqueWords
```
