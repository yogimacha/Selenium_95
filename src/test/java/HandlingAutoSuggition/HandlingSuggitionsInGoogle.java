package HandlingAutoSuggition;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingSuggitionsInGoogle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        
        // Maximize the window
        driver.manage().window().maximize();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to Google
        driver.get("https://www.google.com/");
        
        // Locate search box and enter input
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("yogi");
        
        Thread.sleep(3000);
        // Explicit wait to ensure auto-suggestions appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        List<WebElement> autoSug = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//span"))
        );

        Thread.sleep(3000);
        // Define the expected text to click
        String expectedText = "Yogi Babu";  // Change this to any text you want to check and click

        boolean found = false;
        for (WebElement suggestion : autoSug) {
            String text = suggestion.getText();
            System.out.println(text);  // Print all suggestions
            
            if (text.equalsIgnoreCase(expectedText)) {  // Check if expected text matches
                suggestion.click();  // Click on the matched suggestion
                found = true;
                break;  // Stop further checking once found
            }
        }

        if (!found) {
            System.out.println("The expected suggestion '" + expectedText + "' was not found.");
        }
        
        // Quit the driver
        	//driver.quit();
    }
}
