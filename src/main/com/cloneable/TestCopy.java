package main.com.cloneable;

import org.springframework.beans.BeanUtils;


public class TestCopy {
	public static void main(String[] args) {
		Cat cat= new Cat("2","4");
		Zoon zoon = cat;
		BeanUtils.copyProperties(zoon,cat);
		System.out.println(cat.getEys());
	}
}
