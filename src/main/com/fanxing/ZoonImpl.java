package main.com.fanxing;

public abstract class ZoonImpl<T> implements Zoon<T> {
	@Override
	public T selectT(T t){
		return t;   	
    };
}
