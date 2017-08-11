package main.com.testjson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMap {
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> map= new HashMap<String,Object>();
		String suig = "{\"suiguo\":{\"apple\":2,\"pear\":3}}";
		map = mapper.readValue(suig, new TypeReference<HashMap<String, Object>>(){});
		System.out.println(map.get("suiguo"));
	}
}
