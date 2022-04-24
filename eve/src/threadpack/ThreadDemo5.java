package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//https://fluvid.com/videos/detail/ODe_5Cv6ZpUxZqYGv#.YmS5Y5r719A.link
public class ThreadDemo5 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized(ClassLockDemo.class) {
				new ClassLockDemo().met();
			}
		});
		es.execute(()->{
			synchronized(ClassLockDemo.class) {
				new ClassLockDemo().met();
			}
		});
		
		es.shutdown();
	}
}

class ClassLockDemo{
	static public void met() {
		System.out.println("met called...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println("calling met is over...");
	}
}