package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		
		//Capture screen and convert into output file
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create new folder in local driver
		FileHandler.createDir(new File("screens"));
		//Copy screen to new file 
		FileHandler.copy(src, new File("screens\\image.png"));

	}

}
