package pageobjects.RunPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.FB_HOME;

public class Run_FB_homepage {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		FB_HOME home=PageFactory.initElements(driver, FB_HOME.class);
		home.Login_email.sendKeys("Darshan");
		home.Login_password.sendKeys("Darsh123");
		home.Login_submit_button.click();
		
		
		home.enterusername("9030248855");
		home.enterpassword("Hello123");
		home.clickloginbutton();
		
		
		home.userlogin("","Hello123");
		
		
		
		

	}

}
