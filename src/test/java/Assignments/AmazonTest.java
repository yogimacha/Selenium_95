package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Step 1: Open Amazon India
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        
        // Step 2: Search for "Samsung"
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        
        // Step 3: Sort Price from Low to High
        WebElement sortDropdown = driver.findElement(By.id("s-result-sort-select"));
        Select select = new Select(sortDropdown);
        select.selectByVisibleText("Price: Low to High");
        Thread.sleep(3000);
        
        // Step 4: Verify sorting
        List<WebElement> prices = driver.findElements(By.cssSelector("span.a-price-whole"));
        for (int i = 1; i < prices.size(); i++) {
            int prevPrice = Integer.parseInt(prices.get(i - 1).getText().replace(",", ""));
            int currentPrice = Integer.parseInt(prices.get(i).getText().replace(",", ""));
            assert prevPrice <= currentPrice : "Price sorting is incorrect!";
        }
        
        // Step 5: Filter by Black Color
        try {
            WebElement blackFilter = driver.findElement(By.xpath("//span[text()='Black']/preceding-sibling::div/input"));
            blackFilter.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Black color filter not found.");
        }
        
        // Step 6: Verify Filtered Results
        List<WebElement> filteredResults = driver.findElements(By.cssSelector(".s-title-instructions-style"));
        assert !filteredResults.isEmpty() : "No results found for black color filter!";
        
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
        assert productTitle.isDisplayed() : "Product details not displayed correctly!";
        
        driver.quit();
    }
}

