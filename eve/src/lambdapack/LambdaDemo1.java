package lambdapack;
/*
 * Interview Questions I encountered 
[Both TR and HR round is conducted in single interview]
[TR Questions]
1. Show me your government ID card.
2. Tell me about yourself
3. Explain your Bulk-Email Project  
3.1 How will you store mail address
3.2 What protocal you have used. 
3.3 Mention host name and port number.
3.4 Which language are you familiar with. (I said C Language and JAVA)
4. What is Java and whats special in java.
4.1. She asked me to type hello world program in notepad and run using command prompt.
5. Could you mention the features of Java.
6. Whats the range of int datatype in java (She impressed here though its a basic question, she said that I have conducted many interviews but none answered this question correctly, all were mentioning "Size of int datatype" ).
7. Whats the difference between while and do while.
7.1. If while loop executes 4 times then how many times do while loop will execute.
8. Type the Syntax of enhanced for loop.
9. What is constructor and whats the difference between method and constructor.
10. Whats is OOPS
10.1. Tell me about inheritance with example
10.2. What is polymorphism
10.3. What is abstraction 
10.4 What is encapsulation explain with real world example.
11. How will you seperate your name (Musharaf Aahel) and print using string methods.
11.1 I need your name to be printed from a to h using sting methods.
12. What is Database?
13. What is SQL?
14. Why Database software is used.
15. What is DDL and mention DDL commands.
16. What is DML and mention DML commands.
17. What is the difference between DROP table and TRUNCATE table.
18. He said an senario and asked to create an table and insert values to table.
19. What new technology you come across
20. Tell me about metaverse
21. What technology is used behind Crpto and mention some crypto coins.
[HR Questions]
22.Tell me why you want to join accenture.
23.Tell me how you deal with conflicts.
24. Tell me a situation where you have been asked to take a difficult decision.
25. Are you okay with any location and shifts.
25. Do you have any questions.
 */

//https://fluvid.com/videos/detail/dagdEhZvZRI8OK2YY#.YlJBEDGkfMg.link
public class LambdaDemo1 {
//three types of inner classes - static inner class, inner class, local inner class, anonymous inner class
	public static void main(String[] args) {
		Pepsi pepsi=new Pepsi();
		pepsi.sellCola();
		
		Kalimark kali=new Kalimark();
		kali.sellCola();		
	}
}

abstract class Cola{
	public abstract void makeCola();//one method abstract or interface is called - FUNCTIONAL INTERFACE
	//public abstract void makeFlavour();
}

@FunctionalInterface
interface ColaInter{
	public void makeCola();
	//public void sss();
}

class Pepsi {
	public void sellCola() {
		//Cola cola=new Kalimark().new CampaCola();//this is how we access inner class
		//Cola cola=new Kalimark.CampaCola();//this is how we access static inner class
		//cola.makeCola();
		System.out.println("pepsico sells cola made by campa cola..as pepsi.");
	}
}

class Kalimark {
	public void canteen() {
		System.out.println("employees eat here..");
	}
	public void sellCola() {
		//local inner class - this class outsiders cannot access - a kind of MERGER
		class CampaCola extends Cola{
			@Override
			public void makeCola() {
				canteen();//inner classes have access to all the variables and methods of parent class
				System.out.println("cola made by campa cola...");
			}
//			@Override
//			public void makeFlavour() {
//				// TODO Auto-generated method stub
//				
//			}
		}
		Cola cola=new CampaCola();
		cola.makeCola();
		
		//anonymous inner class - use this for single method abstract /interface
		new Cola() {			
			@Override
			public void makeCola() {
				System.out.println("ANONYMOUS-cola made as per campa cola logic...");
			}
		}.makeCola();
		
		//LAMBDA - INTRODUCED IN JDK8 - 2014 - These lambdas work only for INTERFACES
		
		ColaInter colaInterImpl=()->{System.out.println("LAMBDA-cola made as per campa cola logic....");};
		colaInterImpl.makeCola();
		
		System.out.println("kali sells cola made by campa cola...as bovonto");
	}
//	public class CampaCola extends Cola{
//		@Override
//		public void makeCola() {
//			canteen();//inner classes have access to all the variables and methods of parent class
//			System.out.println("cola made by campa cola...");
//		}
//	}

}
