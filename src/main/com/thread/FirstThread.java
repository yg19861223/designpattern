package main.com.thread;

import java.util.Random;

public class FirstThread implements Runnable {
	Integer it = null;
	private final static ThreadLocal tdit = new ThreadLocal();
	
	protected Integer getCloneInt() {
        //获取本地线程变量并强制转换为Student类型
		it = (Integer) tdit.get();
        //线程首次执行此方法的时候，studentLocal.get()肯定为null
        if (it == null) {
            //创建一个Student对象，并保存到本地线程变量studentLocal中
        	it = new Integer(0);
        	tdit.set(it);
        }
        return it;
    }

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			Random random = new Random();
			it = getCloneInt();
			System.out.println(Thread.currentThread().getName()+"first = " + it );
			it = random.nextInt(100);
			System.out.println(Thread.currentThread().getName()+"last = " + it );
			try {
	            Thread.sleep(500);
	        }
	        catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
		}

	}

}
