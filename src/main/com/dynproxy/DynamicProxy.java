package main.com.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object subject;
	
	public DynamicProxy(Object subject){
		this.subject=subject;
	}
	
	@Override
	public Object invoke(Object object, Method method, Object[] args) throws Throwable {
		
		System.out.println("Method:" + method);
		
		//当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, args);
		
		return null;
	}

}
