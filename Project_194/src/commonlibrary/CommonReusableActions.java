package commonlibrary;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonReusableActions 
{
	
	public WebDriver driver;
	WebDriverWait wait;
	String drivers_path="C:\\Users\\SUNIL\\Desktop\\drivers\\";
	String MainwindowID;
	/*
	 * Keyword:--> Launch Any browser by using name[Chrome,firefox,edge]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", drivers_path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;

		default: System.out.println("browser name is mismatched");
			break;
		}
	}
	
	
	/*
	 * Keyword:--> Get Current Class Browser driver
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	
	/*
	 * Keyword:--> loading new page
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void loadwebpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keyword:--> Manage ImplicitWait
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void set_implicitwait(long seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	
	/*
	 * Keyword:--> Manage ExplicitWait timeout
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void set_explicitwait(long seconds)
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}
	
	
	
	/*
	 * Keyword:--> Type text into editbox
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void typetext(String xpath, String input)
	{
		try {
			WebElement Textbox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Textbox.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Keyword:--> Type text into editbox  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void typetext(WebElement element, String input)
	{
		try {
			WebElement Textbox=wait.until(ExpectedConditions.visibilityOf(element));
			Textbox.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * Keyword:--> Type text into editbox  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void typetext_using_keyboard(WebElement element, String input)
	{
		try {
			WebElement Textbox=wait.until(ExpectedConditions.visibilityOf(element));
			new Actions(driver).sendKeys(Textbox, input).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * Keyword:--> Type text into editbox  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void typetext_using_Javascript(WebElement element, String input)
	{
		try {
			WebElement Textbox=wait.until(ExpectedConditions.visibilityOf(element));
			((JavascriptExecutor)driver).executeScript("arguments[0].value='text'",Textbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * Keyword:--> Click At Any Elemnet like [Button,Link,RadioButton,Checkbox,List--etc]  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void click_element(WebElement Element)
	{
		try {
			WebElement Clicable_Element=wait.until(ExpectedConditions.visibilityOf(Element));
			Clicable_Element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	 * Keyword:--> Click At Any Elemnet like [Button,Link,RadioButton,Checkbox,List--etc]  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void click_element_Using_mouse(WebElement Element)
	{
		try {
			WebElement Clicable_Element=wait.until(ExpectedConditions.visibilityOf(Element));
			new Actions(driver).click(Clicable_Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * Keyword:--> Click At Any Elemnet like [Button,Link,RadioButton,Checkbox,List--etc]  [POM keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * Parameters Used:--> Local Parameters
	 */
	public void click_element_Using_javascript(WebElement Element)
	{
		try {
			WebElement Clicable_Element=wait.until(ExpectedConditions.visibilityOf(Element));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",Clicable_Element);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	 * KeyWord:--> This keyword Select Dropdown Option using [visibletext,value,index] numbers
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void select_dropdown(WebElement element,String selector,String option)
	{
		try {
			
			
			Select dropdown_selector=new Select(element);
			switch (selector) {
			case "text":
				dropdown_selector.selectByVisibleText(option);
				break;
				
			case "value":
				dropdown_selector.selectByValue(option);
				break;
				
			case "index":
				int index = Integer.parseInt(option);
				dropdown_selector.selectByIndex(index);
				break;

			default:System.out.println("selector mismatch");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/*
	 * KeyWord:--> This keyword perform mouseHover action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void mousehover(WebElement element)
	{
		try {
			
			WebElement Hoverelement=wait.until(ExpectedConditions.visibilityOf(element));
			new Actions(driver).moveToElement(Hoverelement).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword perform RightClick action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void RightClick_Action(WebElement element)
	{
		try {
			WebElement Object=wait.until(ExpectedConditions.visibilityOf(element));
			new Actions(driver).contextClick(Object).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword perform DragAndDrop option
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_Target(WebElement Source, WebElement Target)
	{
		
		try {
			WebElement srcelement=Source;
			WebElement targetelement=Target;
			new Actions(driver).dragAndDrop(srcelement, targetelement).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword drag object to requried target
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_required_coordinates(WebElement srcelement,int xcoord, int ycoord)
	{
		
		try {
			WebElement Src=wait.until(ExpectedConditions.visibilityOf(srcelement));
			new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> CaptureScreen
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void capturescreen(String imagename)
	{
		//Get System Default Time
		Date date=new Date();    //import java.util;
		//create simple dataformat
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Cover default system date using date formatter
		String time=df.format(date);
				
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.createDir(new File("screens"));
			FileHandler.copy(src, new File("screens\\"+time+imagename+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	/*
	 * KeyWord:--> Switch to Next window
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_next_window()
	{
		MainwindowID=driver.getWindowHandle();
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) {
			driver.switchTo().window(eachwindow);
		}
	}
	
	
	/*
	 * KeyWord:--> Switch back to mainwindow
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_mainwindow()
	{
		driver.switchTo().window(MainwindowID);
	}
	
	
	
	/*
	 * KeyWord:--> Switch requried window using it's title
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void swithcto_window_using_page_title(String exp_title)
	{
		//Get All Dynamic WIndow ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		//Using foreach loop iterate for number of windows
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current FoCused window tilte
			String runtime_title=driver.getTitle();
			//System.out.println(runtime_title);
			
			if(runtime_title.contains(exp_title))
			{
				break;  //IT stop iteration   [Break will stop iteration when required title found]
			}
			
		}
	}
	
	
	/*
	 * KeyWord:--> CLose alert 
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	
	public void close_alert()
	{
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:-->Verify alert text
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_alert_text(String Exp_text)
	{
		boolean flag=false;
		try {
			String alert_text=driver.switchTo().alert().getText();
			flag=alert_text.equals(Exp_text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	/*
	 * KeyWord:-->Verify Switch to frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchtoFrame_using_FrameName(String FrameID_or_name)
	{
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameID_or_name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * KeyWord:-->Switch to frame using index number
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchtoFrame_using_frameindex(int frameIndex)
	{
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:-->Switch Control back to mainpage from frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switch_from_frame_tomainwindow()
	{
		driver.switchTo().defaultContent();
	}
	
	/*
	 * KeyWord:-->Verify Expected page title presented
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_titlePresented(String Exp_title)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.titleIs(Exp_title));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
	/*
	 * KeyWord:-->Verify Expected url presented at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_urlPresented(String Exp_url)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.urlToBe(Exp_url));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify Expected element is presented at source
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_Element_Presented_Source(String Xpath)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	
	/*
	 * KeyWord:-->Verify Text presented at location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_text_presented_At_location(String Xpath,String text)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Xpath), text));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	/*
	 * KeyWord:-->THis keyword verify text presented at required location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean Verify_element_text(String xpath,String exp_text)
	{
		String element_text=driver.findElement(By.xpath(xpath)).getText();
		boolean flag=element_text.equalsIgnoreCase(exp_text);
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify Text visible at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_text_visible_at_webpage(String Exp_text)
	{
		WebElement Page=driver.findElement(By.tagName("body"));
		String Act_Text=Page.getText();
		return Act_Text.equals(Exp_text);
	}
	
	
	/*
	 * KeyWord:-->Verify any inputvalue presented at editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_inputPresented_At_Textbox(String Xpath,String exp_input)
	{
		boolean flag=false;
		try {
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(Xpath), exp_input));
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	/*
	 * Keyword:-->This keyword return selected value from dropdown
	 * Author:-->
	 * Parameters used:-->
	 */
	public String getSelectedValueInDropDown(String xpath)
	{
		String OptionText=new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
		return OptionText;
	}
	
	
	/*
	 * Keyword:-->This keyword Verify runtime Attribute value
	 * Author:-->
	 * Parameters used:-->
	 */
	public boolean verify_runtime_Attribute_value(String xpath, String attributname,String exp_attibutevalue)
	{
		String Runtime_Attribute_Value=driver.findElement(By.xpath(xpath)).getAttribute(attributname);
		return Runtime_Attribute_Value.contains(exp_attibutevalue);
	}
	
	
	
	/*
	 * Keyword:-->Scroll window vertical
	 * Author:-->
	 * Parameters used:-->
	 */
	public void ScollWindow_View()
	{
		try {
			((JavascriptExecutor)driver).executeScript("window.scroll(0,100)");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	/*
	 * Keyword:-->Close Current Window
	 * Author:-->
	 * Parameters used:-->
	 */
	public void close_browser()
	{
		driver.close();
	}
	
	
	/*
	 * Keyword:-->Close all windows
	 * Author:-->
	 * Parameters used:-->
	 */
	public void close_Allwindows()
	{
		driver.quit();
	}
	

}
