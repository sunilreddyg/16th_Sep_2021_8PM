package framework.Datadriven.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_into_Propertyfiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Create object for property files
		Properties obj=new Properties();
		obj.setProperty("Tc001", "TestPass");
		obj.setProperty("Tc002", "TestPass");
		obj.setProperty("Tc003", "Testfail");
		obj.setProperty("Tc004", "TestPass");
		
		String Ofilepath="src\\framework\\Datadriven\\PropertyFiles\\Output.properties";
		FileOutputStream fo=new FileOutputStream(Ofilepath);
		obj.store(fo, "Login Test Result");

	}

}
