package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Assignment F - Locate Multiple Elements
 * 1. Identify all checkboxes using 'findElements'
 * 2. Loop through and click each checkbox
 * 3. Print their attribute values (id or value)
 */
public class AssignmentF_LocateMultipleElements implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment F - Locate Multiple Elements ===");
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // 1. Identify all checkboxes using 'findElements'
            List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
            System.out.println("Total number of checkboxes found: " + checkboxes.size());
            System.out.println();
            
            // 2. Loop through and click each checkbox
            // 3. Print their attribute values (id or value)
            for (int i = 0; i < checkboxes.size(); i++) {
                WebElement checkbox = checkboxes.get(i);
                
                // Get id attribute
                String id = checkbox.getAttribute("id");
                
                // Get value attribute
                String value = checkbox.getAttribute("value");
                
                // Get name attribute
                String name = checkbox.getAttribute("name");
                
                System.out.println("Checkbox #" + (i + 1) + ":");
                System.out.println("  ID: " + (id != null ? id : "N/A"));
                System.out.println("  Value: " + (value != null ? value : "N/A"));
                System.out.println("  Name: " + (name != null ? name : "N/A"));
                
                // Click the checkbox
                checkbox.click();
                System.out.println("  ✓ Clicked");
                System.out.println("  Selected: " + checkbox.isSelected());
                System.out.println();
                
                Thread.sleep(500); // Small delay between clicks
            }
            
            System.out.println("=== All checkboxes processed ===");
            System.out.println("\n=== Assignment F Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment F - Locate Multiple Elements";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentF_LocateMultipleElements assignment = new AssignmentF_LocateMultipleElements();
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
