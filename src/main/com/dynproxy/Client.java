package main.com.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
  public static void main(String[] args){
	  Subject realSubject = new RealSubject();
	  
	  InvocationHandler handler = new DynamicProxy(realSubject);
	  
      Subject subject =(Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
      
      subject.rent();
      
      subject.hello("Proxy");
      
      realSubject.rent();
      
      realSubject.hello("11");
      
      System.exit(0);
  }
}
