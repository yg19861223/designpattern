package main.com.testjson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;

import main.com.core.ClassUtils;
import main.com.proxy.KindWomen;

public class TestString {
	public static int sumAll(int endInt){
		   if(endInt==1){
			   return 1;
		   }else{
			  return sumAll(endInt-1)+endInt;  
		   }
	   }
   public static void main(String[] args){
	   List<Class> list = ClassUtils.getAllClassByInterface(KindWomen.class);
	   for(Class c : list){
		   System.out.println(c.getName());
	   }
	   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   System.out.println(df.format(new Date()));
	   String str = "qwe$rtyu";
	   str = str.substring(0,str.indexOf("$"));
	   System.out.println(str);
	   double j = 1;
	   for(int i = 0;i<30;i++){
		   j = j * 0.9;
	   }
	   System.out.println(j);
   }
}
