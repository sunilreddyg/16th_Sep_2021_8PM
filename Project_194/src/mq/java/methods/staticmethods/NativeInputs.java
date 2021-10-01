package mq.java.methods.staticmethods;

public class NativeInputs 
{
	//Static methods
	public static void keyboard()
	{
		System.out.println("keyboard is active");
	}

	
	public static void Mouse()
	{
		System.out.println("Mouse is active");
	}
	
	
	public static void touch()
	{
		System.out.println("touch is active");
	}

	public static void main(String[] args) 
	{
		keyboard();
		Mouse();
		touch();

	}

}
