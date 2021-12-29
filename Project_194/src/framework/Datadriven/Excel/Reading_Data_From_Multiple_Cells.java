package framework.Datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data_From_Multiple_Cells {

	public static void main(String[] args) throws IOException {
		
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(3);
		
		//Target Required Row
		XSSFRow row=sht.getRow(1);
		
		//Get First and Last Cell Data number
		int Fcnum=row.getFirstCellNum();
		int Lcnum=row.getLastCellNum();
		
		System.out.println("Cell Number whrere date started is --> "+Fcnum);
		System.out.println("Lest Number number where data exist is --> "+Lcnum);
		
		for (int i = Fcnum+1; i < Lcnum; i++) 
		{
			  String Names_From_CSE=row.getCell(i).getStringCellValue();
			  System.out.println(Names_From_CSE);
		}
				

	}

}
