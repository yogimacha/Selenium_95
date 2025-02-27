package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		act.moveToElement(ele1).perform();
		
		driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
		driver.findElement(By.xpath("(//img[@class=\"img-responsive\"])[1]")).click();
		
		
	}

}
