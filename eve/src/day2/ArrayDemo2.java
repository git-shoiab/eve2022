package day2;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int [][]twod= {
//				{23,34,45,45,56},
//				{14,5,24,56,56},
//				{98,7,34,2,3}
//		};
		
		int [][]twod=new int[3][5];//array declared with 3 rows and 5 columns
		
		System.out.println(twod.length);// this will return number of rows
		
		System.out.println(twod[0].length);// this will return number of columns of first row
		
		//how to read
		
		System.out.println(twod[0][0]);
		twod[0][0]=5555;
		System.out.println(twod[0][0]);
	}
}
