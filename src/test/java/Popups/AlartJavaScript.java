package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartJavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//NoAlertPresentException(With out getting any Alert we try to handle it we get this Exception)
//		Alert a1 =driver.switchTo().alert();
//		System.out.println(a1.getText());				
//		a1.accept();
		
		//click on Alert popup button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Switch the control to the alert popup
		Alert a1 =driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		
		
		//UnhandledAlertException(with out handling Alert we get this Exception)
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Alert a1 =driver.switchTo().alert();
//		System.out.println(a1.getText());
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Driver control switch back to main webpage
		driver.switchTo().defaultContent();
		
		
		//Switch the control to the conform popup
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert a2 =driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.dismiss();
		
		//Driver control switch back to main webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a3 =driver.switchTo().alert();
		System.out.println(a3.getText());
		a2.sendKeys("My Name is Macha...");
		
		
		driver.quit();
	}

}
