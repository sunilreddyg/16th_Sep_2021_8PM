package mq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Array_With_CrossBrowser_Test {

	public static void main(String[] args) 
	{
	
		String browsername[]= {"chrome","firefox"};
		
		WebDriver driver=null;
		for (int i = 0; i < browsername.length; i++) 
		{
			String browser = browsername[i];
			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\SUNIL\\Desktop\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.get("http://facebook.com");
			System.out.println(driver.getTitle());
		}

	}

}
