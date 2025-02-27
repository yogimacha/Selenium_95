package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Enableed_Flag {

	
		@Test(priority = 2,enabled = false)
		public void cat() {
			Reporter.log("Meyam",true);
		}
		@Test(priority = 1)
		public void dog() {
			Reporter.log(" bav..bav..",true);
		}
		@Test(priority = 4)
		public void cow() {
			Reporter.log("Ammbaaa...",true);
		}
		@Test(priority = 3)
		public void goat() {
			Reporter.log("may...",true);
		}
}

