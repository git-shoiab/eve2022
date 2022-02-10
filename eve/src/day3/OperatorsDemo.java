package day3;

public class OperatorsDemo {
	public static void main(String[] args) {
		int n1=11;
		int n2=3;
		
		int add=n1+n2;
		System.out.println("Addition..:"+add);
		
		int sub=n1-n2;
		System.out.println("Subtraction..:"+sub);
		
		int mul=n1*n2;
		System.out.println("Multiplication..:"+mul);
		
		int div=n1/n2;
		System.out.println("quotient ..:"+div);
		
		int mod=n1%n2;
		System.out.println("Reminder...:"+mod);
		
		//increment and decrement operator
		
		int i=10;
		//i=i+1;// or i++; or ++i;
		System.out.println(i++);//post increment - prints the i first and then increments
		System.out.println(i);
		
		i=10;
		//i=i+1;// or i++; or ++i;
		System.out.println(++i);//pre increment - increments first and then prints
		System.out.println(i);
		
		 i=10;
		//i=i-1;// or i--; or --i;
		System.out.println(i--);//post decrement - prints the i first and then decrements
		System.out.println(i);
		
		i=10;
		//i=i+1;// or i++; or ++i;
		System.out.println(--i);//pre decrement - decrements first and then prints
		System.out.println(i);
		
		//i=i+13;
		i=10;
		i+=13;
		System.out.println(i);
		
		i=10;
		i-=13;
		System.out.println(i);
		
		i=10;
		i*=13;
		System.out.println(i);
		
		i=10;
		i/=13;
		System.out.println(i);
		
		i=10;
		i%=13;
		System.out.println(i);
		
		//RELATIONAL OPERATORS - ALL RELATIONAL OPERATORS RETURN BOOLEAN
		
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		
		System.out.println(n1>n2);
		System.out.println(n1<n2);
		System.out.println(n1>=n2);//greater than or equal to
		System.out.println(n1<=n2);//lesser than or equal to
		
		System.out.println(n1!=n2 && n1>n2);//if both are true then AND will return true
		System.out.println(n1==n2 && n1>n2);//if both are true then AND will return true
		
		System.out.println(n1!=n2 || n1>n2);//if one is true then OR will return true
		System.out.println(n1==n2 || n1>n2);//if one is true then OR will return true
	}
}
