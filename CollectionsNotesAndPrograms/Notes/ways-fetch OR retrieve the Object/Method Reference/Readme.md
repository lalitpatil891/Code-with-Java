### ✅ **Using Method Reference – \[JDK 1.8]**

```java
import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");

        // Using method reference to print each element
        names.forEach(System.out::println);
    }
}
```

---

### 🔍 **Explanation:**

* `System.out::println` is a **method reference** to the `println()` method of `PrintStream`.
* It's a **shorthand** for a lambda expression like `name -> System.out.println(name)`.
* Clean, concise, and readable.

✅ This is one of the most commonly used and preferred ways to iterate in modern Java (Java 8+).
