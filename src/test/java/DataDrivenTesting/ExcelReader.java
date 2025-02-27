package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        // Path to the Excel file
        String filePath = "C:\\Users\\yoges\\Desktop\\Fblogin.xlsx";

        // Load the file
        FileInputStream file = new FileInputStream(new File(filePath));

        // Open workbook
        Workbook workbook = WorkbookFactory.create(file);

        // Get first sheet
        Sheet sheet = workbook.getSheetAt(0);

        // Loop through rows and columns
        for (Row row : sheet) {
            for (Cell cell : row) {
                // Print cell value
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print(" \t");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Close resources
        workbook.close();
        file.close();
    }
}
