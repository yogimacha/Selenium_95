package Pom_Facebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom_utility.LoginPomPage;

public class Pom_FB_Login {

	public static void main(String[] args) throws IOException {
				// Lunch Driver
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				FileInputStream fis= new FileInputStream("./src/test/resources/FacebookLogin");
				
				Properties p=new Properties();
				p.load(fis);
				
				String url=p.getProperty("URL");
				String un=p.getProperty("UN");
				String pwd=p.getProperty("PWD");
				
				LoginPomPage log =new LoginPomPage(driver);
				
				driver.get(url);
				
				log.getUn().sendKeys(un);
				log.getPswd(pwd);
				log.getLogin();
				
				driver.quit();
	}

}
