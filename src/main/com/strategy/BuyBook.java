package main.com.strategy;

public class BuyBook implements IsWantToBuy {

	@Override
	public void toBuy() {
		System.out.println("I want to buy books.");

	}

}
