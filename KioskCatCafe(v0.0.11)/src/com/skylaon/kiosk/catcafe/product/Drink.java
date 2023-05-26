package com.skylaon.kiosk.catcafe.product;

public class Drink extends Product{
	
	public Drink(String xx, int yy) {
		super(xx, yy);
		this.option = false;
	}
	public Drink(String xx, int yy, boolean option) {
		super(xx, yy);
		this.option = option;
	}
	
	public boolean option;
}
