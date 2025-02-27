package PracticeTestCase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserCanAbleToBookGas {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//span[text()='Electricity Bill']")).click();
		
		Thread.sleep(3000);
//		
		// Store the current window handle
		String currentWindow = driver.getWindowHandle();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Loop through handles and switch to the new one
		for (String window : allWindows) {
		    if (!window.equals(currentWindow)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//label[text()='State']"));
		act.moveToElement(ele).click(ele).perform();		
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Andhra Pradesh']"));
		act.moveToElement(ele1).click().perform();
		
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Electricity Board']"));
		act.moveToElement(ele2).click().perform();
		
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Eastern Power Distribution Company of Andhra Pradesh Ltd. (APEPDCL)']"));
		act.moveToElement(ele3).click().perform();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.quit();
	}

}
