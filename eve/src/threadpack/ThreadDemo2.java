package threadpack;
//https://fluvid.com/videos/detail/p35djuXG5vUak57gO#.Ylt7g0O29Uw.link
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {
	public static void main(String[] args) {
		//Thread t=new Thread(new ThreadJob());
		//t.start();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new ThreadJob());
//		es.execute(new Runnable() {			
//			@Override
//			public void run() {
//				System.out.println("child thread anonymous called...");				
//			}
//		});
		//es.execute(()->{System.out.println("child thread lambda called...");});//lambda
		//es.execute(ThreadDemo2::met);//method referencing
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(100);}catch(Exception e) {}
		}
		es.shutdown();
	}
	static void met() {
		System.out.println("child thread called from met method...");
	}
}

class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}