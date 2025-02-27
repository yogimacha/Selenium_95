package StartAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RightLeftUsing {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=register");
		
		WebElement email = driver.findElement(By.xpath("(//input[@name=\"email\"])[2]"));
		email.sendKeys("yogi@gmail.com");
		
		WebElement fn = driver.findElement(RelativeLocator.with(By.tagName("input")).above(email));
		fn.sendKeys("yogi");
		
		
		
		WebElement pswd = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(email));
		pswd.sendKeys("yogi@123");
		
		WebElement cpswd = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		cpswd.sendKeys("yogi@123");
		
		WebElement home = driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]"));
		
		WebElement regi = driver.findElement(RelativeLocator.with(By.tagName("input")).near(home));
		regi.click();
	}

}
