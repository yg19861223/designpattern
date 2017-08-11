package main.com.net;

import java.net.DatagramSocket;

public class SocketDemo {
    public static void main(String[] args) throws Exception {
    	//创建发送和接收服务的对象  
        DatagramSocket sendSocket = new DatagramSocket();  
        DatagramSocket receSocket = new DatagramSocket(10001);  
        //创建两个线程，同时执行  
        new Thread(new SendSocket(sendSocket)).start();  
        new Thread(new ReceSocket(receSocket)).start();  
	}
}
