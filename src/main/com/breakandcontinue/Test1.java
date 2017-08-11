package main.com.breakandcontinue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		String str = "asgasgdhhashsh";
		String [] strs = str.split("");
		Map<String , Integer> map = new HashMap<String , Integer>();
		for(String s : strs){
            if(map.get(s) == null){
            	map.put(s, 1);
            }else{
            	map.put(s, map.get(s)+1);;
            }
		}
		map = MapUtil.sortByValue(map);
		for (Map.Entry<String , Integer> entry : map.entrySet()) {  
			  
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());  
		  
		} 
		
	}
	//map排序
	public static class MapUtil  
	{  
	    public static <K, V extends Comparable<? super V>> Map<K, V>   
	        sortByValue( Map<K, V> map )  
	    {  
	        List<Map.Entry<K, V>> list =  
	            new LinkedList<Map.Entry<K, V>>( map.entrySet() );  
	        Collections.sort( list, new Comparator<Map.Entry<K, V>>()  
	        {  
	            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )  
	            {  
	                return (o1.getValue()).compareTo( o2.getValue() );  
	            }  
	        } );  
	  
	        Map<K, V> result = new LinkedHashMap<K, V>();  
	        for (Map.Entry<K, V> entry : list)  
	        {  
	            result.put( entry.getKey(), entry.getValue() );  
	        }  
	        return result;  
	    }  
	}

}
