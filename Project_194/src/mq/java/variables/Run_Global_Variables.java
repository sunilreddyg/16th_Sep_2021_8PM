package mq.java.variables;

public class Run_Global_Variables {

	public static void main(String[] args) 
	{
		
		Global_Variables obj=new Global_Variables();
		int val=obj.a;
		String companyname=obj.name;
		System.out.println(val);
		System.out.println(companyname);
		
		
		int val2=Global_Variables.b;
		System.out.println(val2);
		
		String cname=Global_Variables.course;
		System.out.println(cname);
	}

}
