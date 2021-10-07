package mq.java.variables;

public class Global_Variables 

{
	//Instnat variables
	int a=100;
	String name="MQ-DSNR";
	
	
	//Class variables  [Static variables]
	static int b=200;
	static String course="Selenium";
	
	
	//Instant method
	public void method1()
	{
		System.out.println(b);
		System.out.println(course);
		//Static variable can call anywhere without object creation
	}
	
	
	//Static Method
	public static void method2()
	{
		//Create object to call instant methods
		System.out.println(new Global_Variables().a);
		System.out.println(new Global_Variables().name);
		
		//Static methods
		System.out.println(b);
		System.out.println(course);
		
	}
	
	

}
