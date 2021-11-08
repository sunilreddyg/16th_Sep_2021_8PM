package switch_Commands.ActiveElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/free-job-alerts");
		Thread.sleep(5000);
		
		//Switch to active element and type text init
		driver.switchTo().activeElement().sendKeys("darshan@gmail.com");
		

	}

}
