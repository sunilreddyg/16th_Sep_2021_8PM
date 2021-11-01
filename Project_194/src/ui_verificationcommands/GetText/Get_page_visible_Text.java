package ui_verificationcommands.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_page_visible_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at error location
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Singin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Singin_button.click();
		
		
		//Type Invalid email
		WebElement Email_Textbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_Textbox.clear();
		Email_Textbox.sendKeys("info3efdf@gmail.com"+Keys.ENTER);
		Thread.sleep(5000);
		
		//Identify
		String Page_VisbleText=driver.findElement(By.tagName("body")).getText();
		//System.out.println(Page_VisbleText);
		
		
		String Exp_text1="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		String Exp_text2="Sign in";
		
		
		if(Page_VisbleText.contains(Exp_text1))
			System.out.println("Error message is displayed");
		else
			System.out.println("Error message is not displayed");
		
		
		if(Page_VisbleText.contains(Exp_text2))
			System.out.println("Header message is displayed");
		else
			System.out.println("header message is not displayed");
		
		
		
		
		
		

	}

}
