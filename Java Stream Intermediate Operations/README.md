## Java Stream Intermediate Operations

### Introduction
The **Stream API** in Java provides a functional approach to process collections of data. Streams allow for efficient data manipulation using **intermediate** and **terminal** operations.

### What are Intermediate Operations?
- **Intermediate operations** transform a stream into another stream.
- They are **lazy**, meaning they do not process elements until a **terminal operation** is invoked.
- A **new Stream** is created with each intermediate operation, allowing method chaining.

### List of Intermediate Operations

Below are the **intermediate operations** provided by the Stream API:

1. `filter(Predicate<T> predicate)`: Filters elements based on a condition.
2. `map(Function<T,R> mapper)`: Transforms each element to another form.
3. `flatMap(Function<T, Stream<R>> mapper)`: Flattens nested structures.
4. `sorted()`: Sorts elements in natural order.
5. `sorted(Comparator<T> comparator)`: Sorts elements based on a comparator.
6. `distinct()`: Removes duplicate elements.
7. `peek(Consumer<T> action)`: Performs an action without modifying elements.
8. `limit(long maxSize)`: Limits the number of elements.
9. `skip(long n)`: Skips the first `n` elements.
10. `takeWhile(Predicate<T> predicate)`: Takes elements while a condition is met.
11. `dropWhile(Predicate<T> predicate)`: Drops elements while a condition is met.

## Code Examples
Each method has a dedicated Java program demonstrating its usage.

### 1. `filter()` Example
[See FilterExample.java](FilterExample.java)

### 2. `map()` Example
[See MapExample.java](MapExample.java)

### 3. `flatMap()` Example
[See FlatMapExample.java](FlatMapExample.java)

### 4. `sorted()` Example - Sorts elements in natural order.
[See SortedExample.java](SortedExample.java)

### 5. `sorted()` Example- Sorts elements based on a comparator
[See SortedExample.java](SortedExample.java)

### 6. `distinct()` Example
[See DistinctExample.java](DistinctExample.java)

### 7. `peek()` Example
[See PeekExample.java](PeekExample.java)

### 8. `limit()` Example
[See LimitExample.java](LimitExample.java)

### 9. `skip()` Example
[See SkipExample.java](SkipExample.java)

### 10. `takeWhile()` Example
[See TakeWhileExample.java](TakeWhileExample.java)

### 11. `dropWhile()` Example
[See DropWhileExample.java](DropWhileExample.java)


## Contributing
Feel free to contribute by adding new examples or improving existing ones!
