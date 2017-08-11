package main.com.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	public static void main(String[] args) {
		Subject real = new RealSubject();
		InvocationHandler invocationHandler = new ProxyHandler(real); 
		Subject proxySubject= (Subject)Proxy.newProxyInstance(
				Subject.class.getClassLoader(),
				new Class[]{Subject.class},
				invocationHandler);
		proxySubject.doSomething();
//		createProxyClassFile();   
//	  }   
//	     
//	  public static void createProxyClassFile()   
//	  {   
//	    String name = "ProxySubject";   
//	    byte[] data = ProxyGenerator.generateProxyClass( name, new Class[] { Subject.class } );   
//	    try  
//	    {   
//	      FileOutputStream out = new FileOutputStream( name + ".class" );   
//	      out.write( data );   
//	      out.close();   
//	    }   
//	    catch( Exception e )   
//	    {   
//	      e.printStackTrace();   
//	    }   
	  }   
	}  