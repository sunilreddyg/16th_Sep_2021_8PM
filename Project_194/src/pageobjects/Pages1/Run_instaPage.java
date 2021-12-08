package pageobjects.Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_instaPage {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		
		
		Inst_Signup obj=new Inst_Signup(driver);
		obj.Username_or_mobile.sendKeys("9030248855");
		obj.Fullname.sendKeys("Newuser");
	}

}
