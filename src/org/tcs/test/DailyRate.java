package org.tcs.test;

public class DailyRate extends GoldPrice{
	
	@Override
	public void priceOfGold() {

		System.out.println("Gold rate is 20000");
	}
	
	@Override
	public void priceOfSilver() {
			System.out.println("Silver rate is 1500");
	}
	
	@Override
	public void petrolPrice() {
			System.out.println("Petrol price is 120");
	}
	
	
	@Override
	public void dieselPrice() {
		System.out.println("Diesel price is 95");
	}
	public static void main(String[] args) {
		
		DailyRate d = new DailyRate();
		d.priceOfGold();
		d.priceOfSilver();
		d.dieselPrice();
		d.petrolPrice();
	}
	
}
