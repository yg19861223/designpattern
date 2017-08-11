package main.com.strategy;

public class IWantToBuy {
	public static void main(String[] args){
		BuyContest buyContest;
		buyContest = new BuyContest(new BuyBook());
		buyContest.toBuy();
	}
}
