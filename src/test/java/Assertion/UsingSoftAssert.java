package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class UsingSoftAssert {

	@Test
	public void softAssert() {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");
        
        String title=driver.getTitle();
        
        
        //SoftAssert
        SoftAssert soft = new SoftAssert();
        
        soft.assertEquals(title, "Facebook – log in or sign up");
        System.out.println("Title is Same");
        
        boolean url=driver.getCurrentUrl().contains("https://www.facebook.com/");
        
        //soft Assert fail
        soft.assertEquals(url, "https://www.facebook.com/");
        System.out.println("Url is verified");
        
        
        soft.assertTrue(url);
        
        soft.assertFalse(url);

        driver.quit();
        
        soft.assertAll();
        
	}

}