package main.com.thread;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	private Long taskNum;  
	  
	MyCallable(Long taskNum) {  
	   this.taskNum = taskNum;  
	}
	private static int number=0;
	  
	@Override
	public String call() throws Exception {  
	   System.out.println(">>>" + taskNum + "任务启动");  
	   Date dateTmp1 = new Date();  
	   Thread.sleep(1000);
	   for(int i=0 ; i < 5 ; i++){
		   number++;
	   }
	   Date dateTmp2 = new Date();  
	   long time = dateTmp2.getTime() - dateTmp1.getTime();  
	   System.out.println(">>>" + taskNum + "任务终止" + number);  
	   return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";  
	}  

}
