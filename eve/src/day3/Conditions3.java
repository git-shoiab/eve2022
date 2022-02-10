package day3;

import java.util.Scanner;

public class Conditions3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter a number..:");
		int num=scan.nextInt();
		
		
		if(num==1) {
			System.out.println("Jan month");
		}
		else if(num==2) {
			System.out.println("Feb month..");
		}
		else if(num==3) {
			System.out.println("Mar month..");
		}
		else if(num==4) {
			System.out.println("April month..");
		}
		else {
			System.out.println("unknown");
		}
	}
	
}
