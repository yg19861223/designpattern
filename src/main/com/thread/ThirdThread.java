package main.com.thread;

public class ThirdThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"third = " + i );
		}
	}

}
