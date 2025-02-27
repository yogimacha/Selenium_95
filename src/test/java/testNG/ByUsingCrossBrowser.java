package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ByUsingCrossBrowser {
	
	@Parameters("BROWSER")
	@Test
	public void fb(String browser) {
		WebDriver driver=null;
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
        System.out.println("Facebook");
        
        driver.quit();
	}
	
	@Parameters("BROWSER")
	@Test
	public void paytm(String browser) {
		WebDriver driver=null;
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://paytm.com/");
        System.out.println("paytm");
        driver.quit();
	}
	
	@Parameters("BROWSER")
	@Test
	public void swiggy(String browser) {
		WebDriver driver=null;
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.swiggy.com/");
        System.out.println("swiggy");
        driver.quit();
	}
	
	@Parameters("BROWSER")
	@Test
	public void zomato(String browser) {
		WebDriver driver=null;
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.zomato.com/");
        System.out.println("zomzto");
        driver.quit();
	}
		
}
