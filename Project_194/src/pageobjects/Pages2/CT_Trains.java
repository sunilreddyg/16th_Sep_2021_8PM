package pageobjects.Pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CT_Trains 
{
	WebDriver driver;

	public CT_Trains(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver; //this assignment allow to use driver reference in current class
	}
	
	
	public String Exp_title="IRCTC Indian Railways Train Reservation | IRCTC Train Tickets Online Booking at Cleartrip.com";
	
	
	
	@FindBy(xpath = "//input[@id='from_station']")
	public WebElement FromStation;
	
	
	@FindBy(xpath="//input[@id='to_station']")
	public WebElement ToStation;
	

	
	public void verify_title_presented()
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.equals(Exp_title);
		System.out.println(flag);
		
	}

}
