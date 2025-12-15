package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Assignment E - LinkText & PartialLinkText
 * 1. Click "Open Tab" using linkText
 * 2. Click "Open Window" using partialLinkText
 * 3. Verify the tab/window navigation
 * 4. Close new windows and return to the main page
 */
public class AssignmentE_LinkTextPartialLinkText implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment E - LinkText & PartialLinkText ===");
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main window handle: " + mainWindowHandle);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // 1. Click "Open Tab" using linkText
            WebElement openTab = driver.findElement(By.linkText("Open Tab"));
            openTab.click();
            System.out.println("✓ Clicked 'Open Tab' using linkText");
            Thread.sleep(2000);
            
            // Get all window handles
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println("Number of windows/tabs open: " + windowHandles.size());
            
            // Switch to the new tab
            for (String handle : windowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    System.out.println("✓ Switched to new tab");
                    System.out.println("New tab URL: " + driver.getCurrentUrl());
                    System.out.println("New tab title: " + driver.getTitle());
                    break;
                }
            }
            
            // Close the new tab and switch back to main window
            driver.close();
            System.out.println("✓ Closed the new tab");
            driver.switchTo().window(mainWindowHandle);
            System.out.println("✓ Switched back to main window");
            Thread.sleep(2000);
            
            // 2. Click "Open Window" using partialLinkText
            // partialLinkText will match any link text that contains the specified substring
            // Try "Window" first as it's more specific and should match "Open Window"
            WebElement openWindow = null;
            try {
                openWindow = driver.findElement(By.partialLinkText("Window"));
                String linkText = openWindow.getText();
                System.out.println("Found link with partialLinkText('Window'): '" + linkText + "'");
                // Verify it's the "Open Window" link
                if (!linkText.contains("Open")) {
                    // If multiple "Window" links exist, find the one with "Open"
                    java.util.List<WebElement> windowLinks = driver.findElements(By.partialLinkText("Window"));
                    for (WebElement link : windowLinks) {
                        if (link.getText().contains("Open")) {
                            openWindow = link;
                            break;
                        }
                    }
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Fallback: try with "Open" as partial text
                System.out.println("Could not find with 'Window', trying 'Open'");
                openWindow = driver.findElement(By.partialLinkText("Open"));
            }
            
            openWindow.click();
            System.out.println("✓ Clicked 'Open Window' using partialLinkText");
            Thread.sleep(2000);
            
            // 3. Verify the tab/window navigation
            windowHandles = driver.getWindowHandles();
            System.out.println("Number of windows/tabs open after clicking 'Open Window': " + windowHandles.size());
            
            // Switch to the new window
            for (String handle : windowHandles) {
                if (!handle.equals(mainWindowHandle)) {
                    driver.switchTo().window(handle);
                    System.out.println("✓ Switched to new window");
                    System.out.println("New window URL: " + driver.getCurrentUrl());
                    System.out.println("New window title: " + driver.getTitle());
                    break;
                }
            }
            
            // 4. Close new windows and return to the main page
            driver.close();
            System.out.println("✓ Closed the new window");
            driver.switchTo().window(mainWindowHandle);
            System.out.println("✓ Returned to main page");
            System.out.println("Current URL: " + driver.getCurrentUrl());
            
            System.out.println("\n=== Assignment E Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment E - LinkText & PartialLinkText";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentE_LinkTextPartialLinkText assignment = new AssignmentE_LinkTextPartialLinkText();
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
