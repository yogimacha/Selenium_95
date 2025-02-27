package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGettersMethods {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	

	WebElement register = driver.findElement(By.linkText("Register"));
	
	
	
	System.out.println(register.getText());//Fetch the text
	
	System.out.println(register.getAttribute("class"));//Fetch the attribute value
	
	System.out.println(register.getTagName());//Fetch the tagName
	
	System.out.println(register.getSize());//Fetch the Size
	
	System.out.println(register.getLocation());//Fetch the location
	
	System.out.println(register.getRect());//Fetch the Location and Size

	System.out.println(register.getCssValue("color"));// Fetch the CSS Value
	

	
	
}

}
