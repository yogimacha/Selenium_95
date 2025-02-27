package JavascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTheScrollBoy {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		Thread.sleep(3000);
		//Scroll the webpage using hardcoded coordinates
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,5000)");
		
		
		//scroll the webpage by using reference Element
		WebElement ele = driver.findElement(By.xpath("(//div[@class=\"footer-top-main-section-item\"])[22]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		
		Thread.sleep(5000);

		//scroll webpage using element 
		WebElement ele1 = driver.findElement(By.id("sign_in_text"));
		int x = ele1.getLocation().getX();
		int y = ele1.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		System.out.println(x+","+y);
		
		
		//scroll till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrolHeight)");
		Thread.sleep(5000);

		//scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrolHeight)");

		Thread.sleep(5000);
		driver.quit();
	}

}
