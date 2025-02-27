package Auctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 //launch the browser
    	WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //navigate to an application
        driver.get("https://testkru.com/Interactions/DragAndDrop");
        
        WebElement dragBox1 = driver.findElement(By.id("box1"));
        WebElement dragBox2=driver.findElement(By.id("box2"));
        WebElement dragBox3=driver.findElement(By.id("box3"));
        
        
        WebElement drop1 = driver.findElement(By.id("dropZone1"));
        WebElement drop2 = driver.findElement(By.id("dropZone2"));
        WebElement drop3 = driver.findElement(By.id("dropZone3"));
        
        
        
        
        
        Actions act = new Actions(driver);

        //Using DragAndDrop method
        act.dragAndDrop(dragBox1, drop1).perform();
        
        
        if (drop2.isEnabled()) {
        	
        	act.dragAndDrop(dragBox2, drop2).perform();
			
		}
         
        //Using Hold and Release method
        act.clickAndHold(dragBox3).moveToElement(drop3).release().perform();
        
        //driver.quit();
        

	}

}
