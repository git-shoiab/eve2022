package day3;

public class Conditions1 {
	public static void main(String[] args) {
		//TERNARY OPERATOR - ?
		
		System.out.println(true?"success":"failure");
		System.out.println(false?"success":"failure");
		
		int n=10;
		
		System.out.println(n%2==0?"Even number":"Odd number");
		
		String result=n%2==0?"Even number":"Odd number";
		
		System.out.println(result);
		
	}
}
