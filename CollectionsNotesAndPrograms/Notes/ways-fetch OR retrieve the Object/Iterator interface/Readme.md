### ✅ **Using `Iterator<E>` – \[JDK 1.2]**

```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Getting Iterator
        Iterator<String> itr = names.iterator();

        // Traversing using Iterator
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
```

---

### 🔍 **Explanation:**

* `Iterator<E>` works with **all Collection implementations** (`List`, `Set`, etc.).
* Two key methods:

  * `hasNext()` – checks if another element exists
  * `next()` – returns the next element
* Allows **safe removal** of elements during iteration using `remove()`.
