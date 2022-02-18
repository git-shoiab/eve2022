package ch6;
//https://fluvid.com/videos/detail/G6x-YcD5VdC5nDD5m#.Yg8IZD9tQRc.link
public class MethodsDemo1 {
	
	public static void main(String[] args) {
		MethodsDemo1 obj=new MethodsDemo1();
		obj.call();
		obj.call(10);
		obj.call(10L);
		obj.call((long)100);
		obj.call((short)100);
		obj.call("hello",67);
		
		obj.call(8989,"jhjhjhjhjh");
	}
	void met() {
		
	}
	void call() {
		System.out.println("without data.................");
	}
	void play(String game) {
		
	}
	void call(int n) {
		System.out.println("with data......................"+n);
	}
	void call(long l) {
		System.out.println("longggggggggg.........................:"+l);
	}
	void call(short s) {
		System.out.println("short.................................."+s);
	}
	
	void call(String s,int n) {
		System.out.println(s+":"+n);
	}
	
	void call(int n,String s) {
		System.out.println(s+":"+n);
	}
}
