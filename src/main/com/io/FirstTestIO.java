package main.com.io;
import java.io.*;

public class FirstTestIO {
	public static void main(String[] args) {
		   createFile();
	}
	
	public static void createFile(){
		System.out.println("---begin---");
		FileOutputStream fileOutputStream = null;
		FileInputStream fileInputStream = null;
		File file = new File("F:/IO/first.txt");
		file.setReadOnly();
		file.setWritable(true);
		try {
			if(!file.exists()){
			file.createNewFile();
			}
			System.out.println("该分区大小"+file.getTotalSpace()/(1024*1024*1024)+"G"); //返回由此抽象路径名表示的文件或目录的名称。  
			file.mkdirs();  //创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。  
//            f.delete(); //  删除此抽象路径名表示的文件或目录  
            System.out.println("文件名  "+file.getName());  //  返回由此抽象路径名表示的文件或目录的名称。  
            System.out.println("文件父目录字符串 "+file.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。  
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
		    fileOutputStream = new FileOutputStream(file,true);//true表示追加
			String str= "nice to meet you";
			//写入文件
			fileOutputStream.write(str.getBytes());
			fileOutputStream = new FileOutputStream(new File("F:/IO/copyfirst.txt"));
			//读文件
			fileInputStream=new FileInputStream(file); 
			int ch=0;
			byte[] buffer=new byte[20];
			while((ch = fileInputStream.read(buffer)) != -1){
				fileOutputStream.write(buffer, 0, ch);
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				fileOutputStream.close();
				fileInputStream.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
}
}
