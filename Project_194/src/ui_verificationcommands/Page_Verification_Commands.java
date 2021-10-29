package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		//get current window title
		String page_title=driver.getTitle();
		System.out.println("Current window titles is --> "+page_title);
		
		//get Current window url
		String page_url=driver.getCurrentUrl();
		System.out.println("Current window url is ---> "+page_url);
		
		//Get Current window Dynamic ID 
		String WindowID=driver.getWindowHandle();
		System.out.println("Current window id is ---> "+WindowID);
		
		//Get Currnet Page Soure
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
