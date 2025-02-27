package Auctions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        // Identify double-click button
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me']"));

        // Create Actions class object
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();

        Thread.sleep(3000);
        driver.quit();
    }
}
