package mq.java.methods.Parameters;

public class RobotX 
{
	
	public void run()
	{
		System.out.println("Run finished in standard speed 5 km");
	}
	
	
	public void customrun(int km)
	{
		System.out.println("run finished  "+km);
	}
	
	
	

	public static void main(String[] args) 
	{
		
		RobotX robot=new RobotX();
		robot.run();
		
		//Calling method with actual parameter/argument
		robot.customrun(15);
	}

}
