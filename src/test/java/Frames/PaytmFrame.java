package Frames;

import java.time.Duration;
import org.openqa.selenium.By;
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

        // Click on 'Sign In' button
        WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sign In']")));
        signInBtn.click();

        // Wait for the iframe to be present
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("iframe")));

        // Locate the iframe and switch to it
        WebElement loginFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(loginFrame);

        // Wait for the login button inside the iframe
        WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt=\"app-store-link\"]")));
        loginOption.click();

        // Switch back to the main page
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
