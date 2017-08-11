package main.com.net;

import java.net.InetAddress;

public class FitstNetTest {
   public static void main(String[] args) throws Exception{
	InetAddress ia = InetAddress.getLocalHost();
	System.out.println(ia.toString());
	InetAddress baiduIp = InetAddress.getByName("www.baidu.com");
	System.out.println(baiduIp.getHostAddress());
	System.out.println(baiduIp.getHostName());
	String str = baiduIp.getHostAddress();
	String[] ipStr = str.split("\\.");
	byte[] ipBuf = new byte[4];
	for(int i = 0;i<4;i++){
		ipBuf[i]=(byte)(Integer.parseInt(ipStr[i]));
	}
	baiduIp = InetAddress.getByAddress(ipBuf);
	System.out.println(baiduIp.getHostAddress());
	System.out.println(baiduIp.getHostName());
	
}
}
