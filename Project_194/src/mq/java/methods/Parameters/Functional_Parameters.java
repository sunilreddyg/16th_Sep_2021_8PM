package mq.java.methods.Parameters;

public class Functional_Parameters 
{
	//Method without parameter
	public void printtool()
	{
		System.out.println("Selenium");  //Here selenium in hardcoded
	}
	
	//Method with parameter
	public void printtool(String toolname)
	{
		System.out.println(toolname);
	}
	
	//Method with parameter
	public void tools(int num)
	{
		System.out.println(num);
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		Functional_Parameters obj=new Functional_Parameters();
		obj.printtool();
		
		//Calling method with actual parameter/ argument
		obj.printtool("IDE");
		obj.printtool("GRID");
		obj.printtool("Postman");
		
		//Calling method with acutal parameter
		obj.tools(10);

	}

}
