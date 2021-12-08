package pageobjects.Pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inst_Signup 
{

	public Inst_Signup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(xpath = "//input[contains(@name,'emailOrPhone')]")
	public WebElement Username_or_mobile;

	@FindBy(xpath = "//input[contains(@name,'fullName')]")
	public WebElement Fullname;
	
	@FindBy(xpath = "//input[contains(@name,'username')]")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement Password;
	
	@FindBy(xpath = "//button[contains(.,'Sign Up')]")
	public WebElement Singup;
}
