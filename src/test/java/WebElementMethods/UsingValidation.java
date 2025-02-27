package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		if (search.isDisplayed()) {
			search.sendKeys("computers");
		}
		
		
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		if (searchButton.isEnabled()) {
			searchButton.submit();
		}
		
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		
		gender.click();
		if (gender.isSelected()) {
			System.out.println("selected");
		}
		else {
			System.out.println("Not Selected");
		}
		
		
		
		
		
		Thread.sleep(3000);
	    driver.quit();

	}

}
