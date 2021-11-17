package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Example_Desired_Capabilities {

	public static void main(String[] args) {
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setJavascriptEnabled(true);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");


	}

}
