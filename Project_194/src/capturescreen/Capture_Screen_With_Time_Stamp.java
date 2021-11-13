package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_With_Time_Stamp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		//Using javascript bringing object to veiw
		WebElement FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", FooterArea);
		Thread.sleep(2000);
		
		//Get System Default time
		Date d=new Date();
		//Create simple dateformat
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd-hh-mm-ss");
		//Convert system date using simple date format
		String time=sdf.format(d);
		
		File src=FooterArea.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\footer"+time+".png"));
		
		

	}

}
