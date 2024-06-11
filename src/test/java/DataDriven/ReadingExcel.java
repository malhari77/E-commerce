package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingExcel {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// Location of file
		
		String excelfilepath = ".\\DataFiles\\Contries.xlsx";
		
		// Read data from excel
		
		FileInputStream inputstream = new FileInputStream(excelfilepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook()
		
	}

}
