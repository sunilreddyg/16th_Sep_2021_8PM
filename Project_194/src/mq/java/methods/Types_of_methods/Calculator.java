package mq.java.methods.Types_of_methods;


public class Calculator
{
	//Void is a method type it doesn't return any value to methodname
	void open()
	{
		System.out.println("Calculator is opened");
	}
	
	
	/*
	 * => Otherthan void for all methods we should write return keyword
	 * => Return value should match with type of method
	 * => finally it return value to methodname
	 * => return keyword should be final statement at method
	 */
	
	
	int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	int sub(int x, int y)
	{
		return x-y;
	}
	
	

	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.open();
		
		//calling method otherthan void
		int total=cal.add(10, 20);
		System.out.println(total);
		
		//Calling method otherthan void
		int totalsub=cal.sub(100, 50);
		System.out.println(totalsub);
		
		
	}
	
	
	

}
