package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Capture_Screen_on_Location {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		
		WebElement Login_form=driver.findElement(By.xpath("//div[contains(@class,'gr27e  ')]"));
		File src=Login_form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\image1.png"));
		

	}

}
