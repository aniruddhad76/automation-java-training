package Assignment10;

import org.openqa.selenium.WebDriver;

/**
 * Interface for all locator assignments (A through I)
 * All assignment classes should implement this interface
 */
public interface LocatorAssignment {
    /**
     * Execute the assignment
     * @param driver The WebDriver instance to use
     */
    void execute(WebDriver driver);
    
    /**
     * Get the assignment name/identifier
     * @return Assignment identifier (A, B, C, etc.)
     */
    String getAssignmentName();
}
