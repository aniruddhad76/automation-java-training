package Assignment10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Assignment H - CSS Selector Practice
 * Write CSS selectors for:
 * - Checkbox Option2
 * - Radio button 3
 * - Dropdown
 * - Suggestion input
 * - "Home" link in header
 */
public class AssignmentH_CSSSelectorPractice implements LocatorAssignment {
    
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";
    
    @Override
    public void execute(WebDriver driver) {
        System.out.println("=== Assignment H - CSS Selector Practice ===");
        System.out.println();
        
        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);
        
        try {
            Thread.sleep(2000); // Wait for page to load
            
            // CSS Selector for Checkbox Option2
            System.out.println("1. Checkbox Option2 CSS Selector:");
            String cssOption2 = "input[value='option2']";
            System.out.println("   CSS: " + cssOption2);
            WebElement option2 = driver.findElement(By.cssSelector(cssOption2));
            option2.click();
            System.out.println("   ✓ Located and clicked using CSS Selector");
            System.out.println();
            
            // CSS Selector for Radio button 3
            System.out.println("2. Radio Button 3 CSS Selector:");
            String cssRadio3 = "input[value='radio3']";
            System.out.println("   CSS: " + cssRadio3);
            WebElement radio3 = driver.findElement(By.cssSelector(cssRadio3));
            radio3.click();
            System.out.println("   ✓ Located and clicked using CSS Selector");
            System.out.println();
            
            // CSS Selector for Dropdown
            System.out.println("3. Dropdown CSS Selector:");
            String cssDropdown = "select#dropdown-class-example";
            System.out.println("   CSS: " + cssDropdown);
            WebElement dropdown = driver.findElement(By.cssSelector(cssDropdown));
            System.out.println("   ✓ Located using CSS Selector");
            System.out.println("   Dropdown found: " + dropdown.getTagName());
            System.out.println();
            
            // CSS Selector for Suggestion input
            System.out.println("4. Suggestion Input CSS Selector:");
            String cssSuggestionInput = "input#autocomplete";
            System.out.println("   CSS: " + cssSuggestionInput);
            WebElement suggestionInput = driver.findElement(By.cssSelector(cssSuggestionInput));
            suggestionInput.sendKeys("Test");
            System.out.println("   ✓ Located and interacted with using CSS Selector");
            suggestionInput.clear();
            System.out.println();
            
            // CSS Selector for "Home" link in header
            System.out.println("5. 'Home' Link in Header CSS Selector:");
            String cssHomeLink = "a[href*='rahulshettyacademy.com']";
            // More specific: header a or specific class-based selector
            String cssHomeLinkSpecific = "header a, a[href*='rahulshettyacademy.com']";
            System.out.println("   CSS (general): " + cssHomeLink);
            System.out.println("   CSS (specific): " + cssHomeLinkSpecific);
            
            // Try to find the Home link - it might be in the header or navigation
            try {
                WebElement homeLink = driver.findElement(By.cssSelector("a[href*='rahulshettyacademy.com']"));
                System.out.println("   ✓ Located using CSS Selector");
                System.out.println("   Link text: " + homeLink.getText());
            } catch (Exception e) {
                // Alternative approach
                WebElement homeLink = driver.findElement(By.linkText("Home"));
                System.out.println("   ✓ Located 'Home' link (alternative method)");
                System.out.println("   Link text: " + homeLink.getText());
            }
            System.out.println();
            
            // Alternative CSS Selectors for reference
            System.out.println("=== Alternative CSS Selector Examples ===");
            System.out.println("Option2 (alternative): input[name='checkBoxOption2']");
            System.out.println("Radio3 (alternative): input[type='radio'][value='radio3']");
            System.out.println("Dropdown (alternative): select[name='dropdown-class-example']");
            System.out.println("Suggestion Input (alternative): input[class*='inputs'][id='autocomplete']");
            System.out.println("Home Link (alternative): header a, nav a, a:contains('Home')");
            
            System.out.println("\n=== Assignment H Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    @Override
    public String getAssignmentName() {
        return "Assignment H - CSS Selector Practice";
    }
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        try {
            AssignmentH_CSSSelectorPractice assignment = new AssignmentH_CSSSelectorPractice();
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
