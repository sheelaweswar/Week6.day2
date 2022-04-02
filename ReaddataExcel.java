package Week6.day2;

import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataExcel {
public static String[][] getExcelData() throws IOException {
	//step1 connect the path with this method
	XSSFWorkbook wb = new XSSFWorkbook("./exceldata/seleniumreaddata.xlsx");
	//step2 wb.getsheetAt(0)
	XSSFSheet sheet = wb.getSheet("Sheet1");
	//get the row
	int lastRowNum = sheet.getLastRowNum();
	XSSFRow row = sheet.getRow(2);
	System.out.println(lastRowNum);
	//get column
	int lastcellNum = row.getLastCellNum();
	XSSFCell cell = row.getCell(2);
	System.out.println(lastcellNum);
	System.out.println("cell val:"+cell.getStringCellValue());
	
	/*for(int i=0;i<=lastRowNum;i++) {
		XSSFRow cell2 = sheet.getRow(i);
		for(int j=0;j<lastcellNum;j++) {
			XSSFCell cell3 = cell2.getCell(j);
			String cellValue = cell3.getStringCellValue();
			System.out.println(cellValue);
		}
	}*/
	String[][] data = new String[lastRowNum][lastcellNum];
	for(int i=1;i<=lastRowNum;i++) {
		for(int j=0;j<lastcellNum;j++) {
			row = sheet.getRow(i);
			cell = row.getCell(j);
			String stringcellval = cell.getStringCellValue();
			System.out.println(stringcellval);
			data[i-1][j] = stringcellval;
		}
	}
	wb.close();
	return data;
	
}
}
