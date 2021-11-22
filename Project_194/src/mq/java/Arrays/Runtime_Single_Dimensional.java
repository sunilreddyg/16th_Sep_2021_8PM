package mq.java.Arrays;

public class Runtime_Single_Dimensional {

	public static void main(String[] args)
	{
		
		
		
		String browser[]= {"chrome","firefox","edge","safari","opera"};
		System.out.println("3rd index browser is ---> "+browser[3]);
		
		
		int num[]= {100,200,300,400,500,600};
		System.out.println("2nd index value is --> "+num[2]);
		
		
		Object obj[]= {"iphone", 120000.00, true, 5};
		double price=(double) obj[1];  //Add casting to covert from object to double value
		System.out.println(price);

	}

}
