package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSearchAndVerificationFlow {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        
        // Maximize the window
        driver.manage().window().maximize();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Navigate to Amazon
        driver.get("https://www.amazon.in/");
        
        String title = driver.getTitle();
        System.out.println(title);
        
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        search.sendKeys("samsung");
        
        driver.findElement(By.id("nav-search-submit-button")).click();
        
        // Identify the dropdown
        WebElement dropdown = driver.findElement(By.id("s-result-sort-select"));
        
        // Create an instance of Select class
        Select s = new Select(dropdown);
        
        // Select option based on the visible text
        s.selectByVisibleText("Price: Low to High");
        
        //Thread.sleep(5000);
        
        // Verify price
        List<WebElement> prices = driver.findElements(By.cssSelector("span.a-price-whole"));
        
        System.out.println(prices);
        boolean isSorted = true;
        for (int i = 1; i < prices.size(); i++) {
            int prevPrice = Integer.parseInt(prices.get(i - 1).getText().replace(",", ""));
            int currentPrice = Integer.parseInt(prices.get(i).getText().replace(",", ""));
            if (prevPrice > currentPrice) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Price sorting is correct.");
        } else {
            System.out.println("Price sorting is incorrect!");
        }
        
        Thread.sleep(4000);

        // Step 5: Filter by Black Color
        try {
            WebElement blackFilter = driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[1]"));
            blackFilter.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Black color filter not found.");
        }
        
        Thread.sleep(10000);
        
        // Step 6: Verify Filtered Results
        List<WebElement> filteredResults = driver.findElements(By.cssSelector(".s-title-instructions-style"));
        if (!filteredResults.isEmpty()) {
            System.out.println("Filtered results found.");
        } else {
            System.out.println("No results found for black color filter!");
        }
        
        Thread.sleep(3000);
        
        // Step 7: Click on the 3rd Search Result
        if (filteredResults.size() >= 3) {
            filteredResults.get(2).click();
            Thread.sleep(3000);
        }
        
        // Handle new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        
        // Verify product details
        WebElement productTitle = driver.findElement(By.id("productTitle"));
        if (productTitle.isDisplayed()) {
            System.out.println("Product details displayed correctly.");
        } else {
            System.out.println("Product details not displayed correctly!");
        }
        
        System.out.println(productTitle.getText());
        
        driver.quit();
    }
}
