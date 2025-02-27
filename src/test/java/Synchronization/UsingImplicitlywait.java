package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitlywait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		if (search.isDisplayed()) {
			search.sendKeys("computers");
		}
		driver.quit();
		
	}

}
