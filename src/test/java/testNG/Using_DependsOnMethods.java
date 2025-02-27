package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_DependsOnMethods {
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("loged",true);
		//Assert.fail();
	}
	@Test
	public void register() {
		Reporter.log("regesterd",true);
		//Assert.fail();
	}
	@Test(dependsOnMethods = "login")
	public void create() {
		Reporter.log("created",true);
		//Assert.fail();
	}

}
