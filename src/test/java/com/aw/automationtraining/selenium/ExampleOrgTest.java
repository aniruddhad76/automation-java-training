package com.aw.automationtraining.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Sample Selenium test to demonstrate basic WebDriver functionality
 * This test opens https://example.org and verifies the page title
 */
public class ExampleOrgTest {
    
    private WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testExampleOrgTitle() {
        // Navigate to the example.org website
        driver.get("https://example.org");
        
        // Get the page title
        String actualTitle = driver.getTitle();
        
        // Assert that the title contains "Example Domain"
        Assert.assertEquals(actualTitle, "Example Domain", 
            "Page title should be 'Example Domain'");
        
        // Additional assertion to verify we're on the correct page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("example.org"), 
            "Current URL should contain 'example.org'");
    }
    
    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
