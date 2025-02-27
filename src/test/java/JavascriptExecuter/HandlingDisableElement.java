package JavascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String url="https://account.relianceretail.com/sign-up/?client_id=fdb646ea-e708-4725-a953-228fa1cb8355&return_ui_url=www.jiomart.com/customer/account/login?msite=yes";
		driver.get(url);
		
		//Handle disable Button
		WebElement dis_ele = driver.findElement(By.xpath("//button[@aria-label=\"button Continue\"]"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].checked=true",dis_ele);
		
		
		//Handle disable TF/Enable TF
		
		
		
		//Click on Enable Button
			
		
		WebElement enb_btn = driver.findElement(By.id("phoneNumber"));
		enb_btn.sendKeys("8688755404");
		JavascriptExecutor js1 =(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",dis_ele);
				
		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		
		
		//Navigate to application
		JavascriptExecutor js2 =(JavascriptExecutor)driver;
		js2.executeScript("window.location=arguments[0]","https://www.facebook.com/");
		
		//Fetch the title of the webpage
		System.out.println("Title :"+js2.executeScript("return document.title"));
		
		//Fetch the url of the webpage
				System.out.println("URL :"+js2.executeScript("return document.URL"));
				
		//Refresh the webpage
				js.executeScript("history.go(0)");
		
		driver.quit();		
	}

}
