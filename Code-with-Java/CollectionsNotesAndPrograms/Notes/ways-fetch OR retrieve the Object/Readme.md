### **Sample List**

```java
List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");
```

---

### 1) **Using `toString()` method** – \[JDK 1.0]

```java
System.out.println(names);  // Internally calls toString()
```

---

### 2) **Using Ordinary for loop** – \[JDK 1.0]

```java
for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}
```

---

### 3) **Using for-each loop** – \[JDK 1.5]

```java
for (String name : names) {
    System.out.println(name);
}
```

---

### 4) **Using `Enumeration<E>`** – \[JDK 1.0]

> Works only with legacy classes like `Vector`.

```java
Vector<String> vec = new Vector<>(names);
Enumeration<String> e = vec.elements();
while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}
```

---

### 5) **Using `Iterator<E>`** – \[JDK 1.2]

```java
Iterator<String> itr = names.iterator();
while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

### 6) **Using `ListIterator<E>`** – \[JDK 1.2]

```java
ListIterator<String> listItr = names.listIterator();
while (listItr.hasNext()) {
    System.out.println(listItr.next());
}
```

---

### 7) **Using `Spliterator<E>`** – \[JDK 1.8]

```java
Spliterator<String> splItr = names.spliterator();
splItr.forEachRemaining(System.out::println);
```

---

### 8) **Using `forEach(Consumer<T> cons)`** – \[JDK 1.8]

```java
names.forEach(name -> System.out.println(name));
```

---

### 9) **Using Method Reference** – \[JDK 1.8]

```java
names.forEach(System.out::println);
```

---

✅ **All examples are valid and demonstrate the different traversal techniques over a Collection in Java.**
