package refpack;
//https://fluvid.com/videos/detail/_LkeEcqk5kF3_7e82#.YlDvzqWKpYQ.link
import java.lang.reflect.Method;

public class ReflectionDemo2 {
	public static void main(String[] args) throws Exception{
		Hello he=new Hello();//static
	//	Hello hello=(Hello)Class.forName("refpack.Hello").newInstance();//dynamic
		
		Hello hello=(Hello)Class.forName("refpack.Hello").getConstructor().newInstance();
		
		hello=(Hello)Class.forName("refpack.Hello").getConstructor(String.class,int.class).newInstance("aspire",20);
		System.out.println(hello);
		
		Method method=hello.getClass().getDeclaredMethod("met", String.class);
		
		method.invoke(hello, "eve batch");
	}
}


class Hello{
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	
	public Hello(String name,int age) {
		System.out.println("Cons called...:"+name+":"+age);
	}
	
	public void met() {
		System.out.println("method m called....");
	}
	public void met(String s) {
		System.out.println("overloaded method met called...:"+s);
	}
}