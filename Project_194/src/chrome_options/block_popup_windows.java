package chrome_options;

import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class block_popup_windows {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		System.out.println("Site is up and ready to use..");
		
		

	}

}
