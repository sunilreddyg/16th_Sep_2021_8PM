package chrome_options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Set_Download_Directory {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "D:\\new_Downlods");
		
		options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		
		
		driver.findElement(By.xpath("(//a[contains(.,'4.0.0')])[1]")).click();
		

	}

}
