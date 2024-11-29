package poiapi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String getCellValue(String filePath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        // Open the Excel file
        FileInputStream fis = new FileInputStream(filePath);
        
        // Create a Workbook instance
        Workbook workbook = new XSSFWorkbook(fis);

        // Get the desired sheet from the workbook
        Sheet sheet = workbook.getSheet(sheetName);

        // Get the desired row and cell
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);

        // Extract the cell value as a string
        String cellValue = cell.toString();

        // Close the workbook and input stream
        workbook.close();
        fis.close();

        return cellValue;
    }

    public static void main(String[] args) throws IOException {
        // Example usage
        String filePath = "path_to_your_excel_file.xlsx";
        String sheetName = "Sheet1";
        int rowNumber = 0; // Row index (0-based)
        int cellNumber = 0; // Cell index (0-based)

        String cellValue = getCellValue(filePath, sheetName, rowNumber, cellNumber);
        System.out.println("The value in the cell is: " + cellValue);
    }
}
