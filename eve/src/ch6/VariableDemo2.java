package ch6;
//https://fluvid.com/videos/detail/KR9rGt6QQgFap1Qn5#.YhbnqgGaNYo.link
public class VariableDemo2 {
	public static void main(String[] args) {
		A obj=new A();
		obj.s=100;
		//obj.ss=1000;
		A.ss=1000;
		
		A obj2=new A();
		obj2.s=200;
		//obj2.ss=2000;
		A.ss=2000;
		
		System.out.println(obj.s+":"+obj2.s);
		//System.out.println(obj.ss+":"+obj2.ss);
		System.out.println(A.ss+":"+A.ss);
		
		A objX=obj;
		
		System.out.println(objX.s+":"+obj.s);
		
		objX.met(10);
		objX.met(20);
	}
}


class A{
	int s;
	static int ss;
	
	void met(int n) {
		System.out.println(n);
	}
}