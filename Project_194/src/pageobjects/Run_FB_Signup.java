package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.Pages.FB_HOME;
import pageobjects.Pages.FB_Signup;

public class Run_FB_Signup {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		FB_HOME home=PageFactory.initElements(driver, FB_HOME.class);
		home.Create_new_account.click();
		Thread.sleep(3000);
		
		FB_Signup signup=PageFactory.initElements(driver, FB_Signup.class);
		signup.Firstname.sendKeys("Arjun");
		signup.Surname.sendKeys("Kumar");
		signup.Email_or_Mobile.sendKeys("info@gmail.com");
		Thread.sleep(3000);
		signup.Email_or_Mobile.sendKeys("info@gmail.com");
		
		
	}

}
