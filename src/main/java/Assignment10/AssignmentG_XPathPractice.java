package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Assignment G - XPath Practice
 * Write XPath locators for:
 * - Option1 checkbox
 * - Radio Button 2
 * - Dropdown
 * - Suggestion Box
 * - "Open Tab" button
 */
public class AssignmentG_XPathPractice implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment G - XPath Practice ===");
        System.out.println();
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // XPath for Option1 checkbox
            System.out.println("1. Option1 Checkbox XPath:");
            String xpathOption1 = "//input[@id='checkBoxOption1']";
            System.out.println("   XPath: " + xpathOption1);
            WebElement option1 = driver.findElement(By.xpath(xpathOption1));
            option1.click();
            System.out.println("   ✓ Located and clicked using XPath");
            System.out.println();
            
            // XPath for Radio Button 2
            System.out.println("2. Radio Button 2 XPath:");
            String xpathRadio2 = "//input[@value='radio2']";
            System.out.println("   XPath: " + xpathRadio2);
            WebElement radio2 = driver.findElement(By.xpath(xpathRadio2));
            radio2.click();
            System.out.println("   ✓ Located and clicked using XPath");
            System.out.println();
            
            // XPath for Dropdown
            System.out.println("3. Dropdown XPath:");
            String xpathDropdown = "//select[@id='dropdown-class-example']";
            System.out.println("   XPath: " + xpathDropdown);
            WebElement dropdown = driver.findElement(By.xpath(xpathDropdown));
            System.out.println("   ✓ Located using XPath");
            System.out.println("   Dropdown found: " + dropdown.getTagName());
            System.out.println();
            
            // XPath for Suggestion Box
            System.out.println("4. Suggestion Box XPath:");
            String xpathSuggestionBox = "//input[@id='autocomplete']";
            System.out.println("   XPath: " + xpathSuggestionBox);
            WebElement suggestionBox = driver.findElement(By.xpath(xpathSuggestionBox));
            suggestionBox.sendKeys("Test");
            System.out.println("   ✓ Located and interacted with using XPath");
            suggestionBox.clear();
            System.out.println();
            
            // XPath for "Open Tab" button/link
            System.out.println("5. 'Open Tab' Link XPath:");
            String xpathOpenTab = "//a[text()='Open Tab']";
            System.out.println("   XPath: " + xpathOpenTab);
            WebElement openTab = driver.findElement(By.xpath(xpathOpenTab));
            System.out.println("   ✓ Located using XPath");
            System.out.println("   Link text: " + openTab.getText());
            System.out.println();
            
            // Alternative XPaths for reference
            System.out.println("=== Alternative XPath Examples ===");
            System.out.println("Option1 (alternative): //input[@type='checkbox' and @value='option1']");
            System.out.println("Radio2 (alternative): //input[@type='radio' and @value='radio2']");
            System.out.println("Dropdown (alternative): //select[@name='dropdown-class-example']");
            System.out.println("Suggestion Box (alternative): //input[contains(@class,'inputs') and @id='autocomplete']");
            System.out.println("Open Tab (alternative): //a[contains(@href,'rahulshettyacademy.com') and text()='Open Tab']");
            
            System.out.println("\n=== Assignment G Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment G - XPath Practice";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentG_XPathPractice assignment = new AssignmentG_XPathPractice();
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
