package main.com.core;

public class Test {
  public static void main(String[] args){
  String str= "";
  try{
  for(int i=1;i>0;i++){
	  str = str + i;
	  System.out.println(i);
  }
  }catch(Exception e){
	  e.printStackTrace();
  }
  }
}
