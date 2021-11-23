package mq.java.Loops;

public class For_loop_Examples 
{
	public static void main(String args[])
	{
		
		//print numbers from 1 to 10
		
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//Print number from 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		
		//Print array values
		String names[]= {"Pavitra","Niharika","Niyi","Kareem","Pavani","Neevedika"};
		
		for (int i = 0; i < names.length; i++) 
		{
			String eachname = names[i];
			System.out.println(eachname);
			
		}
		
		
		
		//Condcut sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 1000; i++)
		{
			sum=sum+i;
		}
		System.out.println("Total sum value is --> "+sum);
		
		
		
		
		//Reverse a string
		String toolname="webdriver";
		char ch[]=toolname.toCharArray();
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		
		//Reverse a string using string builder
		String name="linus";
		String rname=new StringBuilder(name).reverse().toString();
		System.out.println(rname);
		
		
		
		
		
		
		
		
		
		
		
	}

}
