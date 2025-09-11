# Java Fundamentals for Automation Testing

## Table of Contents
1. [JDK, JRE, JVM Overview](#jdk-jre-jvm-overview)
2. [Project Structure](#project-structure)
3. [HelloWorld Example](#helloworld-example)
4. [How These Concepts Apply to Automation](#how-these-concepts-apply-to-automation)
5. [Practical Examples](#practical-examples)

## JDK, JRE, JVM Overview

### JVM (Java Virtual Machine)
- **What it is**: A virtual machine that executes Java bytecode
- **Purpose**: Provides platform independence - "Write Once, Run Anywhere"
- **Role in Automation**: 
  - Executes your Selenium and Rest Assured test code
  - Manages memory for WebDriver instances and HTTP connections
  - Handles garbage collection for test data cleanup

### JRE (Java Runtime Environment)
- **What it is**: JVM + Java Class Libraries + Other supporting files
- **Contains**: 
  - JVM implementation
  - Java API libraries (java.lang, java.util, etc.)
  - Runtime libraries needed to run Java applications
- **Role in Automation**:
  - Provides core libraries that Selenium and Rest Assured depend on
  - Includes networking libraries for HTTP requests
  - Contains collections framework for handling test data

### JDK (Java Development Kit)
- **What it is**: JRE + Development Tools
- **Contains**:
  - JRE (everything needed to run Java)
  - Compiler (javac)
  - Debugger (jdb)
  - Documentation generator (javadoc)
  - Other development tools
- **Role in Automation**:
  - Compiles your test code into bytecode
  - Provides tools for debugging test failures
  - Enables integration with IDEs and build tools like Maven

### Relationship Diagram
```
┌─────────────────────────────────────┐
│              JDK                    │
│  ┌─────────────────────────────────┐│
│  │              JRE                ││
│  │  ┌─────────────────────────────┐││
│  │  │            JVM              │││
│  │  │  - Executes bytecode        │││
│  │  │  - Memory management        │││
│  │  │  - Garbage collection       │││
│  │  └─────────────────────────────┘││
│  │  - Java Class Libraries        ││
│  │  - Runtime support files       ││
│  └─────────────────────────────────┘│
│  - Compiler (javac)                │
│  - Debugger (jdb)                  │
│  - Documentation tools             │
└─────────────────────────────────────┘
```

## Project Structure

### Maven Standard Directory Layout
```
automation-training/
├── pom.xml                          # Project configuration
├── src/
│   ├── main/
│   │   └── java/                    # Main source code
│   │       └── com/aw/automationtraining/
│   │           └── HelloWorld.java
│   └── test/
│       └── java/                    # Test source code
│           └── com/aw/automationtraining/
│               ├── selenium/
│               │   └── ExampleOrgTest.java
│               └── restassured/
│                   └── ReqResApiTest.java
├── target/                          # Compiled classes (generated)
│   ├── classes/                     # Main compiled classes
│   └── test-classes/                # Test compiled classes
└── testng.xml                       # Test configuration
```

### Why This Structure Matters for Automation
1. **Separation of Concerns**: Main code vs test code
2. **Build Process**: Maven compiles main and test separately
3. **Dependency Management**: Different classpaths for main and test
4. **IDE Support**: IDEs understand this structure for navigation and debugging

## HelloWorld Example

Let's create a simple HelloWorld class to understand the basics:

### Basic HelloWorld
```java
package com.aw.automationtraining;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Automation World!");
    }
}
```

### Compilation and Execution Process
1. **Source Code** (.java) → **Compiler (javac)** → **Bytecode** (.class)
2. **Bytecode** → **JVM** → **Machine Code** (platform-specific)

### Command Line Execution
```bash
# Compile
javac -d target/classes src/main/java/com/aw/automationtraining/HelloWorld.java

# Run
java -cp target/classes com.aw.automationtraining.HelloWorld
```

## How These Concepts Apply to Automation

### 1. Selenium WebDriver
```java
// When you create a WebDriver instance:
WebDriver driver = new ChromeDriver();

// What happens behind the scenes:
// 1. JVM loads the Selenium classes into memory
// 2. JRE provides networking libraries for browser communication
// 3. JDK compiler ensures type safety and optimization
```

### 2. Rest Assured HTTP Calls
```java
// When you make an API call:
Response response = given()
    .when()
    .get("https://api.example.com/users");

// What happens behind the scenes:
// 1. JVM manages HTTP connection objects
// 2. JRE provides networking and JSON parsing libraries
// 3. JDK enables debugging of network issues
```

### 3. Memory Management in Tests
```java
@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();  // Releases browser resources
    }
    // JVM garbage collector cleans up unused objects
}
```

## Practical Examples

Let's create some practical examples that demonstrate these concepts in action.

