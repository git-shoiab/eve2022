//comment
//https://fluvid.com/videos/detail/P5OY2TP4zvTgLmmZR#.YgsUwBj6KPI.link
package ch6;

import java.util.Scanner;

public class ClassDemo1 {
	public static void main(String[] args) {
		ClassDemo1 obj=new ClassDemo1();
		
		
		obj.met();
		
		Eagle eagle=new Eagle();
		System.out.println(eagle.feathers);
		
		Duck duck=new Duck();
		System.out.println(duck.feathers);
	}
	void met() {
		System.out.println("hello..");
	}
}

//EXTENDS-KIND OF RELATIONSHIP
//COMMON PROPERTIES - DEFINED IN PARENT
//inheritance - parent properties are available in child
class Bird{
	String feathers="lot of colourfull feathers............";
}

class Eagle extends Bird{
	
}

class Duck extends Bird{
	
}