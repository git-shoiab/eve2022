package ch6;
//https://fluvid.com/videos/detail/8EL-9T3EB-fdvev7Z#.Yhbv-MXeauw.link
public class ConsDemo {
	ConsDemo(){
		System.out.println("cons called...");
	}
	String s;
	ConsDemo(String s){
		System.out.println("..........................:"+s);
		this.s=s;//initialization
	}
	public static void main(String[] args) {
		System.out.println("before cons...");
		ConsDemo obj=new ConsDemo("hello");
		System.out.println("after cons....");
		System.out.println(obj.s);
		
		ConsDemo obj2=new ConsDemo();
	}
}
