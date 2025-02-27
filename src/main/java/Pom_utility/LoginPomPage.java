package Pom_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {

	//Declaration
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pswd;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(xpath="//h2")
	private WebElement header;
	
	//Initialization
	public LoginPomPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getUn() {
		return un;
	}

	public void getPswd(String pass) {
		pswd.sendKeys(pass);
	}

	public void getLogin() {
		login.click();
	}

	public String getHeader() {
		return header.getText();
	}
	
	
}
