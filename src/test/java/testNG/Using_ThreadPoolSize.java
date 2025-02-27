package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_ThreadPoolSize {
	@Test(threadPoolSize = 2,invocationCount = 3)
	public void cat() {
		Reporter.log("Meyam",true);
	}
	@Test(threadPoolSize = 4,invocationCount = 2)
	public void dog() {
		Reporter.log(" bav..bav..",true);
	}
	@Test(threadPoolSize = 5,invocationCount = 10)
	public void cow() {
		Reporter.log("Ammbaaa...",true);
	}
	@Test()
	public void goat() {
		Reporter.log("may...",true);
	}
}
