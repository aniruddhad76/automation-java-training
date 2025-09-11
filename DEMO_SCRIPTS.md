# Java Fundamentals Demo Scripts

## Prerequisites
- Java 17 installed
- Maven 3.6+ installed
- Chrome browser (for Selenium tests)

## Demo 1: Basic HelloWorld

### Compile and Run Manually
```bash
# Navigate to project root
cd C:\Users\anike\Automation-java-training

# Compile HelloWorld
javac -d target/classes -cp "target/classes" src/main/java/com/aw/automationtraining/HelloWorld.java

# Run HelloWorld
java -cp target/classes com.aw.automationtraining.HelloWorld
```

### Using Maven
```bash
# Compile and run
mvn compile exec:java -Dexec.mainClass="com.aw.automationtraining.HelloWorld"
```

## Demo 2: Automation Fundamentals Demo

```bash
# Run the automation fundamentals demo
mvn compile exec:java -Dexec.mainClass="com.aw.automationtraining.AutomationFundamentalsDemo"
```

## Demo 3: Practical Automation Test

```bash
# Run the practical automation test
mvn test -Dtest=JavaFundamentalsInAutomationTest
```

## Demo 4: All Tests Together

```bash
# Run all tests including the new fundamentals test
mvn test
```

## Understanding the Output

### HelloWorld Output
- Shows basic JVM execution
- Demonstrates memory management
- Shows JRE library usage
- Explains class loading

### Automation Fundamentals Demo Output
- Shows JVM role in automation
- Demonstrates JRE libraries in testing
- Explains JDK tools for development
- Shows memory management in tests

### Practical Test Output
- Real Selenium test execution
- Real Rest Assured API test
- Memory management demonstration
- Resource cleanup examples

## Key Learning Points

1. **JVM**: Executes your automation code, manages memory for WebDriver instances
2. **JRE**: Provides libraries for networking (Rest Assured), collections (test data)
3. **JDK**: Compiles test code, enables debugging, provides development tools
4. **Memory Management**: Crucial for automation - WebDriver instances must be closed
5. **Class Loading**: How Selenium and Rest Assured classes are loaded into memory

## Troubleshooting

### If Chrome driver issues occur:
```bash
# WebDriverManager should handle this automatically
# But if needed, manually download ChromeDriver
```

### If compilation fails:
```bash
# Check Java version
java -version

# Should show Java 17
```

### If Maven issues occur:
```bash
# Clean and recompile
mvn clean compile
```

