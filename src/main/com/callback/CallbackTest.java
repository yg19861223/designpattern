package main.com.callback;

import java.util.ArrayList;
import java.util.List;

public class CallbackTest {

	public static void main(String[] args) {
		//new Caller(new CallbackServiceImpl()).call();
		List<String> list = new ArrayList<String>();
		list.add("fsfs");
		list.add("abc");
		list.add("ffdes");
		System.out.println(list.contains("abc"));
	}

}
