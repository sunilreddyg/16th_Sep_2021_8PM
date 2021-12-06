package pageobjects.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_HOME 
{
	
	
	@FindBy(xpath="//input[@id='email']") 
	public WebElement Login_email;
	
	@FindBy(xpath="//input[@data-testid='royal_pass']")
	public WebElement Login_password;
	
	@FindBy(xpath = "//button[@data-testid='royal_login_button']")
	public WebElement Login_submit_button;
	
	
	@FindBy(linkText="Forgotten password?")
	public WebElement Forgotten_password;
	
	
	@FindBy(xpath = "//a[contains(.,'Create New Account')]")
	public WebElement Create_new_account;
	
	
	
	public void enterusername(String uid)
	{
		Login_email.sendKeys(uid);
	}
	
	public void enterpassword(String pwd)
	{
		Login_email.sendKeys(pwd);
	}
	
	
	public void clickloginbutton()
	{
		Login_submit_button.click();
	}
	
	public void click_create_new_account()
	{
		Create_new_account.click();
	}
	
	public void click_forgotten_password()
	{
		Forgotten_password.click();
	}
	
	
	public void userlogin(String UID, String PWD)
	{
		enterusername(UID);
		enterpassword(PWD);
		clickloginbutton();
	}
	

}
