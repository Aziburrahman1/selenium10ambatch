package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws IOException {
        //converting the physical representation of excel sheet into java representation
		FileInputStream fis = new FileInputStream("./testData/ExcelData10AM.xlsx");
		//loading the excel sheet
		Workbook workbook = WorkbookFactory.create(fis);
		//accessing the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		//accessing the row
		Row row = sheet.getRow(1);
		//accessing the cell
		Cell cell = row.getCell(0);
		//we converting the cell type of object to string type of object
		String url = cell.getStringCellValue();
		
		String username = row.getCell(1).getStringCellValue();
		String password = row.getCell(2).toString();    // instead of using toString() method we can use getStringCellValue()..just for learning purpose
		//Printing the values in the console
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}

}
