package chrome_options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_Headless_browser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://bridgeqsystems.com/demo.php");
		Thread.sleep(4000);
		
		System.out.println("browser is up and running");
		
		System.out.println(driver.getTitle());
		
		

	}

}
