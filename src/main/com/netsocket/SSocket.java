package main.com.netsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SSocket extends ServerSocket{
	public SSocket(Integer serverPort) throws IOException{
		super(serverPort);
		
		try{
			while(true){
				Socket socket = accept();
				new CreateServerThread(socket);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
		    close();
		}
	}
	
	class CreateServerThread extends Thread{
		private Socket client;
		
		private BufferedReader bufferedReader;
		
		private PrintWriter printWriter;
		
		String line = "";
		
		public CreateServerThread(Socket s) throws IOException{
			client = s;
			
			System.out.println("Client " + getName() + " come in");
			
			bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			printWriter = new PrintWriter(client.getOutputStream());
			
			line = bufferedReader.readLine();
			
            System.out.println("Client " + line);
			
			start();
		}
		
		public void run(){
			try{
				//输入流
				line = bufferedReader.readLine();
                while (!line.equals("bye")) {
                	System.out.println("Client " + getName() + " come in");
                    printWriter.println("continue, Client(" + getName() + ")!");
                    line = bufferedReader.readLine();
                    System.out.println("Client(" + getName() + ") say: " + line);
                }
                printWriter.println("bye, Client(" + getName() + ")!");

                System.out.println("Client(" + getName() + ") exit!");
                printWriter.close();
                bufferedReader.close();
                client.close();
            } catch (IOException e) {
            }
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
        new SSocket(2017);
    }
	

}
