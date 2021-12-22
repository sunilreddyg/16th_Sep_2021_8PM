package miniproject;



public class TestCases extends Common_Reusable_Actions implements InputData,CommonObjects
{
	
	public void SetupBrowser()
	{
		LaunchBrowser(IP_browsername);
		load_webpage(IP_Page_url);
		set_explicitwait_time(IP_exp_timeout);
	}
	
	public void user_login()
	{
		if(verify_titlePresented(IP_OrangeHrm_page_title))
		{
			Type_text(obj_login_email, IP_login_email);
			Type_text(obj_login_password, IP_login_password);
			click_element(obj_login_Submit_button);
		}
		else
		{
			System.out.println("Wrong title presented");
		}
		
	}
	
	
	public static void main(String args[])
	{
		TestCases obj=new TestCases();
		obj.SetupBrowser();
		obj.user_login();
	}
	
	

}
