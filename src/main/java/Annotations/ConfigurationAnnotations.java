package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ConfigurationAnnotations {
    @BeforeSuite
    public void BS()
    {
    	System.out.println("");
    }
    @AfterSuite
    public void AS()
    {
    	
    }
    @BeforeTest
    public void BT()
    {
    	
    }
    @AfterTest
    public void AT()
    {
    	
    }
    @BeforeClass
    public void BC()
    {
    	
    }
    @AfterClass
    public void AC()
    {
    	
    }
    @BeforeMethod
    public void BM()
    {
    	
    }
    @AfterMethod
    public void AM()
    {
    	
    }
    
	
}
