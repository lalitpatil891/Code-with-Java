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
