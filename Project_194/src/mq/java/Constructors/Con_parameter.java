package mq.java.Constructors;


public class Con_parameter 
{
	
	public Con_parameter(String name, int val) 
	{
		System.out.println(name);
		System.out.println(val);
	}
	
	
	public void mettthod1()
	{
		System.out.println("method1 executed");
	}

	public static void main(String[] args)
	{
		
		Con_parameter con=new Con_parameter("Sunil", 20);
		con.mettthod1();
		


	}

}
