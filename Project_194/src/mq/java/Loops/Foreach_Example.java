package mq.java.Loops;

public class Foreach_Example {

	public static void main(String[] args) 
	{
		
		//Reading single dimensional array value using for loop
		String browsers[]= {"Firefox","Chrome","Safari","opera","Edge"};
		
		for (String eachrbrowser : browsers) 
		{
			System.out.println(eachrbrowser);
		}
		
		
		
		
		String data[][]= 
			{
					{"chrome","96"},
					{"firefox","87"},
					{"IE","16"},
			};
		
		//Reading double dimensional array value using foreach loop
		for (String[] row : data) 
		{
			System.out.println(row[0]+"   "+row[1]);
		}
		
		
		
		

	}

}
