package mq.java.methods.Parameters;

public class CallBy_Reference 
{
	
	//Robotx is predefined class
	public void getrobotdetails(RobotX robot)
	{
		robot.customrun(10);
	}

	public static void main(String[] args) {
		
		
		CallBy_Reference ref=new CallBy_Reference();
		ref.getrobotdetails(new RobotX()); //Passing object through actual parameter
		
	}

}
