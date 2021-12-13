package commonlibrary;


public class Run_CommonReusable_Actions {

	public static void main(String[] args) 
	{
		
		CommonReusableActions actions=new CommonReusableActions();
		actions.LaunchBrowser("chrome");
		actions.loadwebpage("http://instagram.com");
		actions.set_implicitwait(30);
		actions.set_explicitwait(30);
		
		actions.typetext("//input[contains(@name,'username')]", "9030248855");
	    actions.typetext("//input[@type='password']", "Hello1234");	
	    
	    
	    
		

	}

}
