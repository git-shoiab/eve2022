package day3;

import java.util.Scanner;

public class Conditions4 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter a value..:");
		String val=scan.next();
		
		
		if(val.equals("eve")) {
			System.out.println("next weak thursday class will be covered on friday..");
		}
		else if(val.equals("aspire")) {
			System.out.println("no changes..");
		}
		else if(val.equals("ramanujam")) {
			System.out.println("your exams are held so good luck");
		}
		else if(val.equals("knights")) {
			System.out.println("no changes...");
		}
		else {
			System.out.println("unknown");
		}
	}
	
}
