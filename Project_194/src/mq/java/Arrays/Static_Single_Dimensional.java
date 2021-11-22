package mq.java.Arrays;

public class Static_Single_Dimensional {

	public static void main(String[] args) 
	{
		
		
		String names[]=new String[4];
		names[0]="pavani";
		names[1]="Niyi";
		names[2]="Kareem";
		names[3]="pavitra";
		
		System.out.println(names[2]);
		System.out.println("Number of items in array is --> "+names.length);
		
		
		
		int num[]=new int[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		
		System.out.println(num[2]);
		System.out.println("Number of items in array is --> "+num.length);
		
		
		//Store mixed values
		Object obj[]=new Object[4];
		obj[0]="Iphone";
		obj[1]=120000.00;
		obj[2]=true;
		obj[3]=4;
		
		
		String productname=(String) obj[0];
		double productprice=(double) obj[1];
		boolean productstatus=(boolean) obj[2];
		int productquantity=(int) obj[3];
		
		System.out.println(productname+"   "+productprice+"     "+productstatus+"     "+productquantity);
		
		
		
		
		
		
		
		

	}

}
