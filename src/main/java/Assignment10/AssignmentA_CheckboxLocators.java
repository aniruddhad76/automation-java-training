package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Assignment A - Checkbox Locators
 * 1. Select "Option1" using ID
 * 2. Select "Option2" using Name
 * 3. Select "Option3" using CSS Selector
 * 4. Verify all checkboxes are selected
 * 5. Uncheck them again
 */
public class AssignmentA_CheckboxLocators implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment A - Checkbox Locators ===");
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // 1. Select "Option1" using ID
            WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
            option1.click();
            System.out.println("✓ Option1 selected using ID");
            
            // 2. Select "Option2" using Name
            WebElement option2 = driver.findElement(By.name("checkBoxOption2"));
            option2.click();
            System.out.println("✓ Option2 selected using Name");
            
            // 3. Select "Option3" using CSS Selector
            WebElement option3 = driver.findElement(By.cssSelector("input[value='option3']"));
            option3.click();
            System.out.println("✓ Option3 selected using CSS Selector");
            
            Thread.sleep(1000);
            
            // 4. Verify all checkboxes are selected
            boolean option1Selected = option1.isSelected();
            boolean option2Selected = option2.isSelected();
            boolean option3Selected = option3.isSelected();
            
            System.out.println("\nVerification Results:");
            System.out.println("Option1 selected: " + option1Selected);
            System.out.println("Option2 selected: " + option2Selected);
            System.out.println("Option3 selected: " + option3Selected);
            
            if (option1Selected && option2Selected && option3Selected) {
                System.out.println("✓ All checkboxes are selected!");
            } else {
                System.out.println("✗ Some checkboxes are not selected");
            }
            
            Thread.sleep(2000);
            
            // 5. Uncheck them again
            if (option1Selected) {
                option1.click();
                System.out.println("\n✓ Option1 unchecked");
            }
            if (option2Selected) {
                option2.click();
                System.out.println("✓ Option2 unchecked");
            }
            if (option3Selected) {
                option3.click();
                System.out.println("✓ Option3 unchecked");
            }
            
            System.out.println("\n=== Assignment A Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment A - Checkbox Locators";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentA_CheckboxLocators assignment = new AssignmentA_CheckboxLocators();
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
