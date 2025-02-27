package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		

		//File upload using sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\yoges\\Desktop\\file1.txt");
		//upload.click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
