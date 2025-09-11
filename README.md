# Automation Training Project

This Maven project is designed for Selenium + Rest Assured training with Java 17.

## Project Structure

```
automation-training/
├── pom.xml                                    # Maven configuration
├── testng.xml                                # TestNG test suite configuration
├── .gitignore                                # Git ignore file
├── src/
│   ├── main/java/com/aw/automationtraining/  # Main source code
│   └── test/java/com/aw/automationtraining/  # Test source code
│       ├── selenium/                          # Selenium tests
│       │   └── ExampleOrgTest.java           # Sample Selenium test
│       └── restassured/                       # Rest Assured tests
│           └── ReqResApiTest.java            # Sample API test
```

## Dependencies

- **Java 17**
- **TestNG 7.9.0** - Testing framework
- **Selenium 4.21.0** - Web automation
- **WebDriverManager 5.8.0** - Automatic driver management
- **Rest Assured 5.4.0** - API testing
- **Jackson Databind 2.16.1** - JSON processing

## Running Tests

### Run all tests using Maven:
```bash
mvn test
```

### Run specific test class:
```bash
mvn test -Dtest=ExampleOrgTest
mvn test -Dtest=ReqResApiTest
```

### Run using TestNG XML:
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Test Descriptions

### Selenium Test (ExampleOrgTest.java)
- Opens https://example.org
- Verifies the page title is "Example Domain"
- Checks that the URL contains "example.org"
- Uses WebDriverManager for automatic Chrome driver setup

### Rest Assured Test (ReqResApiTest.java)
- Calls https://reqres.in/api/users?page=2
- Verifies the response status code is 200
- Asserts that the page number in response is 2
- Validates response structure and data
- Includes both programmatic and JSON path assertions

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- Chrome browser (for Selenium tests)
- Git (for version control) - [Installation Guide](GIT_SETUP_GUIDE.md)

## Git Setup

### Quick Setup
Run the provided setup script:
```bash
# PowerShell (recommended)
.\setup-git.ps1

# Or Batch file
setup-git.bat
```

### Manual Setup
```bash
# Initialize Git repository
git init

# Configure Git (first time only)
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

# Add and commit all files
git add .
git commit -m "Initial commit: Maven project with Selenium and Rest Assured training"
```

For detailed Git setup instructions, see [GIT_SETUP_GUIDE.md](GIT_SETUP_GUIDE.md).

## IDE Setup

This project is configured to work with:
- IntelliJ IDEA (with .idea/ in .gitignore)
- VS Code (with .vscode/ in .gitignore)
- Any Maven-compatible IDE
