package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Convert physical file into java object
				FileInputStream fis=new FileInputStream("C:\\Users\\yoges\\Desktop\\Fblogin.xlsx");
				
				//Create workbook/fetch the workbook
				Workbook wb = WorkbookFactory.create(fis);
				
				//Fetch the sheet
				Sheet sh =wb.getSheet("fblogin");
				
				for (int i = 1; i <=sh.getLastRowNum(); i++) {
					System.out.println(sh.getRow(i).getCell(2).getStringCellValue());
					
				}
				wb.close();
	}

}
