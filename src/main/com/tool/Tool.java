package main.com.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tool {
	
	//校验字符串是否是数字
	public boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}


}
