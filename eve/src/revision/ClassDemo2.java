package revision;
//https://fluvid.com/videos/detail/DrG-KszvEvi-1oXRR#.YjkvdFK6hl8.link
public class ClassDemo2 {
	String name="Eve Batch...";
	public static void main(String[] args) {
		ClassDemo2 obj=new ClassDemo2();
		obj.sadhaMet();
		ClassDemo2.met();
		ClassDemo2.met(10);
		ClassDemo2.met2();
		
	}
	//you cannot access non static references or variables inside a static
	//context
	//you cannot use keywords - this and super inside static context
	static void met() {
		//System.out.println("met called...."+name);
	}
	static void met(int i) {
		System.out.println("met with param called...");
	}
	static void met2() {
		System.out.println("met 2 called.....");
		//new A().myMet(this); //cannot use this in static context
	}
	
	void sadhaMet() {
		System.out.println("idhu sadha method...."+name);
		new A().myMet(this);//this - keyword refers to current object
		B obj=new B();
		obj.callMyMet();
	}
}

class A{
	void myMet(ClassDemo2 obj) {
		
	}
	static void myMet() {
		System.out.println("parent my met called...");
	}
}

class B extends A{
	static void myMet() {
		System.out.println("child mymet called....");
	}
	 static void callMyMet() {
		 myMet();//cannot call non static context
		 super.myMet();//cannot use keyword - super
	 }
}