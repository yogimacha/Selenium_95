package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginUsingDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		//Step1 :Convert the physical prop file into java obj
				FileInputStream fis =new FileInputStream("./src/test/resources/FacebookLogin");
				
				//step2 : create a obj of properties
				Properties p = new Properties();
				
				//step3: load the prop obj from obj
				p.load(fis);
				
				//step4 : fetch the data from prop file
				String url=(p.getProperty("URL"));
				String un=(p.getProperty("UN"));
				String pwd=(p.getProperty("PWD"));
				String time=(p.getProperty("TIME"));
						
						
				long wait = Long.parseLong(time);	
				// Lunch Driver
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Navigate to an URL
				driver.get(url);
				
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));

				//Identify UN TextField and pass the text
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
				
				//Identify UN TextField and pass the text
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
						
	}

}
