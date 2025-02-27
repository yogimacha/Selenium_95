package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.id("srcCode")).click();
		WebElement from = driver.findElement(By.id("text-box"));
		from.click();
		from.sendKeys("HYD");
		driver.findElement(By.id("popularCityName")).click();
		
		driver.findElement(By.id("to")).click();
		WebElement to = driver.findElement(By.id("text-box"));
		to.click();
		to.sendKeys("vija");
		driver.findElement(By.id("popularCityName")).click();
		
		driver.findElement(By.id("departureDate")).click();
		
		
	}

}
