package main.com.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendSocket implements Runnable {
	
	private DatagramSocket ds;
	
	public SendSocket(DatagramSocket ds){
		this.ds = ds;
	}

	@Override
	public void run() {
		try{
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = bufr.readLine()) != null){
				if("886".equals(line))
					break;
				byte[] b = line.getBytes();
				
				DatagramPacket dp = new DatagramPacket(b, b.length,InetAddress.getByName("192.168.3.8"),10001);
				
				ds.send(dp);
			}
			ds.close();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("发送失败");
		}

	}

}
