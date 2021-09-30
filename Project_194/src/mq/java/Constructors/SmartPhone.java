package mq.java.Constructors;

public class SmartPhone 
{
	//Reusable mehtod
	public void calling()
	{
		System.out.println("Call Connected");
	}
	
	
	//Reusable method
	public void sendingtext()
	{
		System.out.println("Send Text successfull");
	}
	
	
	//Constructor
	public SmartPhone() 
	{
		System.out.println("Initilizer executed");
	}

	public static void main(String[] args) 
	{
		
		new SmartPhone().calling();
		new SmartPhone().sendingtext();

	}

}
