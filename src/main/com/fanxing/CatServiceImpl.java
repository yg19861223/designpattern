package main.com.fanxing;

public class CatServiceImpl extends ZoonImpl<Cat> implements CatService {

	@Override
	public Cat selectT(Cat t) {
        t.setFoot(10);
        t.setHead(10);
		return t;
	}

}
