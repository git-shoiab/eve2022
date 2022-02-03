package day2;

public class ArrayDemo1 {
	public static void main(String[] args) {
		
		//SINGLE DIMENSIONAL ARRAY
		//ONE ROW - MULTIPLE COLUMNS
		int []arr=new int[] {10,12,13,4,5,10,'c',24};
		
		char c[]= {'a',97,'c','d'};
		char cc[]=new char[10];
		
		
		//OR
		
		int arr2[]= {12,34,56,78,89};
		
		int arr3[]=new int[5];//by default 0 will be assigned
		
		//HOW TO ACCESS ARRAY VALUES
		
		System.out.println(arr3[0]);
		
		System.out.println(arr3[4]);
		
		System.out.println(arr3.length);// no of columns
		
		//HOW TO ALLOCATE VALUES TO ARRAY
		
		arr3[0]=9000;
		arr3[4]=8000;
		
		System.out.println(arr3[0]);
		
		System.out.println(arr3[4]);
	}
}
