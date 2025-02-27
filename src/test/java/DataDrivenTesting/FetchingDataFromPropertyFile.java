package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step1 :Convert the physical prop file into java obj
		FileInputStream fis =new FileInputStream("./src/test/resources/CommonData.properties");
		
		//step2 : create a obj of properties
		Properties p = new Properties();
		
		//step3: load the prop obj from obj
		p.load(fis);
		
		
		
		//step4 : fetch the data from prop file
		System.out.println(p.getProperty("FirstName"));
		System.out.println(p.getProperty("Lastname"));
		System.out.println(p.getProperty("phoneNumber"));
		System.out.println(p.getProperty("Place"));
	}

}
