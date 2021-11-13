package capturescreen;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_ScrollToView {

	public static void main(String[] args) throws Exception 
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		//Using javascript bringing object to veiw
		WebElement FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", FooterArea);
		Thread.sleep(2000);
		
		
		File src=FooterArea.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\image3.png"));
		
		
		
		
		
	}

}
