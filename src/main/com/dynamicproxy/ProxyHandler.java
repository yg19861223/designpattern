package main.com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

	private Object proxied;
	
	public ProxyHandler(Object proxied) {
		this.proxied=proxied;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// 转调具体目标对象的方法
		return method.invoke(proxied, args);
	}

}
