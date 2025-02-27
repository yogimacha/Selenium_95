package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExpicitlywait {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com/");

        // Create WebDriverWait instance (explicit wait)
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

        // Wait for the username field to be visible and enter text
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.sendKeys("your_email@example.com"); // Enter your email

        // Wait for the password field to be visible and enter text
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        password.sendKeys("your_password"); // Enter your password

        // Wait for the login button to be clickable and click it
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
        loginButton.click(); // Click the login button

        // Close the browser
        driver.quit();
    }
}
