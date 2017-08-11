package main.com.strategy;

public class BuyContest {
	
	@SuppressWarnings("unused")
	private IsWantToBuy toBuy;
	
	public BuyContest(IsWantToBuy toBuy){
		this.toBuy=toBuy;
	}
	
	public void toBuy(){
		this.toBuy.toBuy();
	}

}
