package com.aw.automationtraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * Practical demonstration of Java fundamentals in automation testing
 * This test class shows how JDK, JRE, JVM concepts apply to real automation scenarios
 */
public class JavaFundamentalsInAutomationTest {
    
    private WebDriver driver;
    private Map<String, Object> testContext;
    
    @BeforeMethod
    public void setUp() {
        // JVM loads WebDriver classes into memory
        System.out.println("=== JVM Class Loading Demo ===");
        System.out.println("Loading WebDriver classes...");
        
        // JDK compiler ensures type safety
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        // JRE provides collections framework
        testContext = new HashMap<>();
        testContext.put("startTime", System.currentTimeMillis());
        testContext.put("browserType", "Chrome");
        
        System.out.println("Test context initialized: " + testContext);
        System.out.println("JVM memory allocated for WebDriver instance");
    }
    
    @Test
    public void testSeleniumWithJavaFundamentals() {
        System.out.println("\n=== Selenium Test with Java Fundamentals ===");
        
        // JVM executes bytecode for navigation
        driver.get("https://example.org");
        
        // JRE provides String manipulation
        String actualTitle = driver.getTitle();
        String expectedTitle = "Example Domain";
        
        // JDK enables debugging - you can set breakpoints here
        System.out.println("Actual title: " + actualTitle);
        System.out.println("Expected title: " + expectedTitle);
        
        // JVM manages object lifecycle
        Assert.assertEquals(actualTitle, expectedTitle, 
            "Title should match expected value");
        
        // JRE provides system information
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        System.out.println("JRE provides URL handling capabilities");
        
        // Update test context (JRE collections)
        testContext.put("actualTitle", actualTitle);
        testContext.put("currentUrl", currentUrl);
        testContext.put("testStatus", "PASSED");
    }
    
    @Test
    public void testRestAssuredWithJavaFundamentals() {
        System.out.println("\n=== Rest Assured Test with Java Fundamentals ===");
        
        // JRE provides networking libraries
        RestAssured.baseURI = "https://reqres.in";
        
        // JVM manages HTTP connection objects
        Response response = given()
            .queryParam("page", 2)
            .when()
            .get("/api/users")
            .then()
            .statusCode(200)
            .extract()
            .response();
        
        // JRE provides JSON parsing (through Jackson)
        int page = response.jsonPath().getInt("page");
        int perPage = response.jsonPath().getInt("per_page");
        
        System.out.println("API Response - Page: " + page + ", Per Page: " + perPage);
        System.out.println("JRE provides JSON parsing capabilities");
        
        // JDK enables type safety
        Assert.assertEquals(page, 2, "Page should be 2");
        Assert.assertTrue(perPage > 0, "Per page should be greater than 0");
        
        // JVM manages response object lifecycle
        testContext.put("apiResponse", response.asString());
        testContext.put("responseTime", response.getTime());
        testContext.put("statusCode", response.getStatusCode());
    }
    
    @Test
    public void testMemoryManagementInAutomation() {
        System.out.println("\n=== Memory Management in Automation ===");
        
        // Demonstrate memory allocation
        String[] testData = new String[1000];
        for (int i = 0; i < testData.length; i++) {
            testData[i] = "Test data item " + i;
        }
        
        System.out.println("Created " + testData.length + " test data items");
        
        // Show memory usage before cleanup
        Runtime runtime = Runtime.getRuntime();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory before cleanup: " + (memoryBefore / 1024 / 1024) + " MB");
        
        // Cleanup (important in automation)
        testData = null; // Mark for garbage collection
        
        // Force garbage collection (for demo)
        System.gc();
        
        // Show memory usage after cleanup
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after cleanup: " + (memoryAfter / 1024 / 1024) + " MB");
        
        System.out.println("In real automation:");
        System.out.println("- WebDriver instances must be closed");
        System.out.println("- Test data should be cleaned up");
        System.out.println("- JVM garbage collector handles cleanup");
    }
    
    @AfterMethod
    public void tearDown() {
        System.out.println("\n=== Cleanup and Memory Management ===");
        
        // Explicit cleanup (crucial for automation)
        if (driver != null) {
            System.out.println("Closing WebDriver instance...");
            driver.quit();
            System.out.println("WebDriver resources released");
        }
        
        // Clear test context
        if (testContext != null) {
            testContext.clear();
            System.out.println("Test context cleared");
        }
        
        // JVM garbage collector will clean up remaining objects
        System.out.println("JVM will clean up remaining objects");
        
        // Show final memory state
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        System.out.println("Free memory: " + (freeMemory / 1024 / 1024) + " MB");
    }
}

