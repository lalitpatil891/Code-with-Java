# Stack<E> in Java

- `public class Stack<E> extends Vector<E>`  
- It is a predefined class available in `java.util` package. It is the subclass of `Vector` class introduced from JDK 1.0, so it is also a legacy class.  
- It is a linear data structure that is used to store the Objects in **LIFO (Last In First Out)** order.  
- Inserting an element into a Stack is known as **push operation** whereas extracting an element from the top of the stack is known as **pop operation**.  
- It throws an exception called `java.util.EmptyStackException`, if the Stack is empty and we want to fetch the element.  
- It has only one constructor as shown below:  

```java
Stack s = new Stack();
```

This will create an empty Stack object.

---

## Methods

- **public E push(Object o)** :- To insert an element in the bottom of the Stack.  

- **public E pop()** :- To remove and return the element from the top of the Stack.  

- **public E peek()** :- Will fetch the element from the top of the Stack without removing.  

- **public boolean empty()** :- Verifies whether the stack is empty or not (return type is boolean).  

- **public int search(Object o)** :- It will search for a particular element in the Stack and it returns offset position (`int` value). If the element is not present in the Stack it will return `-1`.  

![Stack LIFO Example](https://github.com/lalitpatil891/Code-with-Java/blob/main/CollectionsNotesAndPrograms/Notes/List/Stack%20(Class%20-%20extends%20Vector)/img.png)

