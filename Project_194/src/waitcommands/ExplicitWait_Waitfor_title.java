package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Waitfor_title {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.titleIs("Selenium"));
			System.out.println("Title is presented");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		WebElement Download_link=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_link.click();
		
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(50))
			.until(ExpectedConditions.titleContains("Downloads"));
			System.out.println("Download page title is verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
