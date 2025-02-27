package PracticeTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingCalandcer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.id("departureDate")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/section/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[4]/div")).click();
	
		driver.findElement(By.id("addReturn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/section[1]/div/section/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[1]/table/tbody/tr[3]/td[7]/div")).click();
	}

}
