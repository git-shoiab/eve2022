package lambdapack;
//https://fluvid.com/videos/detail/dagdEhZvZRI8OK2YY#.YlJBEDGkfMg.link
public class LambdaDemo2 {
	public static void main(String[] args) {
		MyInter myinter=()->{System.out.println("say hello called...");};
		
		myinter.sayHello();
		
		MyInter2 myinter2=(n, a)->{System.out.println("say hello called...:"+n+":"+a);};
		//MyInter2 myinter2=(String n,int a)->{System.out.println("say hello called...:"+n+":"+a);};
		myinter2.sayHello("aspire",100);
		
		MyInter3 myinter3=(s)->{return "welcome to lambda...:"+s;};
		
		System.out.println(myinter3.sayHello("eve"));
		
		hai(myinter3);
	}
	
	static void hai(MyInter3 m3) {
		System.out.println(m3.sayHello("eve"));
	}
}

interface MyInter{
	public void sayHello();
}

interface MyInter2{
	public void sayHello(String name,int age);
}

interface MyInter3{
	public String sayHello(String name);
}