package mq.java.methods.Parameters;

public class Multiple_Parameters 
{
	
	public void productinfo(String name, int quantity, double price)
	{
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
	}
	
	

	public static void main(String[] args)
	{
		
		//Calling method with parameters
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.productinfo("iphone", 5, 70000.00);
		obj.productinfo("Samsung", 4, 60000.00);
		
	}

}
