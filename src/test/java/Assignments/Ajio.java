package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ajio.com/");
		
		Actions act = new Actions(driver);
		
		WebElement kids_ele = driver.findElement(By.xpath("//span[@aria-label=\"KIDS\"]"));
		act.moveToElement(kids_ele).perform();
		
		WebElement dress_ele=driver.findElement(By.xpath("//a[text()=\"Dresses & Frocks\"]"));
		dress_ele.click();
		
		
		 WebElement dropdown = driver.findElement(By.id("sortBy"));
		Select s= new Select(dropdown);
		s.selectByIndex(4);
		
		
		//driver.findElement(By.xpath("//option[@value=\"newn\"]")).click();
		
		
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("(//div[@role='gridcell']//span//strong)[1]"));
		System.out.println(price.getText());
		
		driver.quit();
		}
	

}
