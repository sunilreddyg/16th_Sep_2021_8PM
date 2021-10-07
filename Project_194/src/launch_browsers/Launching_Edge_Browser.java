package launch_browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Edge_Browser {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Inorder to launch edge browser we need to download msedgedriver.exe 
		 * file and need to setup into environment variable
		 * 
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find browsers and click on It
		 * 		=> Under edge browser click on documentation
		 * 		=> Downlaod edgedriver w.r.t edge browser version
		 * 		=> Selected Windows file
		 * 	
		 */
		
		
		//Setting runtime environment variable to use perticular edge browser driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\msedgedriver.exe");
		
		//Launching edge browser
		EdgeDriver edge=new EdgeDriver();
		
		//Typing url at edge browser
		edge.get("http://facebook.com");
		
		//Pause execution for 5 seconds
		Thread.sleep(5000);
		
		//CLose active automation browser
		edge.close();

	}

}
