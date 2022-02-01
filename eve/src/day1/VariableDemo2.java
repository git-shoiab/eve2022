package day1;
//COMPLEX TYPE OF PRIMITIVES ARE CALLED WRAPPER CLASSES
public class VariableDemo2 {
	public static void main(String[] args) {
		//byte - Byte, short - Short, etc
		
		Integer i=20;
		i=new Integer(20);
		i=Integer.valueOf(20);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.min(10,20));
		
		System.out.println(Integer.max(10,20));
		
		String num1="100";
		String num2="200";
		
		System.out.println(num1+num2);
		
		int n1=Integer.parseInt(num1);//parseint method of Integer is actually converting string to number
		int n2=Integer.parseInt(num2);
		
		System.out.println(n1+n2);
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
}
