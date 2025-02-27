package Auctions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaytmFrame {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://paytm.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Locate the 'Sign In' button and click using JavaScript
        WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sign In']")));
        js.executeScript("arguments[0].click();", signInBtn);
        System.out.println("Clicked on Sign In button");

        // Wait for the iframe to be available
        WebElement loginFrame = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));
        driver.switchTo().frame(loginFrame);
        System.out.println("Switched to login frame");

        // Locate the login option inside iframe and click using JavaScript
        WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt=\"app-store-link\"]")));
        js.executeScript("arguments[0].click();", loginOption);
        System.out.println("Clicked on login option inside iframe");

        // Switch back to main content
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
