**short, simple, interview-ready answers** for all your topics:
---

## **1. Java Introduction**

Java is a high-level, object-oriented programming language.
It is platform-independent because of JVM.
We use it to build web, mobile, desktop, and enterprise applications.

---

## **2. Java History**

Java was developed by James Gosling at Sun Microsystems in 1995.
It was originally made for electronic devices but later became a general-purpose language.
Now Java is owned by Oracle.

---

## **3. Java Features**

* Simple and Object-Oriented
* Platform Independent (Write Once Run Anywhere)
* Secure, Robust, Portable
* Multithreaded, High Performance (JIT)

---

## **4. Java Editions**

* **Java SE** → Core Java (desktop, console apps)
* **Java EE** → Enterprise apps (web, distributed systems)
* **Java ME** → Mobile/embedded devices
* **Java FX** → Rich GUI applications

---

## **5. Difference between C, C++ and Java**

**C** → Procedural, low-level, no OOP.
**C++** → Partially OOP, supports pointers.
**Java** → Fully OOP, no pointers, platform independent, automatic memory management.

---

## **6. Types of Applications in Java**

* **Standalone applications** (desktop)
* **Web applications** (Servlet, Spring)
* **Enterprise applications** (banking, ERP)
* **Mobile applications** (Android)
* **Distributed apps** (RMI, Microservices)

---

## **7. JDK, JRE, JVM, JIT**

### **JDK (Java Development Kit)**

Contains tools to develop Java programs (compiler, debugger, JRE).

### **JRE (Java Runtime Environment)**

Provides libraries + JVM to run Java applications.
It does NOT contain development tools.

### **JVM (Java Virtual Machine)**

Executes Java bytecode.
Makes Java platform independent.

### **JIT (Just-In-Time Compiler)**

Part of JVM.
Converts bytecode to machine code at runtime for faster performance.

---

## **1. JVM (Java Virtual Machine)**

JVM is a virtual machine that runs Java bytecode.
It makes Java platform independent.
It handles memory, garbage collection, and code execution.

---

## **2. JVM Architecture (Very Short Points)**

* **Class Loader** → Loads .class files
* **Memory Area** → Heap, Stack, Method Area
* **Execution Engine** → Interpreter + JIT compiler
* **Native Method Interface** → Connects with system libraries
* **Native Method Libraries** → OS-specific code

---

## **3. First Java Program (Steps to Write)**

We create a class with `main()` method.
Inside main, we write code like `System.out.println("Hello");`.
Main is the entry point of Java program.

---

## **4. Writing & Saving Java Program**

Write code in a text editor.
Save the file **with same class name** and `.java` extension.
Example: class name → Hello, file → **Hello.java**

---

## **5. Compilation of Java Program**

Use command:

```
javac Hello.java
```

This generates **Hello.class** (bytecode).

---

## **6. Execution of Java Program**

Run using:

```
java Hello
```

JVM loads the class, interprets bytecode, and prints the output.

---

## **1. Understanding Object**

In Java, an object is a real-world entity with **state** (data) and **behavior** (methods).
We create objects using the `new` keyword.
Objects help us use OOP features like encapsulation and inheritance.

---

## **2. Object Class**

`Object` class is the **parent class of all classes** in Java.
Every Java class implicitly extends `Object`.
It provides common methods that all objects can use.

---

## **3. Important Methods in Object Class (Short Points)**

### **1. toString()**

Returns object information in string form.
Used for debugging / printing values.

### **2. equals(Object obj)**

Compares two objects for equality.
By default, it checks memory address.

### **3. hashCode()**

Returns a hash value for the object.
Used in collections like HashMap.

### **4. clone()**

Creates a copy of the object (shallow copy).
Class must implement `Cloneable`.

### **5. finalize()**

Called by GC before destroying the object.
Not recommended in modern Java.

### **6. getClass()**

Returns runtime class information.

### **7. wait(), notify(), notifyAll()**

Used for thread communication (inter-thread communication).

---

## **1. Naming Conventions**

* **Class name** → PascalCase (Example: `EmployeeDetails`)
* **Method & variable** → camelCase (Example: `getSalary`, `totalMarks`)
* **Constant** → UPPER_CASE with underscores (Example: `PI_VALUE`)
  Naming conventions make code clean and readable.

---

## **2. Java Identifier Rules (Method Rules also follow these)**

Identifiers are names for classes, methods, variables, etc.

**Rules:**

* Can contain **letters, digits, $, _**
* **Cannot start with a digit**
* **No special characters** except `$` and `_`
* **No Java keywords** allowed (like int, class)
* Identifiers are **case-sensitive**

Example: valid → `totalMarks`, `_rate`, `$price`
Invalid → `2value`, `class`

---

## **3. Understanding Separators in Java**

Separators are symbols used to structure Java code.
Important separators:

* **()** → Method call, conditions
* **{}** → Class, method, block
* **[]** → Arrays
* **;** → Statement terminator
* **,** → Separate multiple values
* **.** → Access members (object.method)

They help the compiler understand program structure.

---

## **1. Java main()**

`main()` is the **entry point** of a Java program.
JVM starts execution from the main method.
Without main, normal Java applications cannot run.

---

## **2. Syntax of Java main()**

```java
public static void main(String[] args)
```

**Meaning (short):**

* **public** → JVM can access it from anywhere
* **static** → JVM can call it without creating object
* **void** → main does not return anything
* **String[] args** → stores command line inputs

---

## **3. Command Line Arguments**

Command line arguments are values we pass from terminal while running the program.
They come inside `String[] args`.
Example:

```
java Test Hello 123
```

Here `args[0] = "Hello"` and `args[1] = "123"`.

---

## **4. Varargs (Variable Arguments)**

Varargs allow us to pass **any number of arguments** to a method.
Syntax:

```java
void show(int... a)
```

Inside method, varargs work like an array.
Only one vararg is allowed and it must be the last parameter.


---

## **1. Data Types in Java**

Data types define what kind of data a variable can hold.
Java has **primitive** and **reference** data types.
Java is **strictly typed**, so every variable must have a type.

---

## **2. Primitive Data Types**

Java has **8 primitive types**:

| Type        | Size    | Example                     |
| ----------- | ------- | --------------------------- |
| **byte**    | 1 byte  | small numbers               |
| **short**   | 2 bytes | small integers              |
| **int**     | 4 bytes | normal integers             |
| **long**    | 8 bytes | big integers                |
| **float**   | 4 bytes | decimal with less precision |
| **double**  | 8 bytes | decimal with high precision |
| **char**    | 2 bytes | single character            |
| **boolean** | 1 bit   | true/false                  |

Primitive types store **actual values**.

---

## **3. Reference Types**

Reference types store **address (reference)** of objects.
Examples:

* **Classes** → `String`, `Student`
* **Arrays** → `int[]`
* **Interfaces**
  Reference types store the **memory address**, not the actual data.

---

## **4. Java Language Keywords**

Keywords are reserved words in Java.
They have **predefined meaning** and cannot be used as identifiers.

Examples: `class`, `int`, `static`, `public`, `return`, `extends`, `implements`, `new`, `this`, `super`, `try`, `catch`.

Java has **67 keywords** (depending on version).

---

## **1. Comments in Java**

Comments are used to explain code.
They are ignored by the compiler.

### **Single Line Comment**

```java
// This is a single-line comment
```

### **Multi-Line Comment**

```java
/* 
 This is a multi-line
 comment
*/
```

---

## **2. Variables in Java**

A variable is a name that stores a value in memory.
Java has **3 types of variables** based on where they are declared.

---

## **3. Instance Variable**

* Declared **inside a class** but **outside methods**.
* Each object gets its **own copy**.
* Used to store object-level data.

Example:

```java
class Test {
    int age;  // instance variable
}
```

---

## **4. Static Variable**

* Declared with **static** keyword.
* Shared by **all objects** (only one copy).
* Used for common data like counters, constants.

Example:

```java
static int count;
```

---

## **5. Local Variable**

* Declared **inside method/constructor/block**.
* Scope is only inside that block.
* Must be **initialized** before use.

Example:

```java
void show() {
    int x = 10; // local variable
}
```

---

Here are **short, simple, interview-style answers**:

---

## **1. What is a Constructor?**

A constructor is a special method used to **create objects** and **initialize variables**.
Its name is **same as class name**.
It has **no return type**, not even void.

---

## **2. Types of Constructors**

### **1. Default Constructor**

Provided by Java when we don’t write any constructor.
Initializes values with defaults.

### **2. No-Argument Constructor**

Constructor with no parameters, written by programmer.

### **3. Parameterized Constructor**

Constructor with parameters.
Used to set values at object creation.

---

## **3. Rules for a Constructor**

* Constructor name must be **same as class name**.
* Constructors **cannot have return type**.
* Can be **overloaded** (multiple constructors allowed).
* Called automatically when object is created.

---

## **4. Constructor vs Method**

| Constructor                   | Method                      |
| ----------------------------- | --------------------------- |
| Used to **initialize object** | Used to **perform actions** |
| No return type                | Has return type             |
| Called automatically          | Called manually             |
| Same name as class            | Any valid name              |

---

## **5. Coding Programs on Constructors**

### **Example 1: Default Constructor**

```java
class Student {
    Student() {
        System.out.println("Default Constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
```

---

### **Example 2: Parameterized Constructor**

```java
class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student(101, "Lalit");
        s.show();
    }
}
```

---

### **Example 3: Constructor Overloading**

```java
class Demo {
    Demo() {
        System.out.println("No-arg Constructor");
    }

    Demo(int x) {
        System.out.println("Parameterized: " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        new Demo();
        new Demo(10);
    }
}
```

---

## **1. Increment & Decrement Operators**

Used to increase or decrease a value by 1.

* **++** → increment
* **--** → decrement

Two types:

* **Pre** (++a, --a) → changes value first
* **Post** (a++, a--) → uses value first, then changes

---

## **2. Arithmetic Operators**

Used for basic math operations.
`+ , - , * , / , %`
Example: `a + b`, `a % b` gives remainder.

---

## **3. Relational Operators**

Used to compare two values.
`== , != , > , < , >= , <=`
Always return **boolean** (true/false).

---

## **4. Logical Operators**

Used to combine conditions.
`&&` → true if both are true
`||` → true if any one is true
`!` → reverses the result

---

## **5. Negation Operator**

`!` is negation.
It flips a boolean value.
Example:
`!true → false`
`!false → true`

---

## **6. Assignment Operator**

`=` is main assignment operator.
Also includes shorthand:
`+= , -= , *= , /= , %=`

Example:
`a += 5` means `a = a + 5`.

---

## **7. Bitwise Operators**

Work on **bits** (0s and 1s).
Used in low-level programming.

Operators:

* `&` (AND)
* `|` (OR)
* `^` (XOR)
* `~` (NOT)
* `<<` (left shift)
* `>>` (right shift)
* `>>>` (unsigned right shift)

---

## **1. Understanding `static` Keyword**

`static` means the member belongs to the **class**, not the object.
It loads once in memory and is shared by all objects.
Used for common data or utility methods.

---

## **2. Static Variable**

* Declared with `static` keyword.
* Only **one copy** is created for all objects.
* Used for common values like counters, constants.

Example:

```java
static int count;
```

---

## **3. Static Method**

* Can be called **without creating object**.
* Works only with **static variables** directly.
* Commonly used for utility/helper logic.

Example:

```java
static void show() { }
```

---

## **4. Static Method Vs Instance Method**

| Static Method               | Instance Method                        |
| --------------------------- | -------------------------------------- |
| Belongs to class            | Belongs to object                      |
| No object needed            | Object required                        |
| Can access only static data | Can access both static + instance data |
| Memory loads once           | Separate for each object               |

---

## **5. Static Block**

Static block runs **once** when the class loads.
Used to initialize static data.

Example:

```java
static {
    System.out.println("Static Block");
}
```

---

## **1. Understanding Instance Members**

Instance members belong to the **object**.
Each object gets its **own copy** of instance variables and can use instance methods.
They work only when an object is created.

---

## **2. Instance Variable vs Static Variable**

| Instance Variable                    | Static Variable                    |
| ------------------------------------ | ---------------------------------- |
| Belongs to **object**                | Belongs to **class**               |
| Each object gets a **separate copy** | **One copy** shared by all objects |
| Accessed using object                | Accessed using class name          |
| Stored in **Heap**                   | Stored in **Method Area**          |

---

## **3. Instance Method**

* Declared **without static**.
* You must create an object to call it.
* Can access both **instance + static** variables.

Example:

```java
void show() { }
```

---

## **4. Instance Block vs Static Block**

### **Instance Block**

* Written using `{ }` (no keyword).
* Runs **every time** an object is created.
* Used for object-level initialization.

Example:

```java
{
    System.out.println("Instance Block");
}
```

---

### **Static Block**

* Written using `static { }`.
* Runs **one time** when class loads.
* Used for static initialization.

Example:

```java
static {
    System.out.println("Static Block");
}
```

---

## **Short Difference (Instance Block vs Static Block)**

| Instance Block              | Static Block               |
| --------------------------- | -------------------------- |
| Runs for **every object**   | Runs **only once**         |
| Object-level initialization | Class-level initialization |
| Needs object creation       | Runs before main()         |

---

Here are **static keyword (logical session)** and some **logical programs** using static.

---

# ✅ **static Keyword (Logical Understanding)**

### **1. What does static logically mean?**

Static means **class-level** memory.
It loads **only once** when the class loads.
All objects **share the same static member**.

---

### **2. When do we use static logically?**

* When a value is **common for all objects**
* When we need a **utility method** (like `Math.max()`)
* When we want **class-level counters**, IDs, or constants
* When initialization must run **once** (static block)

---

# 🔹 **Logical Programs Using static**

---

## **Program 1: Count number of objects created**

```java
class Test {
    static int count = 0;

    Test() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {
        new Test();
        new Test();
        new Test();
        System.out.println("Objects created: " + Test.count);
    }
}
```

**Logic:** static variable keeps common count → increases for every object.

---

## **Program 2: Generate unique roll numbers**

```java
class Student {
    static int seq = 100;
    int roll;

    Student() {
        roll = seq++;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.roll);
        System.out.println(s2.roll);
    }
}
```

**Logic:** static value increases → gives unique numbers.

---

## **Program 3: Static block demo**

```java
class Demo {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
```

**Logic:** static block runs **before main()**, only once.

---

## **Program 4: Using static method for utility logic**

```java
class Calc {
    static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Calc.square(5));
    }
}
```

**Logic:** No object needed → static method works as utility.

---

## **Program 5: Accessing both static and instance members**

```java
class Demo {
    static int a = 10;
    int b = 20;

    void show() {
        System.out.println(a + b);
    }

    static void display() {
        System.out.println(a);
        // System.out.println(b); // ❌ Not allowed
    }
}
```

**Logic:**

* Instance method can access both.
* Static method can access only static.

---

## **Program 6: Use static block to initialize static data**

```java
class Sample {
    static int x;

    static {
        x = 50;
        System.out.println("Static initialized");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Sample.x);
    }
}
```

**Logic:** static block sets value before main runs.

---

# ✅ **1. What is Type Casting?**

Type casting means **converting one data type into another**.
Java allows conversion between primitive types and object types.
It helps in storing values in different type variables.

---

# ✅ **2. Types of Type Casting**

Java has **two main types**:

### **A. Primitive Type Casting**

* Implicit (automatic)
* Explicit (manual)

### **B. Reference Type Casting**

* Upcasting
* Downcasting

---

# ✅ **3. Implicit Type Casting (Widening)**

Performed **automatically** by Java.
Happens when converting **small type → big type**.

Example:

```java
int a = 10;
double d = a;   // implicit
```

No data loss.

---

# ✅ **4. Explicit Type Casting (Narrowing)**

Done **manually** by programmer.
Big type → small type.

Example:

```java
double d = 10.5;
int a = (int) d;  // explicit
```

Possible data loss.

---

# ✅ **5. Upcasting (Object Casting)**

Converting **child object to parent reference**.
Done **automatically**.
Used in polymorphism.

Example:

```java
Parent p = new Child();  // upcasting
```

---

# ✅ **6. Downcasting**

Converting **parent reference back to child type**.
Done **manually**.
Risky → may cause `ClassCastException`.

Example:

```java
Parent p = new Child();
Child c = (Child) p;  // downcasting
```

---

# 🔹 **Short Summary (easy to speak)**

* Type casting = converting one type to another
* Implicit = small to big (automatic)
* Explicit = big to small (manual)
* Upcasting = child to parent (safe)
* Downcasting = parent to child (manual, risky)

---

# ✅ **1. What is the use of Wrapper Classes?**

Wrapper classes are used to **convert primitive data types into objects**.
They help when working with **collections**, **serialization**, and **object-based APIs**.
Primitive → Object (Integer, Double, Boolean, etc.)

---

# ✅ **2. List of Wrapper Classes**

| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

---

# ✅ **3. Wrapper Class Methods (Important Ones)**

### **Integer class important methods**

* `parseInt(String)` → converts string to int
* `valueOf(int)` → returns Integer object
* `toString(int)` → converts int to string

### **Double / Float**

* `parseDouble(String)`
* `valueOf(double)`

### **Character**

* `isDigit(ch)`
* `isLetter(ch)`
* `isUpperCase(ch)`
* `isLowerCase(ch)`

### **Boolean**

* `parseBoolean(String)`
* `valueOf(boolean)`

(Just mention 2–3 in interview.)

---

# ✅ **4. Auto-Boxing**

Automatic conversion of **primitive → wrapper object**.

Example:

```java
int a = 10;
Integer x = a;   // auto-boxing
```

---

# ✅ **5. Auto-Unboxing**

Automatic conversion of **wrapper object → primitive**.

Example:

```java
Integer x = 20;
int a = x;       // auto-unboxing
```

---

# 🔹 **Short summary (easy to speak):**

* Wrapper classes convert primitive to object.
* Required for collections like `ArrayList`.
* Auto-boxing → primitive to object.
* Auto-unboxing → object to primitive.

---

**Control Statements** + **logical programs**

---

# ⭐ **1. Selection Statements**

Used to make decisions in a program.

---

## ✅ **if Statement**

Runs a block only if condition is true.

```java
if (age > 18) {
    System.out.println("Adult");
}
```

---

## ✅ **if-else Statement**

Chooses between two blocks.

```java
if (marks >= 35)
    System.out.println("Pass");
else
    System.out.println("Fail");
```

---

## ✅ **if-else-if (Ladder)**

Used for multiple conditions.

```java
if (marks >= 75)
    System.out.println("Distinction");
else if (marks >= 60)
    System.out.println("First Class");
else
    System.out.println("Pass");
```

---

# ⭐ Logical Programs on if / if-else / if-else-if

### **1. Check positive, negative, zero**

```java
if (n > 0) System.out.println("Positive");
else if (n < 0) System.out.println("Negative");
else System.out.println("Zero");
```

### **2. Find biggest of two numbers**

```java
if (a > b) System.out.println(a + " is bigger");
else System.out.println(b + " is bigger");
```

### **3. Find biggest of three numbers**

```java
if (a > b && a > c)
    System.out.println(a + " is biggest");
else if (b > c)
    System.out.println(b + " is biggest");
else
    System.out.println(c + " is biggest");
```

---

# ⭐ **2. Understanding switch-case**

Used when you have multiple fixed values.

```java
switch (day) {
    case 1: System.out.println("Mon"); break;
    case 2: System.out.println("Tue"); break;
    default: System.out.println("Invalid");
}
```

✔ Good for menu-driven programs
✔ Works with int, char, String

---

# ⭐ **3. Iteration (Looping) Statements**

---

## ✅ **while Loop**

Condition checked first → may run 0 times.

```java
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

---

## ✅ **do-while Loop**

Runs at least once because condition is checked later.

```java
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## ⭐ **Understanding for loop**

Used when you know how many times to repeat.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

---

# ⭐ Logical Programs on for loop

### **1. Print 1 to 10**

```java
for (int i = 1; i <= 10; i++)
    System.out.print(i + " ");
```

### **2. Print even numbers**

```java
for (int i = 2; i <= 20; i += 2)
    System.out.print(i + " ");
```

### **3. Sum of first 10 numbers**

```java
int sum = 0;
for (int i = 1; i <= 10; i++)
    sum += i;
System.out.println(sum);
```

---

# ⭐ **Understanding for-each loop**

Used for arrays or collections.
Easy way to read values, but cannot update index.

```java
int[] arr = {10, 20, 30};
for (int x : arr) {
    System.out.println(x);
}
```

---

# ⭐ **Jump Statements**

---

## ✅ **break**

Stops the loop immediately.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.print(i + " ");
}
```

---

## ✅ **continue**

Skips the current iteration.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.print(i + " ");
}
```

---

## ✅ **return**

Exits the method.

```java
if (age < 18)
    return; // stops method execution
```

---

 **Scanner Class**:

---

## ✅ **Scanner Class – Simple Interview Notes**

### **What is Scanner Class?**

* Scanner is a class in `java.util` package used to take input from the user.
* It reads data like int, String, double, etc., from the keyboard.

---

## ✅ **Common Methods of Scanner**

* `nextInt()` → reads an integer
* `nextDouble()` → reads a decimal value
* `next()` → reads a single word
* `nextLine()` → reads a full line
* `nextBoolean()` → reads true/false
* `nextFloat()` → reads float value

---

## ✅ **How to use Scanner**

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
String name = sc.nextLine();
```

* Always write `import java.util.Scanner;`
* Create an object → `Scanner sc = new Scanner(System.in);`

---

## ✅ **Key Points**

* Scanner reads input from keyboard (System.in).
* `next()` reads one word, `nextLine()` reads entire sentence.
* Close scanner using `sc.close()` to avoid resource leak (optional for small programs).

---
**Packages in Java**:

---

## ✅ **What is a Package?**

* Package is a folder in Java used to group related classes.
* It helps in organizing code and avoiding name conflicts.

---

## ✅ **Need of Packages**

* To organize classes properly.
* To avoid class name collision.
* To provide access control and reusability.

---

## ✅ **Structure of a Package**

```
src/
   com/
      company/
          project/
              MyClass.java
```

* Package uses folder structure.
* We declare it at top: `package com.company.project;`

---

## ✅ **Types of Packages**

### **1. Built-in Packages**

* `java.lang` (default)
* `java.util`
* `java.io`
* `java.sql`
* `java.time`

### **2. User-defined Packages**

* Created using the `package` keyword.

---

## ✅ **Package Naming Rules**

* Always in lowercase.
* Use domain style: `com.company.project`.
* Should not start with numbers or special symbols.

---

## ✅ **How to Access a Package from Another Package**

### **Using import keyword**

```java
import com.company.project.MyClass;
```

### **Using fully-qualified name**

```java
com.company.project.MyClass obj = new com.company.project.MyClass();
```

### **Using wildcard**

```java
import com.company.project.*;
```

---

## ⚡ Interview-ready 2–3 lines:

* “Package is a way to group related classes in Java. It helps organize code and avoid name conflicts. We access packages using `import`, fully-qualified names, or wildcard import.”

---

***Access Modifiers***:

---

# ✅ **Access Modifiers in Java**

## **1. Class Level Access Modifiers**

These apply on **classes**:

### **✔ public**

* Class is accessible from anywhere in the project.

### **✔ default (no keyword)**

* Class is accessible only inside the **same package**.
* Also called *package-private*.

👉 *Note: Classes cannot be private or protected.*

---

## **2. Member Level Access Modifiers**

These apply on **variables, methods, constructors**:

### **✔ public**

* Accessible from anywhere.

### **✔ protected**

* Accessible in same package + subclasses in other packages.

### **✔ default (no keyword)**

* Accessible only in same package.

### **✔ private**

* Accessible only inside the same class.

---

# 🎤 **Interview 2–3 Line Answer**

“Access modifiers define visibility. At class level, we have **public** and **default**.
At member level, we have **public, protected, default, and private**.
Private is most restricted, public is fully open.”

---

***`this` keyword***:

---

# ✅ **Understanding `this` Keyword**

### **What is `this`?**

* `this` is a reference variable in Java that refers to **current object**.
* It is used inside methods, constructors, or blocks.

---

# ✅ **Uses of `this` Keyword**

### **1. To refer current object**

```java
this.name = name;
```

* Used when local variable and instance variable have same name.

### **2. To call current class method**

```java
this.show();
```

### **3. To call current class constructor**

```java
this(10);   // calling another constructor
```

### **4. To pass current object as argument**

```java
method(this);
```

### **5. To return current object**

```java
return this;
```

---

# 🎤 **Interview 2–3 Line Answer**

“`this` keyword refers to the current object. We use it to access instance variables, call methods or constructors of the same class, and to avoid naming conflicts between local and instance variables.”

---
***Arrays***:

---

# ✅ **Arrays in Java – Interview Notes**

## **1. How to Declare an Array**

* It tells Java the type of array.

```java
int[] arr;
String[] names;
```

---

## **2. How to Instantiate (create memory)**

```java
arr = new int[5];
```

* This creates space for 5 integers.

---

## **3. Rules for Array Instantiation**

* Size must be **non-negative**.
* Size cannot be **float or double** (only int).
* Once created, size cannot be changed (fixed size).

---

## **4. How to Access Array Elements**

```java
arr[0];  // first element
arr[3];  // fourth element
```

* Index starts from **0** to **length-1**.

---

## **5. length Vs length()**

* `arr.length` → property for arrays
* `str.length()` → method for strings

---

## **6. Multidimensional Array**

```java
int[][] matrix = new int[3][3];
```

* It is an array of arrays.
* Example: matrix[1][2]

---

# 🎤 **Interview 2–3 Line Answer**

“Array is a collection of same-type elements stored in continuous memory.
We declare it, then instantiate using `new`.
We access elements using index, and array size is fixed.”

---

# 🧠 **Logical Programs (Short)**

### ✔ Program 1: Sum of array elements

```java
int sum = 0;
for(int i : arr){
    sum += i;
}
```

### ✔ Program 2: Find max element

```java
int max = arr[0];
for(int i : arr){
    if(i > max) max = i;
}
```

### ✔ Program 3: Search element

```java
boolean found = false;
for(int i : arr){
    if(i == key){
        found = true;
        break;
    }
}
```

---

***Strings*** 

---

# ✅ **1. Why Strings are Immutable?**

* String objects cannot be changed once created.
* Because String is stored in **SCP (String Constant Pool)** and shared by many references.
* Immutable design improves **security, memory efficiency, and caching**.

---

# ✅ **2. What is SCP (String Constant Pool)?**

* SCP is a special memory inside Heap where all string literals are stored.
* If a literal already exists, Java reuses it instead of creating a new object.

---

# ✅ **3. Important String Class Methods**

* `length()` → returns string length
* `charAt()` → gets a character
* `substring()` → extracts part of string
* `toUpperCase()` / `toLowerCase()`
* `equals()` / `equalsIgnoreCase()`
* `contains()`
* `trim()`
* `replace()`
* `split()`

---

# ✅ **4. String vs StringBuffer**

| Feature       | String               | StringBuffer               |
| ------------- | -------------------- | -------------------------- |
| Mutability    | Immutable            | Mutable                    |
| Performance   | Slow in modification | Faster                     |
| Thread Safety | Not thread-safe      | Thread-safe (synchronized) |

---

# ✅ **5. StringBuffer vs StringBuilder**

| Feature       | StringBuffer | StringBuilder |
| ------------- | ------------ | ------------- |
| Mutability    | Mutable      | Mutable       |
| Thread Safety | YES          | NO            |
| Speed         | Slower       | Faster        |

---

# ✅ **6. String vs StringBuffer vs StringBuilder**

* String → Immutable → best for fixed data.
* StringBuffer → Mutable + Thread-safe.
* StringBuilder → Mutable + Fast (non-thread-safe).

---

# ⚡ **7. StringBuffer Important Methods**

* `append()`
* `insert()`
* `delete()`
* `deleteCharAt()`
* `reverse()`
* `setCharAt()`

---

# ⚡ **8. StringBuilder Important Methods**

(Same as StringBuffer but faster)

* `append()`
* `insert()`
* `delete()`
* `reverse()`

---

# 🎤 **Interview 2–3 Line Answer**

“String is immutable and stored in SCP for memory efficiency and security.
For modification, we use StringBuffer or StringBuilder.
StringBuffer is thread-safe but slow; StringBuilder is fast but not thread-safe.”

---

# 🧠 **Logical Programs on Strings (Simple)**

### ✔ Reverse a String

```java
String rev = "";
for(int i = str.length()-1; i >= 0; i--){
    rev += str.charAt(i);
}
```

### ✔ Count vowels

```java
int count = 0;
for(char c : str.toLowerCase().toCharArray()){
    if("aeiou".contains(c+"")) count++;
}
```

### ✔ Check palindrome

```java
String rev = new StringBuilder(str).reverse().toString();
boolean isPal = str.equals(rev);
```

### ✔ Frequency of characters

```java
int[] freq = new int[256];
for(char c : str.toCharArray()){
    freq[c]++;
}
```

---

 ***OOP (Object-Oriented Programming)*** 

---

# ✅ **Introduction to OOP**

* OOP stands for Object-Oriented Programming.
* It organizes code around **objects** instead of functions.
* Main aim is to make code reusable, secure, and easy to maintain.

---

# ✅ **Procedure-Oriented vs Object-Oriented**

### **Procedure-Oriented**

* Focus on functions.
* Data is not secure.
* Difficult to maintain large programs.

### **Object-Oriented**

* Focus on objects + data.
* Data is secure through classes.
* Easy to reuse and extend.

---

# ✅ **4 Main Principles of OOP**

### **1. Encapsulation**

* Binding data + methods into a single unit (class).
* Achieved using private variables + public getters/setters.
* Provides data hiding.

### **2. Inheritance**

* One class acquiring properties of another class.
* Promotes reusability.
* Example: `class Dog extends Animal`.

### **3. Polymorphism**

* One thing behaving in many forms.
* Two types:

  * **Compile-time** → Method overloading
  * **Runtime** → Method overriding

### **4. Abstraction**

* Showing only essential details, hiding internal logic.
* Achieved using abstract class or interface.

---

# ✅ **Association Types**

### **1. Composition (Strong Relationship)**

* Part cannot exist without whole.
* Example: House → Rooms
* If house is destroyed, rooms are destroyed.

### **2. Aggregation (Weak Relationship)**

* Part can exist without whole.
* Example: Student → College
* If college closes, student still exists.

---

# 🎤 **Interview 2–3 Line Answer**

“OOP is a way of writing programs using objects.
Its main features are encapsulation, inheritance, polymorphism, and abstraction.
OOP makes code reusable, secure, and easier to manage.”

---

# ✅ **What is Data Hiding?**

* Data hiding means keeping the internal data **private** from outside classes.
* Only methods (getters/setters) can access or modify that data.
* Purpose: security and control.

---

# ✅ **What is Encapsulation?**

* Encapsulation means wrapping **variables + methods** inside a class.
* We make variables **private** and provide **public getters/setters**.
* It protects data and controls how data is accessed.

---

# ✅ **Understanding Getter & Setter**

### **Getter**

* Used to read private variable value.

```java
public int getAge() { return age; }
```

### **Setter**

* Used to modify private variable value.

```java
public void setAge(int age) { this.age = age; }
```

---

# ✅ **Need for Encapsulation**

* To protect data from unauthorized access.
* To control how values are set or validated.
* To make code easy to maintain and extend.

---

# 🎤 **Interview 2–3 Line Answer**

“Encapsulation means binding data and methods inside a class.
We hide data using private variables and expose them through getters and setters.
This gives security, control, and clean code structure.”

---

# ✅ **What is Inheritance?**

* Inheritance allows one class to use properties of another class.
* The class that gives properties → **Parent (Super class)**
* The class that receives → **Child (Sub class)**
* It improves **code reuse**.

---

# ✅ **Rules for Java Inheritance**

* Use `extends` keyword.
* Private members are **not inherited**.
* Constructors are **not inherited**.
* Java does **not** support multiple inheritance using classes.
* But multiple inheritance is possible with **interfaces**.

---

# ✅ **Types of Inheritance in Java**

1. **Single** → One parent, one child
2. **Multilevel** → A → B → C
3. **Hierarchical** → One parent, many children
4. **Multiple (Not supported with classes)**
5. **Hybrid (Not supported with classes)**

---

# ✅ **Understanding `super` Keyword**

* `super` is used to access **parent class** members.
* Used for:
  ✔ calling parent variable
  ✔ calling parent method
  ✔ calling parent constructor → `super()`

---

# ✅ **super vs this**

| Keyword   | Refers To            |
| --------- | -------------------- |
| **this**  | Current class object |
| **super** | Parent class object  |

---

# ✅ **super() vs this()**

| Keyword     | Meaning                                     |
| ----------- | ------------------------------------------- |
| **this()**  | Calls another constructor of **same class** |
| **super()** | Calls constructor of **parent class**       |

### Rules:

* Must be the **first line** in a constructor.
* Cannot use `this()` and `super()` together.

---

# 🎤 **Interview 2–3 Line Answer**

“Inheritance allows a child class to reuse code from a parent class using `extends`.
We use `super` to call parent variables, methods, or constructors.
`this()` calls constructor of same class, while `super()` calls parent constructor.”

---

# ✅ **What is Method Signature?**

* Method signature includes **method name + parameter list**.
* Return type is **not** part of the signature.

---

# ✅ **What is Polymorphism?**

* Polymorphism means **one thing in many forms**.
* In Java, it allows the same method name to behave differently.
* It increases flexibility and reusability.

---

# ✅ **Types of Polymorphism**

### **1. Compile-time Polymorphism (Static)**

* Achieved using **Method Overloading**.
* Decided by compiler.

### **2. Runtime Polymorphism (Dynamic)**

* Achieved using **Method Overriding**.
* Decided at runtime based on object.

---

# ✅ **Method Overloading**

* Same method name, **different parameter list**.
* Return type can be same or different.
* Happens inside the **same class**.

### Example:

```java
void show(int a) {}
void show(int a, String b) {}
```

---

# 🎤 **Interview 2–3 Line Answer**

“Polymorphism means one method behaving in different ways.
We have compile-time polymorphism using overloading and runtime polymorphism using overriding.
Method signature is method name plus parameters.”

---

# ✅ **Method Overriding**

* Overriding means **child class provides its own implementation** of a parent class method.
* Method name, parameters, and return type must be **same** as parent.
* Achieves **runtime polymorphism**.

### Example:

```java
class A { void show(){} }
class B extends A { void show(){} } // overriding
```

---

# ✅ **Rules for Method Overriding**

* Must be in **inheritance** (parent-child).
* Method signatures must match.
* Access modifier in child **cannot be more restrictive**.
* Private, static, and final methods **cannot** be overridden.

---

# ✅ **Overloading vs Overriding**

| Feature         | Overloading                            | Overriding                        |
| --------------- | -------------------------------------- | --------------------------------- |
| Definition      | Same method name, different parameters | Same method name, same parameters |
| Location        | Same class                             | Parent–child classes              |
| Type            | Compile-time polymorphism              | Runtime polymorphism              |
| Return type     | Can change                             | Should be same or covariant       |
| Access Modifier | No restriction                         | Cannot be more restrictive        |

---

# 🎤 **Interview 2–3 Line Comparison Answer**

“Overloading happens in the same class with different parameters and is compile-time.
Overriding happens in inheritance with the same method signature and is runtime polymorphism.”

---

# ✅ **Annotations (Simple Explanation)**

* Annotations give **extra information to compiler or JVM**.
* They do not affect program logic.

### Common Annotations:

* **@Override** → tells compiler that we are overriding a method.
* **@Deprecated** → marks method as outdated.
* **@SuppressWarnings** → hides compiler warnings.
* **@FunctionalInterface** → ensures interface has only one abstract method.

---

# 🎤 **Interview 2–3 Line Answer**

“Annotations give metadata to compiler/JVM. The most common one is `@Override` which checks that a method is actually overriding the parent method. They help reduce errors and improve code clarity.”

---
Here are **short, simple, interview-ready notes** for **Abstraction, Abstract Class, Interface, Functional Interface, Marker Interface** — perfect to speak in an interview.

---

# ✅ **What is Abstraction?**

* Abstraction means **showing only essential features and hiding internal details**.
* Example: We drive a car but don’t know engine code.

---

# ✅ **How can we achieve Abstraction?**

* Using **abstract classes** (partial abstraction).
* Using **interfaces** (full abstraction).

---

# ✅ **What is an Abstract Method?**

* A method with **no body**, only declaration.
* Child class must provide implementation.

```java
abstract void show();
```

---

# ✅ **Abstract Class**

* A class declared with `abstract` keyword.
* It can have both **abstract and non-abstract** methods.
* Cannot be instantiated.

---

# ✅ **Rules for Abstract Class**

* Must use `extends` to inherit.
* Cannot create objects.
* Can have constructors, static methods, and variables.
* Child class must implement all abstract methods.

---

# 🎤 **2–3 Line Interview Answer**

“Abstraction hides internal details and shows only required things.
We achieve abstraction using abstract classes and interfaces.
Abstract class can have abstract and normal methods.”

---

# ---------------------------
# ✅ **What is Interface?**

* Interface is a **100% abstract structure** (before Java 8).
* It contains abstract methods, and child class must implement them.

---

# ✅ **Interface vs Abstract Class**

| Feature     | Abstract Class            | Interface                                                                    |
| ----------- | ------------------------- | ---------------------------------------------------------------------------- |
| Methods     | Abstract + normal methods | Only abstract methods (before Java 8), default/static methods (after Java 8) |
| Variables   | Can have variables        | Only `public static final` constants                                         |
| Inheritance | Single inheritance        | Multiple inheritance                                                         |
| Constructor | Can have                  | Cannot have                                                                  |

---

# 🎤 **Simple Interview Line**

“Abstract class provides partial abstraction while interface gives full abstraction.
Interface supports multiple inheritance but abstract class doesn’t.”

---

# ---------------------------

# ✅ **Rules for Java Interface**

* All variables are **public static final** by default.
* All methods are **public abstract** (except default & static).
* A class implements interface using `implements`.
* One class can implement multiple interfaces.

---

# ---------------------------

# ✅ **How Multiple Inheritance is achieved?**

* Java does not support multiple inheritance using classes.
* But a class can implement **multiple interfaces**, achieving multiple inheritance in a safe way.

```java
class A {}
interface X {}
interface Y {}
class B extends A implements X, Y {}
```

---

# ---------------------------
# ✅ **Functional Interface**

* Interface with **only one abstract method**.
* Used in Lambda Expressions.

Example:

```java
@FunctionalInterface
interface MyInterface {
    void show();
}
```

---

# ------------------------

# ✅ **Marker Interface**

* Interface with **no methods**.
* Used for providing metadata or special behavior.

Examples:

* `Serializable`
* `Cloneable`
* `RandomAccess`

---

# 🎤 **2–3 Line Interview Answer**

“Interface is used to achieve full abstraction and multiple inheritance.
Functional interface has one abstract method and is used with lambdas.
Marker interface has no methods and just marks a class for special behavior.”

---

# ✅ **What is an Exception?**

* Exception is an **unexpected event** that breaks normal program flow.
* Example: divide by zero, file not found, null pointer.

---

# ✅ **Exception vs Error**

| Exception                     | Error                        |
| ----------------------------- | ---------------------------- |
| Recoverable                   | Not recoverable              |
| Happens due to program issues | Happens due to system issues |
| Can be handled                | Cannot be handled            |

Examples:
Exception → `NullPointerException`
Error → `OutOfMemoryError`

---

# ✅ **Types of Errors**

1. **Compile-time errors** → syntax mistakes
2. **Runtime errors** → occur while running
3. **Logical errors** → wrong output

---

# ✅ **Types of Exceptions**

1. **Checked Exception**

   * Compiler checks
   * Must handle
   * Example: IOException, SQLException

2. **Unchecked Exception**

   * Runtime exceptions
   * Not checked by compiler
   * Example: ArithmeticException, NullPointerException

---

# ✅ **Hierarchy of Exception Classes**

```
Object
 └── Throwable
      ├── Error
      └── Exception
           ├── RuntimeException
           └── Other Exceptions
```

---

# ✅ **Keywords used in Exception Handling**

* **try** → risky code
* **catch** → handles exception
* **finally** → always executes
* **throw** → manually throw exception
* **throws** → declare exception in method signature

---

# ✅ **Exception Handling Rules**

* Only one exception is thrown at a time.
* More specific catch block must come **before** general catch.
* Finally block always runs (even if exception occurs).

---

# ✅ **Methods to Display Exception Information**

Given an exception `e`:

* `e.getMessage()` → shows message
* `e.toString()` → class + message
* `e.printStackTrace()` → full details (best for debugging)

---

# ✅ **Finally Block**

* Used to close resources (file, DB connection).
* Always executes except in JVM crash.

---

# ✅ **Java 7 – Try With Resources**

* Automatically closes resources.

```java
try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))) {
    // code
}
```

---

# ✅ **throw vs throws**

### **throw**

* Used to **manually throw** exception.

```java
throw new ArithmeticException("Invalid");
```

### **throws**

* Used in method signature to **declare** exception.

```java
void read() throws IOException {}
```

---

# ✅ **Creating a User-Defined Exception**

```java
class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}
```

---

# 🎤 **2–3 Line Interview Answer**

“Exception is an event that breaks normal flow. We handle it using try-catch-finally.
Checked exceptions must be handled; unchecked happen at runtime.
We can also create our own exceptions by extending Exception class.”

---
***final keyword + Garbage Collection in Java***

---

# ⭐ Understanding `final` Keyword & Garbage Collection in Java

---

# 🔵 **1. Uses of `final` Keyword**

The `final` keyword in Java is a **modifier** used with **variables, methods, and classes**.

### ✔ **1) final Variable – Value Cannot Change**

* Once assigned, you **cannot modify** the value.

```java
final int x = 10;
// x = 20;  // ❌ Compilation error
```

* For object references:

```java
final StringBuilder sb = new StringBuilder("Hi");
sb.append(" Hello");   // ✔ allowed (object can change)
sb = new StringBuilder("New");  // ❌ not allowed
```

---

### ✔ **2) final Method – Cannot be Overridden**

```java
class A {
    final void show() {}
}

class B extends A {
    void show() {}   // ❌ cannot override
}
```

---

### ✔ **3) final Class – Cannot be Inherited**

```java
final class Test {}
class A extends Test {} // ❌ error
```

Examples: `String`, `Math`, `Wrapper Classes`.

---

# 🔵 **2. How Automatic Garbage Collection Works**

Java has **automatic memory management** using the **Garbage Collector (GC)**.

### ✔ GC removes objects that are:

* No longer reachable
* No valid reference exists

The process:

1. JVM identifies unreachable objects
2. GC frees heap memory
3. Memory becomes available for new objects

GC works on **Heap memory**, NOT on:

* Stack
* Method Area
* Metaspace

---

# 🔵 **3. When an Object is Eligible for Garbage Collection**

### ✔ 1) Reference is Reassigned

```java
String s = new String("Java");
s = new String("Python");   // "Java" becomes eligible
```

### ✔ 2) Reference Goes Out of Scope

```java
void test() {
    Person p = new Person(); // ✔ eligible after method ends
}
```

### ✔ 3) Nullifying the Reference

```java
Employee e = new Employee();
e = null;   // object becomes eligible
```

### ✔ 4) Objects Without Any Reference (Anonymous)

```java
new Student();   // ✔ directly eligible
```

---

# 🔵 **4. finalize() Method**

* Present in `java.lang.Object`.
* Called **before GC destroys the object**.
* Rarely used → deprecated since Java 9.

```java
@Override
protected void finalize() throws Throwable {
    System.out.println("Object destroyed");
}
```

⚠ **Note:** finalize() is **not guaranteed** to execute.

---

# 🔵 **5. System.gc() & Runtime.getRuntime().gc()**

### ✔ System.gc()

* Suggests JVM to run garbage collector.

```java
System.gc();
```

### ✔ Runtime.getRuntime().gc()

```java
Runtime.getRuntime().gc();
```

⚠ These methods only **request** GC; JVM may ignore it.

---

# 🔵 **6. Usage of equals() and hashCode()**

Both present in `java.lang.Object`.

### ✔ equals()

* Used to compare **content** of two objects.
* Default implementation → compares memory addresses.

### ✔ hashCode()

* Returns an integer hash value of object.
* Used in hashing-based collections:

  * HashMap
  * HashSet
  * Hashtable

### ⚠ RULE:

If you override `equals()`, always override `hashCode()`.

---

# ⭐ QUICK INTERVIEW REVISION

### **final keyword:**

| final applies to | Meaning                  |
| ---------------- | ------------------------ |
| variable         | constant (cannot change) |
| method           | cannot override          |
| class            | cannot extend            |

### **GC Concepts:**

| Topic       | Summary                  |
| ----------- | ------------------------ |
| GC          | automatic memory cleanup |
| finalize()  | deprecated, not reliable |
| System.gc() | request GC               |
| Eligibility | unreachable objects      |

---

***Java I/O Streams including Byte Streams, Character Streams, Buffered Streams, Data Streams, and Object Streams***.

---

# ⭐ **Java I/O Streams (Input/Output Streams)**

Java I/O (Input/Output) is used to **read data from a source** or **write data to a destination**, such as:

* File
* Keyboard
* Network
* Memory

Java I/O is mainly provided by the package:
📦 **`java.io`**

---

# 🔵 **1. What is a Stream?**

A **stream** is a continuous flow of data.

### Two types:

1. **Input Stream** → reads data
2. **Output Stream** → writes data

---

# 🔵 **2. Byte Streams (8-bit streams)**

Used to read/write **binary data** such as:

* images
* audio
* video
* PDF
* executable files

### Parent classes:

* **InputStream**
* **OutputStream**

### Common Classes:

* FileInputStream
* FileOutputStream
* BufferedInputStream
* BufferedOutputStream

### Example:

```java
FileInputStream fis = new FileInputStream("data.bin");
int b = fis.read();
fis.close();
```

---

# 🔵 **3. Character Streams (16-bit Unicode)**

Used to read/write **text files** (characters).

### Parent classes:

* **Reader**
* **Writer**

### Common Classes:

* FileReader
* FileWriter
* BufferedReader
* BufferedWriter

### Example:

```java
FileReader fr = new FileReader("text.txt");
int ch = fr.read();
fr.close();
```

---

# 🔵 **Byte Streams vs Character Streams**

| Feature       | Byte Stream              | Character Stream |
| ------------- | ------------------------ | ---------------- |
| Base class    | InputStream/OutputStream | Reader/Writer    |
| Data handled  | Binary data              | Characters/Text  |
| Size          | 1 byte                   | 2 bytes          |
| Example class | FileInputStream          | FileReader       |

---

# 🔵 **4. Buffered Streams (Fast I/O)**

Used to increase performance by using an internal buffer.

### Byte version:

* BufferedInputStream
* BufferedOutputStream

### Character version:

* BufferedReader
* BufferedWriter

### Example:

```java
BufferedReader br = new BufferedReader(new FileReader("file.txt"));
String line = br.readLine();
br.close();
```

✔ Reads line by line → faster
✔ Useful for large files

---

# 🔵 **5. Data Streams**

Used to read/write **primitive data types** in a portable way.

### Classes:

* **DataInputStream**
* **DataOutputStream**

### Supports:

`int, float, boolean, long, double, char, UTF strings`

### Example:

```java
DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
dos.writeInt(10);
dos.writeDouble(9.5);
dos.close();
```

```java
DataInputStream dis = new DataInputStream(new FileInputStream("data.dat"));
int x = dis.readInt();
double y = dis.readDouble();
dis.close();
```

---

# 🔵 **6. Object Streams (Serialization/Deserialization)**

Used to write and read **objects**.

### Classes:

* **ObjectOutputStream** → writeObject()
* **ObjectInputStream** → readObject()

### Requirements:

* Class must implement **Serializable** interface

### Example:

```java
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
oos.writeObject(new Student("Ram", 20));
oos.close();
```

```java
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
Student s = (Student) ois.readObject();
ois.close();
```

✔ Used in:

* File storage
* Caching
* Sending objects over network (RMI, sockets)

---

# ⭐ **Summary Table**

| Stream Type      | Parent Class                           | Use Case                    |
| ---------------- | -------------------------------------- | --------------------------- |
| Byte Stream      | InputStream / OutputStream             | Images, videos, binary data |
| Character Stream | Reader / Writer                        | Text files, characters      |
| Buffered Stream  | BufferedInputStream / BufferedReader   | Faster I/O with buffer      |
| Data Stream      | DataInputStream / DataOutputStream     | Read/write primitives       |
| Object Stream    | ObjectInputStream / ObjectOutputStream | Serialization               |

---
Here is the **short, simple, interview-ready** explanation of the **Collection Framework** — exactly in the format you asked:
**2–3 lines, simple English, only the important points.**

---

# ⭐ ***Collection Framework***

---

## 🔵 **Limitations of Array**

* Arrays have **fixed size**, you cannot increase or decrease it.
* Stores **only same data type**.
* No built-in methods like sort, search, add, delete.

---

## 🔵 **Introduction to Collections**

* Collections is a **framework** to store and process a group of objects.
* It provides **dynamic size**, **ready-made methods**, and **standard data structures**.

---

## 🔵 **Collection Interface**

* Root interface of the Collection framework (except Map).
* Common methods: **add(), remove(), size(), contains(), iterator()**.

---

## 🔵 **Set – List – Queue – Map (Overview)**

* **List** → ordered, allows duplicates.
* **Set** → unordered, no duplicates.
* **Queue** → follows FIFO for processing.
* **Map** → stores key–value pairs.

---

## 🔵 **Retrieving Elements**

* Using loops, **Iterator**, **ListIterator**, **for-each**, **Spliterator**, **Enumeration**.

---

# ⭐ **LIST Interface**

---

## 🔵 **ArrayList**

* Dynamic array; allows duplicates; ordered.
* Good for **searching**, slow for **inserting middle**.
* Generics example: `ArrayList<String> list = new ArrayList<>();`

---

## 🔵 **Vector**

* Same as ArrayList but **thread-safe** (synchronized).
* Slower because of synchronization.
* Generics example: `Vector<Integer> v = new Vector<>();`

---

## 🔵 **Stack**

* LIFO (Last In First Out).
* Methods: **push(), pop(), peek()**.
* Implementation: `Stack<String> s = new Stack<>();`

---

## 🔵 **LinkedList**

* Doubly linked list; good for **insertion/deletion**.
* Slower for searching.
* Can be used as **List + Queue**.

---

# ⭐ **SET Interface**

---

## 🔵 **HashSet**

* No duplicates, no order.
* Uses **hashing** internally; very fast.

## 🔵 **LinkedHashSet**

* No duplicates, **insertion order** is preserved.
* Slower than HashSet.

## 🔵 **TreeSet**

* No duplicates, **sorted order**.
* Uses **TreeMap (Red-Black Tree)** internally.

## 🔵 **EnumSet**

* Used for storing **enum values only**.
* Very fast and memory-efficient.

---

# ⭐ **QUEUE Interface**

---

## 🔵 **ArrayDeque**

* Better than Stack & LinkedList as Queue.
* No capacity limit; supports both **FIFO & LIFO**.

## 🔵 **PriorityQueue**

* Elements arranged in **natural order** (min-heap).
* Used when we want **priority-based retrieval**.

---

# ⭐ **MAP Interface**

---

## 🔵 **HashMap**

* Stores key-value pairs; **fastest**; no order.
* Allows one null key and multiple null values.

## 🔵 **LinkedHashMap**

* Maintains **insertion order**.
* Slightly slower than HashMap.

## 🔵 **Hashtable**

* Thread-safe (synchronized).
* No null key or value.

## 🔵 **TreeMap**

* Stores data in **sorted order** of keys.
* Based on Red-Black tree.

## 🔵 **WeakHashMap**

* Key is removed automatically when not referenced.
* Good for caching.

## 🔵 **IdentityHashMap**

* Uses **==** instead of **equals()** for key comparison.
* Used when reference equality is required.

## 🔵 **Properties Class**

* Stores configuration data as **key=value (String only)**.
* Used for reading `.properties` files.

---

# ⭐ **Comparable & Comparator**

---

## 🔵 **Comparable**

* Used for **natural sorting**.
* Implement `compareTo()` method.

```java
public int compareTo(Student s)
```

## 🔵 **Comparator**

* Used for **custom sorting**.
* Implement `compare()` method.

```java
public int compare(Student s1, Student s2)
```

---

# ⭐ **Iterators**

---

## 🔵 **Iterator**

* Used to traverse forward only.
* Methods: **hasNext(), next(), remove()**.

## 🔵 **ListIterator**

* Works only with List.
* Supports **forward + backward** traversal.

## 🔵 **Spliterator**

* Used for **parallel processing**.
* Methods: trySplit(), tryAdvance().

## 🔵 **Enumeration**

* Legacy iterator used in Vector.
* Methods: **hasMoreElements(), nextElement()**.

---
# ⭐ **Java Utility Classes**

---

## 🔵 **StringTokenizer**

* Used to **split a string** into tokens based on a delimiter.
* Faster and older alternative to `String.split()`.
* Methods: `nextToken()`, `hasMoreTokens()`.

---

## 🔵 **Date (java.util.Date)**

* Represents **date and time** in milliseconds.
* Mostly **deprecated** and replaced by `LocalDate`, `LocalTime`, `LocalDateTime` in Java 8+.

---

## 🔵 **Calendar**

* Used to manipulate **date and time** like add, subtract days, months.
* More flexible than `Date`, but still older API.

---

## 🔵 **Formatting Date and Time (SimpleDateFormat)**

* Used to **format and parse** dates.
* Example formats: `"dd/MM/yyyy"`, `"HH:mm:ss"`.

```java
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
```

---

## 🔵 **Locale**

* Represents **region or language settings** (India, US, France).
* Used for **regional formatting** like currency, date, messages.

---

## 🔵 **Formatter**

* Used to format output similar to C’s `printf`.
* Supports placeholders like `%d`, `%s`, `%f`.

```java
System.out.printf("Age: %d", age);
```

---

## 🔵 **Random Class**

* Used to generate **random numbers**.
* Methods: `nextInt()`, `nextDouble()`, `nextBoolean()`.

---

## 🔵 **Arrays Class**

* Utility class for **array operations**.
* Methods: `sort()`, `binarySearch()`, `copyOf()`, `equals()`, `toString()`.

---

## 🔵 **Collections Class**

* Utility class for **collection operations**.
* Methods: `sort()`, `reverse()`, `shuffle()`, `min()`, `max()`, `synchronizedList()`.

---

# ⭐ **Java 8 Features — Interview Notes**

---

## 🔵 **Lambda Expressions**

* Lambda is a **short way to write anonymous methods**.
* Helps in writing clean code for functional programming.
* Syntax: `(a, b) -> a + b`.

---

## 🔵 **Functional Interfaces**

* Interface with **only one abstract method**.
* Examples: `Runnable`, `Callable`, `Comparator`, `Supplier`, `Function`.
* Annotated with **@FunctionalInterface**.

---

## 🔵 **Default Methods (in Interface)**

* Methods inside interface with **default implementation**.
* Used to add new features without breaking old code.

```java
default void show() { }
```

---

## 🔵 **Static Methods (in Interface)**

* Static helper methods inside interface.
* Called using `InterfaceName.method()`.

---

## 🔵 **Private Methods (in Interface – Java 9+)**

* Used inside interface to **re-use code** between default methods.
* Cannot be accessed outside the interface.

---

## 🔵 **Method References**

* Shortcut to refer existing methods.
* Types: **Static**, **Instance**, **Constructor**.
* Example: `System.out::println`.

---

# ⭐ **Stream API**

* Used to process collections **in a functional way**.
* Supports operations like **filter, map, sort, reduce**.
* Makes code short and readable.

---

## 🔵 **Collectors Class**

* Used to collect Stream output into **List, Set, Map**.
* Example: `Collectors.toList()`, `Collectors.groupingBy()`.

---

## 🔵 **forEach() Method**

* Used to loop elements in Lambda style.
* Example: `list.forEach(x -> System.out.println(x));`

---

## 🔵 **Optional Class**

* Used to avoid **NullPointerException**.
* Represents a value that may or may not be present.
* Methods: `of()`, `empty()`, `isPresent()`, `orElse()`.

---

## 🔵 **Parallel Array Sorting**

* Arrays class supports **parallelSort()** which uses multithreading.
* Faster for large arrays.

---

## 🔵 **New Date & Time API (java.time)**

* Java 8 introduced new immutable classes:

  * `LocalDate`
  * `LocalTime`
  * `LocalDateTime`
  * `ZonedDateTime`
* Thread-safe and easier than old Date/Calendar.

---

# ⭐ **Inner Classes**

---

## 🔵 **What are Inner Classes?**

* A class declared **inside another class** is called an inner class.
* Used to group classes that are **logically related** and to access outer class members easily.

---

# ⭐ **Types of Inner Classes**

---

## 🔵 **1. Nested (Non-Static) Inner Class**

* Normal inner class declared inside another class **without static keyword**.
* Can access all **instance members** of outer class.

```java
class Outer { class Inner { } }
```

---

## 🔵 **2. Static Inner Class**

* Defined using **static keyword**.
* Can access **only static members** of outer class.
* Object is created using: `Outer.Inner obj = new Outer.Inner();`

---

## 🔵 **3. Method Local Inner Class**

* Class declared **inside a method**.
* Can access **final or effectively final** local variables.
* Mostly used in **event handling and encapsulation**.

---

## 🔵 **4. Anonymous Inner Class**

* Class **without a name**, used to override methods quickly.
* Mostly used with **interfaces, abstract classes, or listeners**.

```java
Runnable r = new Runnable() {
    public void run() { }
};
```

---

