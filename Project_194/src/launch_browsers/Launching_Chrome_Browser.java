package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome_Browser 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Inorder to launch chrome browser we need to download chromedriver.exe 
		 * file and need to setup into environment variable
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find browsers and click on It
		 * 		=> Under chrome browser click on documentation
		 * 		=> Find chrome browser version
		 * 				Nav:--> setting --> Help --> About google chrome
		 * 		=> Download chromedriver w.r.t chrome browser version
		 * 		=> click on chromdriver version, it navigate to index page
		 * 		=> Select operating system windows and click to download
		 * 		=> Save Zip format file into back up folder
		 * 		=> Unzip file , It gives chromedriver.exe file
		 * 		=> Setup Runtime Environment variable before launch chrome browser
		 */
		
		
		//Setting runtime environment variable to use perticular chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		
		//Launching chrome browser
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		
		//Pause execution for 5 seconds
		Thread.sleep(5000);
		
		//Close browser
		chrome.close();
		
	}

}
