package day2;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int twoue[][]= {
				{10,20},
				{12,33,34,544},
				{10}
		};
		
		int twoue2[][]=new int[3][];
		
		twoue2[0]=new int[7];//7 columns assigned for first row
		twoue2[1]=new int[3];
		twoue2[2]=new int[1];
		
		System.out.println(twoue.length);// this will return number of rows
		
		System.out.println(twoue[0].length);// this will return number of columns of first row
		
		//how to read
		
		System.out.println(twoue[0][0]);
		twoue[0][0]=5555;
		System.out.println(twoue[0][0]);
		
	}
}
