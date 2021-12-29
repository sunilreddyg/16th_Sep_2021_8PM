package framework.Datadriven.Excel;

import java.io.FileInputStream;

public class Read_File_With_TryCatch {

	public static void main(String[] args) {
		
		
		FileInputStream fi;
		try {
			fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file is located");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
