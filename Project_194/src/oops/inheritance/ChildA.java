package oops.inheritance;

public class ChildA extends Parent
{
	
	String email="info@gmail.com";

	public void method2()
	{
		System.out.println(name);   //printing parent class attribute[Variable]
		method1();					//printing parent class method
	}
	
	public static void main(String[] args) 
	{
		//this object will access both parent and child class variables and methods
		ChildA obj=new ChildA();
		obj.method1();    //Parent Class method
		obj.method2();    //Child Class method
		
		
		//This object will access only parent class variable and method
		Parent ref=new ChildA();
		ref.method1();  //parent class method
		

	}

}
