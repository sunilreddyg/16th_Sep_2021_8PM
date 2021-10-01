package mq.java.methods.instantmethods;

public class RobotA 
{
	
	
	//Instant method [Because method not declare with static specifier]
	public void run()
	{
		turnon();   //it allowed to call directly becasue method available in same class
		System.out.println("run executed");
	}
	
	//Instant method [Because method not declare with static specifier]
	public void walk()
	{
		turnon();	//it allowed to call directly becasue method available in same class
		System.out.println("walk executed");
	}
	
	
	//Instant method [Because method not declare with static specifier]
	public void turnon()
	{
		System.out.println("turn on executed");
	}
	
	//Ques:-->why main method not allowed to call same class method directly
	//Static specifier restric other than static methods calling directy
	public static void main(String[] args) 
	{
		

	}

}
