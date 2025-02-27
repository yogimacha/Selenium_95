package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		WebElement icon = driver.findElement(By.xpath("//img[@alt=\"JioMart\"]"));
		
		
		
		File temp=icon.getScreenshotAs(OutputType.FILE);
		
		//Create a empty file
		File newfile=new File("./Image/JioMartLogo.png");
		
		FileUtils.copyFile(temp, newfile);
		
		driver.quit();
		}

}
