package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Runtime_Object_behaviour_Enabled {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * 	TestCase:-->
		 *	Given site url is "https://v1.hdfcbank.com/branch-atm-locator"
		 *	Verify Locality editbox disabled before selection of state
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement Locality_Editbox=driver.findElement(By.xpath("//input[@id='customLocality']"));
		if(!Locality_Editbox.isEnabled())
		{
			System.out.println("TEstpass, As expected locality editbox is disabled before selection of state and city");
		}
		else
		{
			System.out.println("Tetfail, Locality editbox is enabled before selection of state and city");
		}
		
		
		//State selection
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='customState']"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		Thread.sleep(5000);
		
		//City Selection
		WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		new Select(City_Dropdown).selectByVisibleText("Hyderabad");
		Thread.sleep(3000);
		
		if(Locality_Editbox.isEnabled())
			System.out.println("Tetpass, Locality editbox is enabled after selection of state and city");
		else
			System.out.println("Testfail, Locality editbox is disabled after selection of state and city");
		
		
		

	}

}
