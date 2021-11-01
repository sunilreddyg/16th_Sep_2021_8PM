package ui_verificationcommands.GetText;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Selected_Option_Available_At_Dropdown {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/country-state-city-example-cascading-jquery-dependent-dropdown/");
	    driver.manage().window().setSize(new Dimension(783, 728));
	    
	    
	    new Select(driver.findElement(By.xpath("//select[contains(@id,'country-list')]")))
	    .selectByVisibleText("USA");
	    Thread.sleep(4000);
	    
	    String Exp_state="California";
	    
	    
	    WebElement State_Dropdown=driver.findElement(By.xpath("//select[@id='state-list']"));
	    if(State_Dropdown.getText().contains(Exp_state))
	    {
	    	new Select(State_Dropdown).selectByVisibleText(Exp_state);
	    	Thread.sleep(4000);
	    }
	    else
	    {
	    	System.out.println("Expected State not found");
	    }
	    
	    
	    String Exp_city="Oakland";
	    WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='city-list']"));
	    if(City_Dropdown.getText().contains(Exp_city))
	    {
	    	new Select(City_Dropdown).selectByVisibleText(Exp_city);
	    }
	    else
	    {
	    	System.out.println("Expected city not found");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
