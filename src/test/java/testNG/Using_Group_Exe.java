package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Group_Exe {
	@Test(groups = "fruits" )
	public void orange() {
		Reporter.log("orange",true);
	}
	@Test(groups = "fruits" )
	public void grapes() {
		Reporter.log("Grapes",true);
	}
	@Test(groups = "fruits" )
	public void apple() {
		Reporter.log("Apple",true);
	}
	@Test(groups = "veg" )
	public void potato() {
		Reporter.log("Fry",true);
	}
	@Test(groups = "veg")
	public void chilli() {
		Reporter.log("Hot",true);
	}
	@Test(groups = "veg")
	public void tamato() {
		Reporter.log("pikkle",true);
	}
	@Test(groups = "flowers")
	public void Rose() {
		Reporter.log("Red",true);
	}
	@Test(groups = "flowers")
	public void Sunflower() {
		Reporter.log("yellow",true);
	}
	
}
