package oops.Abstract;

public class ChildA extends Repo
{

	@Override
	void method1() 
	{
		System.out.println("method1 Executed From ClildA");
		
	}

	@Override
	void method2() 
	{
		
		System.out.println("method2 Executed From ClildA");
		
	}
	
	public static void main(String args[])
	{
			ChildA obj=new ChildA();
			obj.method1();
			obj.method2();
			obj.method3();
			
			System.out.println(Repo.name);
		
	}
	

}
