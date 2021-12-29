package framework.Datadriven.Excel.CellTypes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumerToText_Converted 
{

	public static void main(String[] args) throws IOException {
		//Target file 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheetAt(1);
		
		//Get Required row using sheet
		XSSFRow row=sht.getRow(1);
		
		
		//Get Numeric Cell Data
		double mobile_in_dble_frmt=row.getCell(5).getNumericCellValue();
		System.out.println(mobile_in_dble_frmt);
		
		//Convert Double into text value
		String mobile_in_text_Frmt=NumberToTextConverter.toText(mobile_in_dble_frmt);
		System.out.println(mobile_in_text_Frmt);

	}

}
