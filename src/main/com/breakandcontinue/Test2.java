package main.com.breakandcontinue;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
	
	public <K, V extends Comparable<? super V>> Map<K, V> getMap(){
		Map<K, V> result = new LinkedHashMap<K, V>(); 
		return result;
	}

}
