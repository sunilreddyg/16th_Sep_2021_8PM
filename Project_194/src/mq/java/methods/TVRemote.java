package mq.java.methods;

public class TVRemote 
{
	//Reusable method
	public void turnON()
	{
		System.out.println("Turn on success");
	}
	
	//Reusable method
	public void turnOFF()
	{
		System.out.println("Turn of success");
	}
	
	//Reusable method
	public void movetonext()
	{
		System.out.println("Moved to next channel");
	}
	
	//Reusable method
	public void movetoprevious()
	{
		System.out.println("Moved to previous channel");
	}
	
	
	//Runnable Method
	public static void main(String args[])
	{
		new TVRemote().turnON();
		new TVRemote().movetonext();
	}
	

}
