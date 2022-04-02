package Week6.day2;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcelDynamic {
	
	public static String[][] getExcelData(String fileName) throws IOException {
		System.out.println(fileName);
		//step1 connect the path with this method
		XSSFWorkbook wb = new XSSFWorkbook("./exceldata/"+fileName+".xlsx");
		//step2 wb.getsheetAt(0)
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//get the row
		int lastRowNum = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(1);
		//get column
		int lastcellNum = row.getLastCellNum();
		System.out.println("Column Count" + lastcellNum);
		
		String[][] data = new String[lastRowNum][lastcellNum];
		for(int i=1;i<=lastRowNum;i++) {
			for(int j=0;j<lastcellNum;j++) {
				String stringcellval = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringcellval);
				data[i-1][j] = stringcellval;
			}
		}
		wb.close();
		return data;	
	}
}

