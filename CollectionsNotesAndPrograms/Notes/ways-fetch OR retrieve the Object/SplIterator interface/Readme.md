Here is the **separate Java code example** using **`Spliterator<E>`** – introduced in **JDK 1.8** – to traverse a collection.

---

### ✅ **Using `Spliterator<E>` – \[JDK 1.8]**

```java
import java.util.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");

        // Getting Spliterator
        Spliterator<String> spliterator = names.spliterator();

        // Traversing using forEachRemaining
        spliterator.forEachRemaining(name -> System.out.println(name));
    }
}
```

---

### 🔍 **Explanation:**

* `Spliterator` = **Split + Iterator**
* It supports **parallel** and **sequential** processing.
* Main methods:

  * `tryAdvance(Consumer action)` – processes one element at a time.
  * `forEachRemaining(Consumer action)` – processes all remaining elements.
  * `trySplit()` – useful for splitting tasks in **parallel streams**.

💡 This is mostly used in **internal iteration** (like parallel streams) but can be used directly like above.
