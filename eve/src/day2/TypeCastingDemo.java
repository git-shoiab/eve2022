package day2;

public class TypeCastingDemo {
	public static void main(String[] args) {
		//Java is a strongly typed language
		
		boolean b=true;
		
		//int n=b;//incompatible type
		
		boolean c=b;// compatible type
		
		int n=258;//32 bit where byte is 8 bit
		
		byte bb=(byte)n;// type casting - converting integer to number
		
		System.out.println(bb);// the number 257 is divided by 256 and the reminder is presented
		
		// when u downcast a higher into a lower data type - the precision of the date will be lost
		
		n=bb;//lower type can automatically promote to higher type - auto type promotion
		
		byte n1=10;
		byte n2=2;
		
		byte result=(byte)(n1*n2);// the result of an arithmetic operation will be always a int
		
		//when two byte values are multiplied the result is autopromoted to int type
		
		char cc=97;
		cc='a';
		
		int num=97;
		cc=(char)num;//all numbers cannot be characters - and more over num is 32 bit and char is 16 bit
		num=cc;//character can be assigned to a number - because all characters are numbers
		
		
	}
}
