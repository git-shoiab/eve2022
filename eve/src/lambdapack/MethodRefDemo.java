package lambdapack;
//https://fluvid.com/videos/detail/AZX-wTOoOkTpgx5D8#.YlJEUVJ4OpM.link
public class MethodRefDemo {
	public MethodRefDemo() {
		System.out.println("cons called................");
	}
	static void myHello() {
		System.out.println("this is my hello implementation...");
	}
	
	void eveHello() {
		System.out.println("eve hello .......impl............");
	}
	public static void main(String[] args) {
		MyInterM mm=MethodRefDemo::myHello;//this is for static method
		mm=new MethodRefDemo()::eveHello;//this is for non static method
		mm=MethodRefDemo::new;//this will call constructor
		
		hello(mm);
	}
	
	static void hello(MyInterM m) {
		m.sayHello();
	}
}

//@FunctionalInterface
interface MyInterM{
	public void sayHello();
	//public void say();
}