package framework.Datadriven.Excel.Excel_Keywords;

public class Run_Excel_keywords {

	public static void main(String[] args) 
	{
		
		
		Excel_Keywords.ConnectTo_Excel_Workbook("Sheet3");
		
		for (int i = 1; i < Excel_Keywords.get_rowcount(); i++) 
		{
			String UID=Excel_Keywords.get_cellData(i, 0);
			System.out.println(UID);
			
			Excel_Keywords.Write_CellData(i, 2, "TestPass");
		}
		Excel_Keywords.Close_workbook();
	}

}
