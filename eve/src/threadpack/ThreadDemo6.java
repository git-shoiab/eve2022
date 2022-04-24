package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo6 {
	public static void main(String[] args) {
		Bank bank=new Bank();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			synchronized(bank) {
			bank.credit(1000);
			bank.debit();
			}
		});
		es.execute(()->{
			synchronized(bank) {
			bank.credit(5000);
			bank.debit();
			}
		});
		
		es.shutdown();
	}
}

class Bank{
	int amt;
	public void credit(int amt) {
		this.amt=amt;
		System.out.println(amt+" is credited...");
		try {Thread.sleep(200);}catch(Exception e) {}
	}
	
	public void debit() {
		System.out.println(amt+" is debited...");
	}
}