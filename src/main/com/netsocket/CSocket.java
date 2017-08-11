package main.com.netsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CSocket implements Runnable{
	
	PrintWriter printWriter;
	
	BufferedReader bufferedReader;
	
	Socket socket;
	
	public CSocket(Integer serverPort) throws IOException{
		socket = new Socket("192.168.3.8", serverPort);
		//输出流
    	printWriter = new PrintWriter(socket.getOutputStream(), true);
        //输入
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	public void run(){
      try {
            //socket.setSoTimeout(60000);
            String result = "";
            while (result.indexOf("bye") == -1) {
                //输出流
                BufferedReader sysBuff = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("C say : " + sysBuff.readLine());
                printWriter.println(sysBuff.readLine());
                printWriter.flush();
                //输入
                result = bufferedReader.readLine();
                System.out.println("S say : " + result);
            }
            printWriter.close();
            bufferedReader.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
	}
	public static void main(String[] args) throws IOException {
        new Thread(new CSocket(2017)).start();;
    }
}
