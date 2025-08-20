# ArrayList<E>

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, Serializable, Clonable, RandomAccess
````

* It is a predefined class available in `java.util` package under List interface from Java 1.2v.
* It accepts **duplicate, null, homogeneous and heterogeneous elements**.
* It is a **dynamically growable array**.
* It stores the elements on **index basis**, so it is similar to dynamic array.
* All the methods declared inside an ArrayList are **not synchronized**, so multiple threads can access the methods of ArrayList → performance wise it is good.
* It is highly suitable for **fetching or retrieving operation** when duplicates are allowed and **Thread-safety is not required**.
* Iterator is a **Fail-Fast Iterator**.
* It implements **List, Serializable, Clonable, RandomAccess** interfaces.

### Initial Capacity

* Initial capacity of ArrayList is **10**.
* The new capacity of ArrayList can be calculated by using the formula:

```
new capacity = (current capacity * 3)/2 + 1  [Almost 50% increment]

newCapacity = (10 * 3) / 2 + 1
            = 30 / 2 + 1
            = 15 + 1
            = 16
```
---

## Constructor of ArrayList

In ArrayList we have 3 types of Constructor:

1. **Default capacity (10)**

   ```java
   ArrayList al1 = new ArrayList();
   ```

   Will create ArrayList object with default capacity 10.

2. **User-defined capacity**

   ```java
   ArrayList al2 = new ArrayList(int initialCapacity);
   ```

   Will create an ArrayList object with user specified Capacity.

3. **Copy another Collection**

   ```java
   ArrayList al3 = new ArrayList(Collection c);
   ```

   We can copy any Collection interface implemented class data to the current object reference (Copying one Collection data to another).

---

## Example Program

```java
package arrayListProgram;
import java.util.ArrayList;
import java.util.List;
public class ArrayListEx1 {
    public static void main(String[] args)
    {
        // Creates an ArrayList object with an initial capacity of 10. 
        List<String> list = new ArrayList<String>();

        // Call add() method to add elements at the end of the list using the reference variable list. 
        System.out.println("Adding elements to end of list");

        list.add("A"); // Adding element at index 0.
        list.add("B"); // Adding element at index 1.
        list.add("D"); // Adding element at index 2.
        list.add("E"); // Adding element at index 3.
        list.add("G"); // Adding element at index 4.
        System.out.println("ArrayList insertion order: " +list);

        System.out.println("Adding an element at a specific index after B element.");
        list.add(2, "C");
        System.out.println("ArrayList insertion order after adding C: " +list );

        System.out.println("Adding an element at a specific index after E");
        list.add(5, "F");
        System.out.println("ArrayList insertion order after adding F: " +list);
    }
}

```

```
Output: 
       Adding elements to the end of the list 
       ArrayList insertion order: [A, B, D, E, G] 
       Adding an element at a specific index after B element. 
       ArrayList insertion order after adding C: [A, B, C, D, E, G] 
       Adding an element at a specific index after E 
       ArrayList insertion order after adding F: [A, B, C, D, E, F, G]
```

![Explanation with diagram]();


