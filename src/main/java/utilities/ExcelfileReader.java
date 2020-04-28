package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfileReader {
	
	/**
	* Author: Amaresh
	*
	* Reading value from excel according to column name
	*
	*/
	
	
	public static String excelreader(String path, String Sheetname, String value) throws IOException {
		String returnvalue=null;
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook workbook = new XSSFWorkbook(fis);
		int numberOfSheets = workbook.getNumberOfSheets();
		System.out.println(numberOfSheets);

		Sheet sheet = workbook.getSheet(Sheetname);

		Iterator<Row> rows = sheet.iterator();
		if (rows.hasNext()) {
			
			Row firstrow = rows.next();
			Iterator<Cell> cellIterator = firstrow.cellIterator();
			if (cellIterator.hasNext()) {
				String cellvalue = cellIterator.next().getStringCellValue();
				if (cellvalue.equalsIgnoreCase(value)) {

					Cell actualusername = rows.next().cellIterator().next();

					// System.out.println(actualusername.getStringCellValue());
					returnvalue = actualusername.getStringCellValue();
					
				}
			}
		}
		
		return returnvalue;
	}

	
}
