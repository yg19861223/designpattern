package main.com.thread;

public class Test {
	public static final ThreadLocal var = new ThreadLocal();

	public static void main(String[] args) {
		Runnable firstThread= new FirstThread();
		Thread thread1 = new Thread(firstThread,"A");
	    Thread thread2 = new Thread(firstThread,"B");
	    thread1.start();
		thread2.start();

	}

}
