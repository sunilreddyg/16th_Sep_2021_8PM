package commonlibrary;



public class Run_CommonReusableActions_With_PageFactory_Objects {

	public static void main(String[] args) 
	{
		
		CommonReusableActions obj=new CommonReusableActions();
		obj.LaunchBrowser("chrome");
		obj.loadwebpage("https://www.facebook.com/r.php");
		obj.set_explicitwait(30);
	
		
		Signup_FB signup=new Signup_FB(obj.getDriver());
		obj.typetext(signup.Firstname, "Arjun");
		obj.typetext(signup.Surname, "Kumar");
		obj.typetext(signup.Email_or_Mobile, "Arjunkumar@gmail.com");
		obj.typetext_using_keyboard(signup.ReType_Email_or_Mobile, "Arjunkumar@gmail.com");
		obj.typetext(signup.Password, "Hello1234");
		obj.select_dropdown(signup.DOB_Day, "text", "22");
		obj.select_dropdown(signup.DOB_Month, "value", "6");
		obj.select_dropdown(signup.DOB_year, "index", "20");
		obj.click_element(signup.Gender_Male);
		obj.capturescreen("Signup_Details");
		
	

	}

}
