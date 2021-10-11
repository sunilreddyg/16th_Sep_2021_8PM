package mq.selenium.Textbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		//Click on button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//TypeText into Editbox and press Enter key
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@gmail.com"+Keys.ENTER);
		
		//Typetext into Editbox and press Enter key
		driver.findElement(By.xpath("//input[@type='password']"))
		.sendKeys("hello123"+Keys.ENTER);
		
		

	}

}
