package day3;

public class Loops {
	public static void main(String[] args) {
//		while(true) {
//			System.out.println("infinite loop..");
//		}
		
//		do {
//			System.out.println("infinite loop..");
//		}while(true);
		
		int n=10;
		
		while(n>10) {//pre condition check
			System.out.println("this loop does not run");
		}
		
		do {
			System.out.println("this loop runs atleast once..");
		}while(n>10);//post condition check
		
		while(n>0) {
			System.out.println(n);
			n--;
		}
	}
	
}
