package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize_BeforeLaunch {

	public static void main(String[] args) throws Exception {
		
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");  //This property maximize browser on start
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://bridgeqsystems.com/demo.php");
		Thread.sleep(4000);

	}

}
