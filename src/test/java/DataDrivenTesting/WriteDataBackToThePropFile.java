package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataBackToThePropFile {

	public static void main(String[] args) throws IOException {
		//Step1 :Convert the physical prop file into java obj
		FileInputStream fis =new FileInputStream("./src/test/resources/FacebookLogin");
		
		//step2 : create a obj of properties
		Properties p = new Properties();
		
		//step3: load the prop obj from obj
		p.load(fis);
		
		//writing data back to prop obj
		p.put("Animal", "Cat");
		
		//save prop file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/FacebookLogin");
		p.store(fos, "updated Successfully");
		
	}

}
