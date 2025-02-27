package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;
import java.util.List;


public class ExcelUtils {

    public static List<String[]> readExcel(String filePath, String sheetName) throws IOException {
        List<String[]> data = new ArrayList<>();
        FileInputStream file = new FileInputStream("C:\\Users\\yoges\\Desktop\\Fblogin.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet(sheetName);
        
        for (Row row : sheet) {
            int cellCount = row.getLastCellNum();
            String[] rowData = new String[cellCount];
            for (int i = 0; i < cellCount; i++) {
                Cell cell = row.getCell(i, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                rowData[i] = cell.toString();
            }
            data.add(rowData);
        }
        workbook.close();
        return data;
    }
}

