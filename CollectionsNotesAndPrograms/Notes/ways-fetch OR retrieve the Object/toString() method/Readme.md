### ✅ **Using `toString()` Method – \[JDK 1.0]**

```java
import java.util.*;

public class ToStringExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Using toString() method to print the list
        System.out.println(names);  // Internally calls names.toString()
    }
}
```

---

### 🔍 **Explanation:**

* The `toString()` method of the `ArrayList` class is overridden to return a string representation like `[Lalit, Amit, Sneha, Ravi]`.
* When you pass a collection to `System.out.println()`, Java automatically calls its `toString()` method.
