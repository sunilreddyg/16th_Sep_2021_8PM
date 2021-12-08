package pageobjects.ElementDeclaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Get_PageObject_Elements {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		Declare_Pageobject_Elements pageobjects=
				PageFactory.initElements(driver, Declare_Pageobject_Elements.class);
		
		pageobjects.Firstname_EB.sendKeys("Hi");
		
		int linkscount=pageobjects.page_links.size();
		System.out.println(linkscount);
		
		int DropdownCOunt=pageobjects.Dropdown.size();
		System.out.println(DropdownCOunt);

		
		for (WebElement EachOption : pageobjects.Month_options) 
		{
			EachOption.click();
			Thread.sleep(1000);
		}
		
		
		//Get Group object count
		int count1=pageobjects.By_Group_Objects.size();
		System.out.println(count1);
		
		//Get Group objects count
		int Count2=pageobjects.All_Group_objects.size();
		System.out.println(Count2);
		
		
		
		
		
		
		
	}

}
