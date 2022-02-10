package day3;

import java.util.Scanner;

public class Conditions6 {
	public static void main(String[] args) {
		int n=11;
		switch(n) {
			default:{
				System.out.println("default...........");
				break;
			}
			case 5:{
				System.out.println("5 5 5  55555");
				break;
			}
			case 10:{
				System.out.println("10 10 10 ...........");
				//break;
			}
			
		}
		
		n=10%2;
		switch(n) {
			case 0:{
				System.out.println("even");
				break;
			}
			case 1:{
				System.out.println("odd");
				//break;
			}	
		}
		
		char c='a';
		switch(c) {
			case 'a':{
				System.out.println("apple");
				break;
			}
			case 'b':{
				System.out.println("ball");
				break;
			}	
			default:{
				System.out.println("default...........");
			}
		}
		String date="10 feb 2022";
		
		String s=date.substring(3,6);
		switch(s) {
			case "jan":{
				System.out.println("January month");
				break;
			}
			case "feb":{
				System.out.println("february month");
				break;
			}	
			default:{
				System.out.println("default...........");
			}
		}
	}
	
}
