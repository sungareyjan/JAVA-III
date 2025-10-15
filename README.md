# JAVA-III TESDA Training Batch 2 2025

# Day 2 – Java Basics Introduction to Java Programming

    ## 📘 Lesson Summary

    **Topic:** Introduction to Java Programming
    **Objective:** Learn how to write, compile, and run your first Java program.

    ---

    ## 🧠 Key Concepts

    ### 1. Java Program Structure
    A basic Java program contains:
    - **Class Declaration** – Defines the structure of the program.
    - **`main()` Method** – The entry point of any Java application.
    - **Statements** – Instructions that perform actions (e.g., `System.out.println()`).

        ```java
        public class ClassName {
            public static void main(String[] args) {
                // Code to execute
            }
        }
    ## 🧠 Java Quick Notes

    ### 🏗️ Origin
        Father of Java: James Gosling (1995)
        Type: High-level, class-based, object-oriented
        Motto: Write Once, Run Anywhere (WORA)

    ### ⚙️ Java Editions
        Java SE (Standard Edition) – Core Java (desktop & general apps)
        Java EE (Enterprise Edition) – Web & enterprise apps
        Java ME (Micro Edition) – Mobile & embedded devices
        Java FX – Rich Internet Applications (GUI, multimedia)

    ### 🏢 Companies Using Java
        Google • Pinterest • Instagram • Spotify • Netflix • Amazon
        Slack • eBay • Snapchat • Telegram

    ### 🧩 JDK, JRE, JVM
        Component
        Full Name
        Purpose
        JDK
        Java Development Kit
        Used for development (includes compiler)
        JRE
        Java Runtime Environment
        Used to run Java apps
        JVM
        Java Virtual Machine
        Executes Java bytecode

    ### 💾 File Info
        Extension: .java
        Compiled Output: .class (bytecode)

    ### 🧰 Commands
        java --version        # Check Java version
        javac filename.java   # Compile source file
        java filename         # Run compiled class


    ### 🧱 Concepts
        Goal to create a code Readable, Testable, Scalable code

        Bytecode: Platform-independent code executed by JVM
        Recompile & Redeploy: For applying code changes

    ### 🧮 Versions
        Stable Industry Version: Java 17
        LTS: Long Term Support (stable, maintained for years)

# Day 3 –  Java Variables & Naming Conventions

    ## ⚙️ Variable Memory Types

    | Type | Description | Example |
    |------|--------------|----------|
    | **Volatile** | Temporary data stored in **RAM** (lost when power off) | e.g., Local variables |
    | **Non-Volatile** | Data retained even after shutdown | e.g., Hard drive, SSD, Database |

    ---

    ## 💾 Types of Variables

    | Type | Scope | Storage | Lifetime |
    |------|--------|----------|-----------|
    | **Local Variable** | Inside methods or blocks | Stack memory | Until method ends |
    | **Instance Variable** | Declared inside a class but outside methods | Heap memory | Exists while object lives |
    | **Static Variable** | Declared with `static` keyword | Class area (shared by all objects) | Until program ends |

    ---

    ## 🧩 Variable Basics

    - A **variable** is a **container** or **label** that stores a value in memory.  
    - Java is a **strongly typed** language → must declare **data type** before using variable.

    ### ✅ Syntax
    ```java
    dataType variableName = value;

# Day 4 –  Java Programming Language Type System

    | **Group** | **Description** | **Examples** |
    |------------|-----------------|---------------|
    | **Weakly Typed** | Allows implicit type conversion | JavaScript, PHP |
    | **Strongly Typed** | Enforces strict type matching | Java, Python, C# |

    ---

    ## 🔢 Java Data Types

    ### 🧱 1. Primitive Data Types
    Primitive types directly store values in memory.

    | **Category** | **Type** | **Example / Notes** | **Default Value** |
    |---------------|-----------|----------------------|------------------|
    | **Character** | `char` | `char letter = 'a';` | `\u0000` |
    | **Integer Types** | `byte`, `short`, `int`, `long` | `int age = 20;` → `int` is the default integer type | `0` |
    | **Floating Point Types** | `float`, `double` | `float tax = 12.5F;` → `double` is the default floating type | `0.0` |
    | **Boolean** | `boolean` | `boolean isActive = true;` | `false` |

    📎 **Suffixes:**
    - `L` → for `long` → `long population = 10000000000L;`
    - `F` → for `float` → `float rate = 9.99F;`

    ---

    ### 🧭 2. Reference Data Types
    Reference types store **memory addresses** pointing to objects.

    | **Type** | **Example** | **Default Value** |
    |-----------|-------------|------------------|
    | **String** | `String name = "RJ";` | `null` |
    | **Array** | `int[] numbers = {1, 2, 3};` | `null` |
    | **Class / Object** | `Student s = new Student();` | `null` |

    ---

    ## 💡 Wrapper Classes

    Each primitive type has a corresponding **Wrapper Class** (used in collections, generics, etc.):

    | **Primitive Type** | **Wrapper Class** |
    |---------------------|------------------|
    | `byte` | `Byte` |
    | `short` | `Short` |
    | `int` | `Integer` |
    | `long` | `Long` |
    | `float` | `Float` |
    | `double` | `Double` |
    | `char` | `Character` |
    | `boolean` | `Boolean` |

    ### 📏 Common Constants
    - `Integer.MIN_VALUE`
    - `Integer.MAX_VALUE`

    ---

    ## ⚙️ Memory and Defaults

    - **Default value of `String`** → `null`
    - **Primitive types** → stored in **stack memory**
    - **Reference types** → stored in **heap memory**
    - **Hash key** → unique identifier for objects in memory

    ---

    ## 🐪 Shortcuts and Tips

    - **Camel hump**: IDE shortcut for autocompletion (e.g., typing `cTA` can suggest `calculateTotalAmount`)
    - **Positive ↔ Negative range**: depends on bit size  
    Example: `byte` → `-128` to `127`

    ---

    ## 🧾 Real-World Examples

    | **Concept** | **Example** | **Description** |
    |--------------|--------------|----------------|
    | **Age** | `int age = 25;` | Used for whole numbers (e.g., age of a planet) |
    | **Tax** | `double totalTax = 15000.75;` | Used for large values with decimals |
    | **Price** | `float price = 99.99F;` | Used for smaller decimal values like currency |

    ---

    ## 🧠 Summary

    - **Primitive types** → store actual values
    - **Reference types** → store memory addresses
    - **Wrapper classes** → allow primitives to be used as objects
    - **Naming conventions** help improve readability and maintain consistency
    - **Default data types:** `int` for integers, `double` for decimals

    ---

# Day 5 – Java Type Casting in Java

    **Type casting** means converting a value from one data type to another.

    ---

    ## 🔹 Types of Casting

    ### 1. Widening (Implicit)
    - Converts **smaller → larger** data type  
    - Happens **automatically**  
    - **No data loss**

    ```java
    byte a = 10;
    int b = a; // widening
    2. Narrowing (Explicit)
    Converts larger → smaller data type

    Must use (type)

    ⚠️ Possible data loss

    java
    Copy code
    double price = 99.9;
    int newPrice = (int) price; // 99 (.9 lost)
    🔹 Wrapper Classes
    Used to convert between String and primitive types.

    java
    Copy code
    String gradeText = "99";
    byte grade = Byte.parseByte(gradeText); // String → byte

    String result = String.valueOf(grade);  // byte → String
    Simple vs Complex
    Simple value: use parseType()

    Complex value: use Wrapper Class (Byte, Integer, Double, etc.)

    🔹 String Conversion Trick
    java
    Copy code
    String result = 1 + 1 + "";
    System.out.println(result); // Output: "2"
    java
    Copy code
    String result = "" + 1 + 1;
    System.out.println(result); // Output: "11"
    🧠 Reason:
    Java reads left to right.

    When it starts with numbers → adds numerically first

    When it starts with a string → concatenates as text

    📝 Summary
    Type	Direction	Example	Data Loss
    Widening	small → large	byte → int	❌
    Narrowing	large → small	double → int	✅


# Day 6 – Java Operators & Precedence
    📘 PEMDAS Rule
    P – Parentheses
    E – Exponents
    M – Multiplication
    D – Division
    A – Addition
    S – Subtraction
    Same level MD AS

    👉 Evaluate top to bottom, left to right.

    ⚙️ Types of Operators
    🔹 Arithmetic

    + - * / %

    🔹 Assignment

    =

    🔹 Augmented Assignment

    += -= *= /= %=

    🔹 Relational

    == != > < >= <=

    🔹 Logical

    && || !

    🔹 Unary

    ++ --

    🔹 Bitwise (rarely used)

    & | ^ ~ << >> >>>

    🧠 Var Keyword

    var (Java 10+) — automatically detects the variable type.

    var num = 10;      // int
    var text = "Hello"; // String

    ⚖️ Operator Precedence (Highest → Lowest)
    Level	Operators	Description
    1	() [] .	Parentheses, access
    2	++ --	Postfix
    3	++ -- ! ~	Prefix, logical NOT
    4	(type)	Type cast
    5	* / %	Multiply, divide, mod
    6	+ -	Add, subtract
    7	<< >> >>>	Bit shift
    8	< <= > >= instanceof	Relational
    9	== !=	Equality
    10	&	Bitwise AND
    11	^	Bitwise XOR
    12	`	`
    13	&&	Logical AND
    14	`
    15	?:	Ternary
    16	= += -= ...	Assignment
    🔸 Prefix vs Postfix
    Type	Example	When It Happens
    Prefix	++x --x	Increments/Decrements before use
    Postfix	x++ x--	Increments/Decrements after use
    Example:
    int x = 5;
    int a = ++x; // x=6, a=6
    int b = x++; // b=6, x=7

    💻 Example
    int result = 10 + 5 * 2;   // 20 (* before +)
    int result2 = (10 + 5) * 2; // 30 (parentheses first)

    boolean check = 5 > 3 && 2 < 4; // true
# Day 7 – Java Control Statements in Java
    📘 Overview

    Control statements allow your program to make decisions, repeat actions, and control execution flow.
    They help you decide what to do based on certain conditions.

    ⚙️ Decision-Making Statements
    🔹 if-else Statement

    Used to execute code blocks based on a condition (true or false).

    if (condition) {
        // code to execute if condition is true
    } else {
        // code to execute if condition is false
    }

    🧩 Example: Student Grade Evaluation
    int grade = 85;

    if (grade >= 95) {
        System.out.println("Excellent");
    } else if (grade >= 90) {
        System.out.println("Very Good");
    } else if (grade >= 80) {
        System.out.println("Good");
    } else if (grade >= 75) {
        System.out.println("Fair");
    } else {
        System.out.println("Failed");
    }

    🧮 Output:
    Good

    🔀 switch Statement

    Used when you need to compare one value against multiple constant options.

    int grade = 3;
    String remark;

    switch (grade) {
        case 5:
            remark = "Excellent";
            break;
        case 4:
            remark = "Very Good";
            break;
        case 3:
            remark = "Good";
            break;
        case 2:
            remark = "Fair";
            break;
        default:
            remark = "Failed";
            break;
    }

    System.out.println("Remarks: " + remark);

    🧮 Output:
    Remarks: Good

    ⚠️ Disadvantages of switch-case

    Limited to specific data types

    Works only with certain types (e.g., int, char, String, enum).

    Cannot handle complex expressions or conditions.

    No range checking

    You can’t use conditions like grade >= 90 && grade <= 94.

    Only exact matches (e.g., case 90:) are allowed.

    Requires break statements

    Forgetting break can cause fall-through errors (it executes the next case unintentionally).

    Less flexible than if-else

    Harder to handle multiple conditions or logical operators (&&, ||, etc.).

    🧱 Work Space / Package

    In Java, you organize your code inside packages — like folders for your classes.

    package com.example.controlstatement;

    public class GradeChecker {
        public static void main(String[] args) {
            // your code here
        }
    }

    🌟 Wildcard *

    The wildcard * is used to import all classes from a package.

    import java.util.*;


    This means you can use all classes inside java.util (like Scanner, ArrayList, etc.)

    ⚙️ Compilation and Execution
    💡 Steps:

    Write code → GradeChecker.java

    Compile →

    javac GradeChecker.java


    Run →

    java GradeChecker

    ✅ Example Output
    Enter grade: 92
    Very Good

# Day - 8 JavaScript Loops and Jump Statements

    ## 🔁 Types of Loops

    ### **1. For Loop**
    Used when the **number of iterations is known**.

    **Syntax:**
    ```js
    for (initialization; condition; increment/decrement) {
    // code block or statement
    }
    Example:

    js
    Copy code
    for (let i = 1; i <= 5; i++) {
    console.log(i);
    }
    2. While Loop
    Used when the number of iterations is not fixed (depends on a condition).

    Syntax:

    js
    Copy code
    while (condition) {
    // code block or statement
    }
    Example:

    js
    Copy code
    let i = 1;
    while (i <= 5) {
    console.log(i);
    i++;
    }
    🏭 Commonly used in industry applications when waiting for input, user events, or data where the end is uncertain.

    3. Do-While Loop
    Executes the code block at least once, then repeats while the condition is true.

    Syntax:

    js
    Copy code
    do {
    // code block or statement
    } while (condition);
    Example:

    js
    Copy code
    let i = 1;
    do {
    console.log(i);
    i++;
    } while (i <= 5);
    🧠 DRY Principle
    DRY means Don’t Repeat Yourself

    Write reusable and modular code instead of duplicating logic.
    Makes your code cleaner, easier to maintain, and less error-prone.

    Example:

    js
    Copy code
    // ❌ Don't do this
    console.log("Hello");
    console.log("Hello");
    console.log("Hello");

    // ✅ Do this
    function greet() {
    console.log("Hello");
    }
    for (let i = 0; i < 3; i++) {
    greet();
    }
    ⚙️ Loop Structure Overview
    Every loop has:

    Initialization – start value (e.g., let i = 0)

    Condition – when to continue (e.g., i < 5)

    Increment/Decrement – step (e.g., i++)

    Example:

    js
    Copy code
    for (let i = 0; i < 5; i++) {
    console.log(i);
    }
    🔄 Infinite Loop
    A loop that never ends because the condition always stays true.

    Example:

    js
    Copy code
    while (true) {
    console.log("Running forever...");
    }
    ⚠️ Be careful — infinite loops can crash your browser or program.

    🪜 Jump Statements
    1. break
    Ends the loop immediately.

    Moves control outside the loop.

    Example:

    js
    Copy code
    for (let i = 0; i < 10; i++) {
    if (i === 5) break;
    console.log(i);
    }
    2. continue
    Skips the current iteration and continues to the next one.

    Example:

    js
    Copy code
    for (let i = 0; i < 5; i++) {
    if (i === 2) continue;
    console.log(i);
    }
    Output:
    0, 1, 3, 4 (skipped 2)

    📘 Summary
    Concept	Description
    For Loop	Fixed number of iterations
    While Loop	Unknown number of iterations
    Do-While Loop	Executes at least once
    DRY Principle	Avoid repeating code
    Break	Stops loop completely
    Continue	Skips one iteration
    Infinite Loop	Never stops running

    🧩 Pro Tip:
    Always ensure your loop has a clear exit condition to prevent infinite loops.
### 🤝 Team Reminder

10 days before deadline — if not done, everyone helps to finish it.
### 🏷️ Author
**RJcodes**

---
