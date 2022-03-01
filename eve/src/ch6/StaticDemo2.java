package ch6;
//https://fluvid.com/videos/detail/n8QdniK94XIXBkR1v#.Yh2ByRHQaWE.link
public class StaticDemo2 {
	public static void main(String[] args) {
		//StatBlock obj=new StatBlock();
		//obj.met();
		//obj.met2();
		
		StatBlock.metS();
		StatBlock.metSS();
	}
}


class StatBlock{
	public StatBlock() {
		System.out.println("cons called...");
	}
	static {
		System.out.println("static block called....");
	}
	void met() {
		System.out.println("met called....");
	}
	void met2() {
		System.out.println("met22222222222222 called....");
	}
	
	static void metS() {
		System.out.println("static met called...");
	}
	static void metSS() {
		System.out.println("staticsssssssss met called...");
	}
}