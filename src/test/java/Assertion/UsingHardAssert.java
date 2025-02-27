package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {
	
	@Test
	public void hardAssert() {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
        
        String title=driver.getTitle();
        
        //Hard Assert
        Assert.assertEquals(title, "Facebook – log in or sign up");
        
        System.out.println("Verification Pass");
        
        //
        boolean url=driver.getCurrentUrl().contains("https://www.facebook.in/");
        
        //Hard Assert fail
        Assert.assertEquals(url, "https://www.facebook.in/");
        System.out.println("Verification Pass");
        
        
        Assert.assertTrue(url);
        
        driver.quit();
	}
}
