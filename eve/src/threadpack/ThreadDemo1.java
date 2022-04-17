package threadpack;
//https://fluvid.com/videos/detail/DrG-KsroY1F9kvY-G#.Ylt4h4hcF7Q.link
public class ThreadDemo1 {
	public ThreadDemo1() {
		new Thread(()->{ThreadDemo1.met2();}).start();
		new Thread(()->{ThreadDemo1.met3();}).start();
	}
	public static void main(String[] args) {
		System.out.println("first line...");
		System.out.println("second line...");
		System.out.println("thrid line....");
		new ThreadDemo1();
		met1();
		
	}
	static void met1() {
		System.out.println("met 1 called....");
		try {Thread.sleep(5000);}catch(Exception e) {}
	}
	static int met2() {
		System.out.println("met 2 called...");
		return 1;
	}
	static void met3() {
		System.out.println("met 3 called...");
	}
}
