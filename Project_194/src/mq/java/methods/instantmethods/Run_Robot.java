package mq.java.methods.instantmethods;

public class Run_Robot {

	public static void main(String[] args) 
	{
		
		
		new RobotA().walk();
		new RobotA().run();
		
		
		/*
		 * object creation syntax:-->
		 * 		Inorder to access any instant method or variables from public class
		 * 		We should create object for class
		 * 
		 * 		ClassName obj=new ClassName();
		 * 		obj.methodname();
		 */
		
		RobotA xyz=new RobotA();
		xyz.walk();
		xyz.run();
		

	}

}
