package mq.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Program_With_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		//Click on button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type text into editbox
		driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("sunilreddy.gajjala@outlook.com");
		
		//Click Button
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		
		//Type Text into password field
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Arjin123");
		
		
		
	}

}
