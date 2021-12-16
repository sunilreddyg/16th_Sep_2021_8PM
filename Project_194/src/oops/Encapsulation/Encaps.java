package oops.Encapsulation;


public class Encaps 
{
	
	private String name;
	private String email;
	private String mobile;
	public String employeeid="MQ001";
	
	public String getName() 
	{
		System.out.println(name+" ---> user has taken name");
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
		System.out.println(name+"  --> user Has set Name");
	}
	
	
	
	
	

}
