package main.com.cloneable;

public class Test {

	public static void main(String[] args) {
		Zoon zoon =new Zoon("2","2");
		Cat cat= new Cat("2","4");
		
		ZoonImpl zoonImpl = new ZoonImpl();
		
		zoonImpl.println(zoon);
		zoonImpl.println(cat);
	}

}
