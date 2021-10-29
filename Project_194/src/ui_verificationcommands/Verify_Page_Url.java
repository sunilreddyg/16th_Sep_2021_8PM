package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Url {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("browser opened with secured protocal");
			
			//Clicking link
			driver.findElement(By.linkText("Locations")).click();
			
			//Click locations link
			if(driver.getCurrentUrl().contains("explore/locations/"))
			{
				System.out.println("Navigated to location page");
			}
			else
			{
				System.out.println("navigation failed for location page");
			}
		}
		else
		{
			System.out.println("browser opened with insecure protocal");
		}
		

	}

}
