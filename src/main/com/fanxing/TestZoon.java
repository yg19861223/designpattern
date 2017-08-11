package main.com.fanxing;

public class TestZoon {

	public static void main(String[] args) {
	   CatService catService = new CatServiceImpl();
	   Cat cat = catService.selectT(new Cat(4,4));
	   DogService dogService = new DogServiceImpl();
	   Dog dog = dogService.selectT(new Dog(4,4));
	   System.out.println(cat.getHead() + "  " + dog.getHead());
	   
	}

}
