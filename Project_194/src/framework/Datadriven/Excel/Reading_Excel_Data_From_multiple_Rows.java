package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel_Data_From_multiple_Rows 
{
	
	public static void main(String[] args) throws IOException {
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(2);
		
		
		//Get FirstRow and Lastrow of cell data
		int FRnum=sht.getFirstRowNum();
		System.out.println("Data started at row number is --> "+FRnum);
		
		int LRnum=sht.getLastRowNum();
		System.out.println("End Row number is --> "+LRnum);
		
		
		//Applying for loop iterate exepcted number of times
		for (int i = 1; i <= LRnum; i++) 
		{
			
			  //Get Dynamic Row and Static cell data
			  String UID=sht.getRow(i).getCell(0).getStringCellValue();
			  String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			  
			  System.out.println(UID+"    "+PWD);
		}
		
		
	}


}
