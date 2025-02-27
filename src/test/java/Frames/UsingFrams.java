package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrams {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		
		//click on the login link
		driver.findElement(By.linkText("Log in")).click();
		
		//switch the driver control to the frame
		driver.switchTo().frame("auth-login-ui");
		
		//Enter mobile number
		driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).sendKeys("9876543210");
		
		
		
		
		driver.findElement(By.xpath("//span[@class=\"sc-1kx5g6g-2 ilXTK\"]")).click();
		
		//driver.switchTo().frame(1);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
		
		
		
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//switch the driver control to the main web page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		
		
	}

}
