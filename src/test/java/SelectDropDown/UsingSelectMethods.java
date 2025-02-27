package SelectDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectMethods {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to url
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(15000);
		
		//identify the dropdown
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		//create an instance of select class
		Select s= new Select(dropdown);
		
		//select option based on the index
		s.selectByIndex(8);
		
		//select option based on the value
		s.selectByValue("search-alias=pets-intl-ship");
		
		//select option based on the visible text
		s.selectByVisibleText("Pet Supplies");
		
		//check whether the dd is single/multi select dd
		System.out.println(s.isMultiple());
		
		//fetch all the options
		List<WebElement> list=s.getOptions();
		for(WebElement ele:list)
		{
			System.out.println("Options:" +ele.getText());
			
		}
		
		//fetch the first selected option
		System.out.println("First selected option:"+s.getFirstSelectedOption().getText());
		
		//fetch all the elements
		List<WebElement> selected=s.getAllSelectedOptions();
		for(WebElement ele: selected) {
			System.out.println("All selected options:"+ele.getText());
		}
		
		driver.quit();	
		
	}

}
