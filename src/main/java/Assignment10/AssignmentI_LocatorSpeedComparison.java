package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * Assignment I - Locator Speed Comparison
 * 1. Locate the same element using ID, Name, CSS Selector, XPath
 * 2. Capture the time taken for each locator
 * 3. Print which locator is fastest
 */
public class AssignmentI_LocatorSpeedComparison implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment I - Locator Speed Comparison ===");
        System.out.println();
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // We'll use the Option1 checkbox for comparison
            // It has ID: checkBoxOption1, Name: checkBoxOption1
            String elementId = "checkBoxOption1";
            String elementName = "checkBoxOption1";
            String cssSelector = "input#checkBoxOption1";
            String xpath = "//input[@id='checkBoxOption1']";
            
            Map<String, Long> timingResults = new HashMap<>();
            int iterations = 10; // Run each locator multiple times for better accuracy
            
            System.out.println("Running speed comparison (" + iterations + " iterations each)...");
            System.out.println();
            
            // 1. Test ID locator
            long idTime = measureLocatorSpeed(driver, By.id(elementId), iterations);
            timingResults.put("ID", idTime);
            System.out.println("ID locator average time: " + idTime + " ms");
            
            // 2. Test Name locator
            long nameTime = measureLocatorSpeed(driver, By.name(elementName), iterations);
            timingResults.put("Name", nameTime);
            System.out.println("Name locator average time: " + nameTime + " ms");
            
            // 3. Test CSS Selector locator
            long cssTime = measureLocatorSpeed(driver, By.cssSelector(cssSelector), iterations);
            timingResults.put("CSS Selector", cssTime);
            System.out.println("CSS Selector average time: " + cssTime + " ms");
            
            // 4. Test XPath locator
            long xpathTime = measureLocatorSpeed(driver, By.xpath(xpath), iterations);
            timingResults.put("XPath", xpathTime);
            System.out.println("XPath locator average time: " + xpathTime + " ms");
            
            System.out.println();
            System.out.println("=== Results Summary ===");
            
            // Find the fastest locator
            String fastest = timingResults.entrySet().stream()
                    .min(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse("Unknown");
            
            long fastestTime = timingResults.get(fastest);
            
            System.out.println("Fastest locator: " + fastest + " (" + fastestTime + " ms average)");
            System.out.println();
            
            // Print all results sorted by speed
            System.out.println("All locators ranked by speed (fastest to slowest):");
            timingResults.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(entry -> 
                        System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " ms")
                    );
            
            System.out.println();
            System.out.println("Note: Results may vary based on browser, network, and system performance.");
            System.out.println("Generally, ID > Name > CSS Selector > XPath in terms of speed.");
            
            System.out.println("\n=== Assignment I Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Measure the average time taken to locate an element using a specific locator strategy
     */
    private long measureLocatorSpeed(WebDriver driver, By locator, int iterations) {
        long totalTime = 0;
        
        for (int i = 0; i < iterations; i++) {
            long startTime = System.nanoTime();
            try {
                WebElement element = driver.findElement(locator);
                // Ensure element is actually found
                element.isDisplayed();
            } catch (Exception e) {
                // If element not found, skip this iteration
                continue;
            }
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime) / 1_000_000; // Convert to milliseconds
        }
        
        return totalTime / iterations;
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment I - Locator Speed Comparison";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentI_LocatorSpeedComparison assignment = new AssignmentI_LocatorSpeedComparison();
            assignment.execute(driver);
        } finally {
            try {
                Thread.sleep(5000); // Keep browser open for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
