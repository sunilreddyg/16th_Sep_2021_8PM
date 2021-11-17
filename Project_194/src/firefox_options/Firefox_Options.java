package firefox_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Options {

	public static void main(String[] args) {
	
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("http://google.com");
		
		

	}

}
