package mq.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		

	}

}
