package Popups;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		
		//Click on Element using Action Class
		WebElement upload = driver.findElement(By.id("file-upload"));
		
		Actions a = new Actions(driver);
		a.moveToElement(upload).click().build().perform();
		
		
		
		Thread.sleep(3000);
		
		//Copy the file path
		StringSelection s = new StringSelection("C:\\Users\\yoges\\Desktop\\HtmlLogin.html");
		
		//Clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();		
		Thread.sleep(5000);
		
		//driver.quit();
		
		
	}

}
