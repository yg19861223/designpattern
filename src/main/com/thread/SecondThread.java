package main.com.thread;

public class SecondThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"second = " + i );
		}
	}

}
