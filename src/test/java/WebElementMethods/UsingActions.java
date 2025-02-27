package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActions {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		search.sendKeys("computers");
		
		//Clear the text
		search.clear();
		
		search.sendKeys("Books");
		
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		


		String gettext = driver.findElement(By.linkText("Register")).getText();
		System.out.println(gettext);
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
