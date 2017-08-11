package main.com.cloneable;

public class Cat extends Zoon{
	public Cat(String eys, String mouth) {
		super(eys, mouth);
	}

	private String foot;

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}
	
}
