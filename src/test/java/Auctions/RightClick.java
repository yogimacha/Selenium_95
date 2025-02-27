package Auctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

    public static void main(String[] args) throws InterruptedException {

        //launch the browser
    	WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //navigate to an application
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        
        
        
        
     // Identify double-click button
        WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        Actions act = new Actions(driver);
        
        act.contextClick(rightclickbtn).perform();

        driver.findElement(By.id("authentication")).click();
        
        act.doubleClick(button).perform();


        
        
        
        Thread.sleep(3000);

        //close the browser
        driver.quit();
    }
}
