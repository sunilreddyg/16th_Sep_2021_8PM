package mq.selenium.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Link_Using_LinkText_Locator {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.linkText("Locations")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("India")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Delhi")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.partialLinkText("The Park New Delhi")).click();
	Thread.sleep(5000);
	
	
	
	}

}
