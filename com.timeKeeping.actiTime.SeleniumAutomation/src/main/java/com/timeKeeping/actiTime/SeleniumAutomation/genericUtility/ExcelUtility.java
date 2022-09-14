package com.timeKeeping.actiTime.SeleniumAutomation.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Azibur Rahman
 *
 */

public class ExcelUtility {
	/**
	 * This method fetch data from Excel file
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws IOException
	 */
	  //For customerName and Description 
     //This method is to set the File path and to open the Excel file,
	 //Pass Excel path and SheetName as arguments to this method
	public String fetchDataFromExcelSheet(String sheetName,int rowNo,int cellNo ) throws IOException 
	{   //Converting the physical representation of excel sheet into java representation
		//Open Excel file
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/ExcelData10AM.xlsx");
		//Loading the Excel sheet
		Workbook workbook = WorkbookFactory.create(fisExcel);
		//accessing the sheet
		Sheet sheet = workbook.getSheet(sheetName);
		//accessing the row and the cell and converting the  cell type of object to string type of object
		//and returning it
		return sheet.getRow(rowNo).getCell(cellNo).toString();
	}
}
