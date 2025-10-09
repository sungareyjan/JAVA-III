# JAVA-III TESDA Training Batch 2 2025

# Day 2 – Java Basics

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

# Day 3 – Java
# 🧠 Java Variables & Naming Conventions

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
