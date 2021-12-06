package pageobjects.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;


public class FB_Signup
{


@FindBy(xpath = "//input[@name='firstname']")
public WebElement  Firstname;

@FindBy(xpath = "//input[@name='lastname']")
public WebElement  Surname;

@FindBy(xpath = "//input[contains(@name,'reg_email__')]")
public WebElement  Email_or_Mobile;

@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
public WebElement  ReType_Email_or_Mobile;

@FindBy(xpath = "//input[@data-type='password']")
public WebElement  Password;

@FindBy(xpath = "//select[@title='Day']")
public WebElement  DOB_Day;

@FindBy(xpath = "//select[@name='birthday_month']")
public WebElement  DOB_Month;

@FindBy(xpath = "//select[contains(@title,'Year')]")
public WebElement  DOB_year;

@FindBy(xpath = "//input[@value='1']")
public WebElement   Gender_Female;

@FindBy(xpath = "//input[@value='2']")
public WebElement  Gender_Male;

@FindBy(xpath = "//input[contains(@value,'-1')]")
public WebElement  Gender_Custom;

@FindBy(xpath = "//button[@name='websubmit']")
public WebElement  signUp;



}