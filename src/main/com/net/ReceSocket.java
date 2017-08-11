package main.com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceSocket implements Runnable {
	
	private DatagramSocket ds;
	
	public ReceSocket(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
	  try{
		  while(true){
			  byte[] by = new byte[1024];
			  DatagramPacket dp = new DatagramPacket(by, by.length);
			  ds.receive(dp);
			  String ip = dp.getAddress().getHostAddress();
			  String data = new String(dp.getData(),0,dp.getLength());
			  System.out.println(ip + ":" + data);
		  }
	  }catch(Exception e){
		  e.printStackTrace();
	  }

	}

}
