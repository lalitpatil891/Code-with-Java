package com.nit.final_keyword;

/**

final keyword in java
=====================

It is used to provide some kind of restriction in our program.
We can use final keyword in 3 ways in java.

1) To declare a class as a final.(Inheritance is not possible)

2) To declare a method as a final. (Overriding is not possible)

3) To declare a variable (Field) as a final (Re-assignment is not possible)

------------------------------------------------------------
ChatGPT 
  |
  V
In Java, the final keyword is a modifier that can be applied to variables, methods, and classes to enforce specific restrictions. 
----------------
1. Final Variables
A variable declared as final can only be assigned once. After it has been initialized, its value cannot be changed.

Examples:
Primitive Types:
	
	final int MAX_VALUE = 100;
	MAX_VALUE = 200; // Compilation error

Reference Types: While you can't reassign the reference, the object itself can still be modified:

	final List<String> names = new ArrayList<>();
	names.add("Alice"); // Allowed
	names = new ArrayList<>(); // Compilation error
----------------
2. Final Methods
A method declared as final cannot be overridden by subclasses. This is useful for ensuring that a method's behavior remains consistent.

Example:

class Parent {
    	final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    	void display() { // Compilation error
        System.out.println("Cannot override a final method.");
    }
}

----------------
3. Final Classes
A class declared as final cannot be extended (i.e., no subclass can inherit from it). This is useful for creating immutable or secure classes.

Example:

final class ImmutableClass {
    // Class implementation
}

// Compilation error: Cannot extend final class
class ChildClass extends ImmutableClass {}


*/