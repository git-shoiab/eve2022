package day2;

public class EscapeSequence {
	public static void main(String[] args) {
		System.out.println("Hello \"Eve\" world");
		
		System.out.println("Hello \'Eve\' world");
		
		System.out.println("Hello \nEve \nworld");
		
		System.out.println("Hello \n\tEve \n\t\tworld");
		
		System.out.println("Hello \f World");// form feed - page break
		
		System.out.println("Hello \b\b\b world");
		
		System.out.println("Hellohellohello\rWorld");
		
		int count=0;
		
		while(true) {
			System.out.print(count++ +"\r");
			count++;
		}
	}
}
