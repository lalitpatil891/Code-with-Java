### ✅ **Using `ListIterator<E>` – \[JDK 1.2]**

```java
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Getting ListIterator
        ListIterator<String> listItr = names.listIterator();

        // Forward traversal
        System.out.println("Forward traversal:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        // Backward traversal
        System.out.println("Backward traversal:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
```

---

### 🔍 **Explanation:**

* `ListIterator<E>` is only available for **List** implementations (like `ArrayList`, `LinkedList`, etc.).
* It extends `Iterator<E>` and adds features:

  * `hasPrevious()` and `previous()` for reverse iteration.
  * Can also add, remove, and replace elements during traversal.
