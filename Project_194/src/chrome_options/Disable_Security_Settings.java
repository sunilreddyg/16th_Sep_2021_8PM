package chrome_options;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_Security_Settings {

	public static void main(String[] args) {
		
		 HashMap<String, Object> prefs = new HashMap<String, Object>();
		 prefs.put("profile.default_content_settings.cookies", 0);
		 ChromeOptions options = new ChromeOptions();
		 options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
	}

}
