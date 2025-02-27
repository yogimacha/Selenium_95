package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FbLoginUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Convert physical file into java object
		FileInputStream fis=new FileInputStream("C:\\Users\\yoges\\Desktop\\Fblogin.xlsx");
		
		//Create workbook/fetch the workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the sheet
		Sheet sh =wb.getSheet("fblogin");
		
		//fetch the Row
		Row r = sh.getRow(1);
		
		//fetch the cell
		Cell c =r.getCell(0);
		
		//fetch the data
		String data =c.getStringCellValue();
		
		System.out.println(data);
		
	}

}
