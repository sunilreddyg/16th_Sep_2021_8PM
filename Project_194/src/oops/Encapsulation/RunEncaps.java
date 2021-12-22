package oops.Encapsulation;

public class RunEncaps {

	public static void main(String[] args) 
	{
		
		Encaps obj=new Encaps();
		obj.employeeid="MQ002";  //It will override the value 
		
		obj.setName("Sunil");
		String username=obj.getName();
		System.out.println(username);
		
	}

}
