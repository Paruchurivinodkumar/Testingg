package poiapi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main(String[] args) throws IOException {
		File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Vin.xlsx");
		FileInputStream fil=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Basic");
		int rows=sheet.getLastRowNum()+1;
		int columns=sheet.getRow(0).getLastCellNum();
		System.out.println(rows + "  "+columns);
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columns;j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue = cell.toString();
				System.out.print(cellvalue+"    ");
				//CellType celltype = cell.getCellType();
				
				
				/*switch (celltype) {
				case NUMERIC: {
					System.out.print(cell.getNumericCellValue()+"    ");
					break;
				}
				case STRING:{
					System.out.print(cell.getStringCellValue()+"   ");
					break;
				}
				case BOOLEAN:{
					System.out.print(cell.getBooleanCellValue()+"   ");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + cell);
				}
				
			}*/
			
		}
			System.out.println("    ");
		}
		
	

	}

}
