package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//  Excel file ----> workbook ---> sheet ---> Rows ---> cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException 
	{
		// FileInputStream file = new FileInputStream("D:\\Malhari_Automation\\Maven\\E-commarce\\Testdata\\Data.xlsx");
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\\\Data.xlsx");
		
		// reading workbook 
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		// reading sheet
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFSheet sheet = workbook.getSheetAt(0);     //  index of sheet
		
		
		int totalrows =sheet.getLastRowNum();
		
		int totalcell = sheet.getRow(1).getLastCellNum();
		
		
		System.out.println("number of Rows:"+totalrows);    //5
		System.out.println("number of Cells:"+totalcell);   //4	
		
		for(int r=0;r<=totalrows; r++)
		{
			XSSFRow currentrow =sheet.getRow(r);

			for(int c=0;c<totalcell;c++) 
			{
				XSSFCell currentcell =currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			}
			
			System.out.println();
		}
		workbook.close();
		file.close();	
	}

}
