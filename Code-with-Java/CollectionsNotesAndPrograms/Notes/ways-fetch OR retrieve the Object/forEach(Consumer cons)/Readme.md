### ✅ **Using `forEach(Consumer<T> cons)` – \[JDK 1.8]**

```java
import java.util.*;
import java.util.function.Consumer;

public class ForEachConsumerExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");

        // Using forEach with Consumer functional interface
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
    }
}
```

---

### 🔍 **Explanation:**

* `forEach` is a **default method** in the `Iterable` interface.
* It accepts an implementation of the **`Consumer<T>` functional interface**, whose `accept()` method defines the action for each element.
* This is the **long-form / anonymous class** version — good for understanding the mechanics.
* In practice, this is often replaced by lambda or method reference (next example).
