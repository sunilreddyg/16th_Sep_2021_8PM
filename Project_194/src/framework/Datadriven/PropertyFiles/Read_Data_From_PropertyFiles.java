package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException
	{
		
		
		FileInputStream fi=new FileInputStream("src\\framework\\Datadriven\\PropertyFiles\\Input.properties");
		System.out.println("File is located");
		
		
		//Create object for properties
		Properties repository=new Properties();
		repository.load(fi);  //This sytax load all input data to property files
		
		
		//Get Value Using keyname
		String Appurl=repository.getProperty("application.url");
		System.out.println(Appurl);
		
		
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		
	}

}
