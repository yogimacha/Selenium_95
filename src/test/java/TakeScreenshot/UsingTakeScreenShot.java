package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jiomart.com/");
		
		
		//Typecast takesscreenshot(i) with driver ref.v
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//take screenshot and store temp file
		File tsrc = ts.getScreenshotAs(OutputType.FILE);
		
		//Create a empty file
		File dest=new File("./Image/JioMart.png");
		
		//Copy the screenshot in empty file
		FileUtils.copyFile(tsrc, dest);
		
		driver.quit();
		
	}

}
