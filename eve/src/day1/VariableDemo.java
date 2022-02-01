package day1;
/*
 * Objective
 * 1. Variables
 * 2. Variable types
 * 3. Variable declaration
 * 4. Variable Initialization
 * 5. Variable valid names/identifiers
 */
public class VariableDemo {
	public static void main(String[] args) {
		//1. Number 2. Floating Numbers 3. Character 4. Boolean - simple data types or variable types
		
		//HOW TO USE THEM - HOW I DECLARE A VARIABLE TO ACCEPT DATA
		
		byte b;//b is of type byte - its a number type which means it can only accept numbers
		short s;
		int i;
		long l;
		
		//byte - 8bit , short- 16bit, int - 32bit, long - 64bit
		
		b=10;//value 10 is assigned or initialized to b variable of type byte
		
		System.out.println(b);
		
		//Range of value which could be given to byte
		// -128 to 127
		b=12;
		b=-128;
		
		//short - 16 bit -32768 to 32767
		s=32767;//max value
		s=-32768;//min value
		
		//int - 32 bit - -2147483648 to 2147483647
		
		i=-2_1474_836_48;//underscore for readability
		i=21_474_83647;
		
		//long - 64 bit -9223372036854775808
		
		l=9223372036854775807L;
		l=-9223372036854775808L;

		//float-32 bit and double 64 bit
		float f=100;
		f=100.24f;
		
		double d=233.4554;
		
		//character - 16 bit - 0 to 65535
		char c=97;//97 is ASCII representation of 'a' (American standard code for information interchange)
		c='a';
		
		//boolean - it accepts only true or false
		boolean studying=true;
				studying=false;
				
	
		//COMPLEX TYPE - size of string is unlimited
		String msg="Welcome to Java..";
		String msg2=new String("Welome to Java...");
		String msg3=String.valueOf("Welcome to java...");
		
		
		
		
		
	}
}
