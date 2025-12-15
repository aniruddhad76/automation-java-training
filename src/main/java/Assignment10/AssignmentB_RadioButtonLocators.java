package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Assignment B - Radio Button Locators
 * 1. Click Radio1 using className
 * 2. Click Radio2 using xpath
 * 3. Click Radio3 using cssSelector
 * 4. Verify which radio button is selected
 */
public class AssignmentB_RadioButtonLocators implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment B - Radio Button Locators ===");
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // 1. Click Radio1 using className
            // Find all elements with class "radioButton" and get the first one (Radio1)
            List<WebElement> radioButtons = driver.findElements(By.className("radioButton"));
            WebElement radio1 = radioButtons.get(0); // First radio button (Radio1)
            radio1.click();
            System.out.println("✓ Radio1 clicked using className (found via className, selected first element)");
            Thread.sleep(1000);
            
            // Verify Radio1 is selected
            boolean radio1Selected = radio1.isSelected();
            System.out.println("Radio1 selected: " + radio1Selected);
            
            // 2. Click Radio2 using xpath
            WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
            radio2.click();
            System.out.println("✓ Radio2 clicked using XPath");
            Thread.sleep(1000);
            
            // Verify Radio2 is selected
            boolean radio2Selected = radio2.isSelected();
            System.out.println("Radio2 selected: " + radio2Selected);
            
            // 3. Click Radio3 using cssSelector
            WebElement radio3 = driver.findElement(By.cssSelector("input[value='radio3']"));
            radio3.click();
            System.out.println("✓ Radio3 clicked using CSS Selector");
            Thread.sleep(1000);
            
            // Verify Radio3 is selected
            boolean radio3Selected = radio3.isSelected();
            System.out.println("Radio3 selected: " + radio3Selected);
            
            // 4. Verify which radio button is selected
            System.out.println("\nFinal Verification - Which radio button is selected:");
            System.out.println("Radio1 selected: " + radio1.isSelected());
            System.out.println("Radio2 selected: " + radio2.isSelected());
            System.out.println("Radio3 selected: " + radio3.isSelected());
            
            if (radio3Selected && !radio1Selected && !radio2Selected) {
                System.out.println("✓ Radio3 is correctly selected (last clicked)");
            }
            
            System.out.println("\n=== Assignment B Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment B - Radio Button Locators";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentB_RadioButtonLocators assignment = new AssignmentB_RadioButtonLocators();
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
