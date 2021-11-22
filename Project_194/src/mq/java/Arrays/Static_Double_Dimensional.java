package mq.java.Arrays;

public class Static_Double_Dimensional {

	public static void main(String[] args) {
		
		
		//Double dimensional arrays represent tabular format
		
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="Iphone";
		data[0][1]="128 GB";
		
		//2nd row data
		data[1][0]="Samsung";
		data[1][1]="64 GB";
		
		//3rd row data
		data[2][0]="Sony";
		data[2][1]="128 GB";
		
		System.out.println(data[1][0]);
		System.out.println("number of rows data available --> "+data.length);

	}

}
