package calling_other_packge_Class_methods_and_Variables;

import mq.java.methods.instantmethods.RobotA;
import mq.java.methods.staticmethods.NativeInputs;

public class Runner 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Inorder to call or reuse other package variables and methods we shoule 
		 * follow below condition
		 * 
		 * 		Condition1:--> only public modifier methods and variables can
		 * 					   access outside package
		 * 
		 * 		Condition2:--> We Should import other package references into Current
		 * 						class 
		 * 
		 * 			Import Syntax:-->
		 * 					import packagename.*;
		 * 					import packagename.Classname;
		 */
		RobotA robot=new RobotA();
		robot.run();
		
		NativeInputs.Mouse();
		NativeInputs.keyboard();
		
		
		

	}

}
