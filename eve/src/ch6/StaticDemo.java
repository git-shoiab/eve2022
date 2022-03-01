package ch6;
//https://fluvid.com/videos/detail/j-mdETdE1dfXenB-x#.Yh1-54W7OWc.link
class Parent{
	int i=100;
	static void met() {
		System.out.println("parent static met called...");
	}
}
public class StaticDemo extends Parent{
	public static void main(String[] args) {
		StaticDemo obj=new StaticDemo();
		obj.nsMet(1);
		//obj.met();
		Parent.met();
		StaticDemo.met();
		StaticDemo.met(10);
	}
	int i=10;
	static void met() {
		//this and super cannot be used
		System.out.println("static met called...");
		//System.out.println(i);
		System.out.println(new StaticDemo().i);
	}
	static void met(int i) {
		System.out.println("static met called..................."+i);
		//System.out.println(this.i);
		//System.out.println(super.i);
	}
	
	void nsMet(int i) {
		System.out.println("non static met called..."+i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
}


