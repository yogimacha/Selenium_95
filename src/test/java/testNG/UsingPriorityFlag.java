package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsingPriorityFlag {
	@Test(priority = 2)
	public void m1() {
		Reporter.log("Start chae raaa",true);
	}
	@Test(priority = 1)
	public void m2() {
		Reporter.log(" Evadra vedu",true);
	}
	@Test(priority = 3)
	public void m3() {
		Reporter.log("Elavunnadu entraa",true);
	}
	@Test(priority = 4)
	public void m0() {
		Reporter.log("Porarai",true);
	}
}
