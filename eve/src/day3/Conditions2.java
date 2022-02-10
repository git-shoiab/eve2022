package day3;

import java.util.Scanner;

public class Conditions2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter a number..:");
		int num=scan.nextInt();
		
		boolean value=(num%2==0);
		if(value) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number..");
		}
	}
	
}
