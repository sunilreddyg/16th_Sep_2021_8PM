package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_Title {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		
		if(driver.getTitle().equals("Instagram"))
		{
			System.out.println("instagram title verified");
			
				//Clicking link
				driver.findElement(By.linkText("Locations")).click();
				
				if(driver.getTitle().contains("Locations"))
				{
					System.out.println("Location Title verified");
				}
				else
				{
					System.out.println("Location title is mismatched");
				}
		}
		else
		{
			System.out.println("Title mismatch for instagram page");
		}
		
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
