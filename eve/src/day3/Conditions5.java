package day3;

import java.util.Scanner;

public class Conditions5 {
	public static void main(String[] args) {
		
		
		int num=Integer.parseInt(args[0]);
		
		
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
